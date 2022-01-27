package Entity;

import List.*;

import java.util.Random;

public class University {
    private Random random = new Random();
    private StudentList studentList;
    private TeacherList teacherList;
    private EmployeeList employeeList;
    private LessonList lessonList;
    private PresentingLessonsList presentingLessonsList;
    private LessonScoresList lessonScoresList;
    private EducationalBackgroundList educationalBackgroundList;
    private SelectUnitList selectUnitList;
    private UserRegisterList userRegisterList;
    private Salary salary;
    public University() {
        studentList = new StudentList(1000);
        teacherList = new TeacherList(100);
        employeeList = new EmployeeList(100);
        lessonList = new LessonList(100);
        presentingLessonsList = new PresentingLessonsList(100);
        lessonScoresList = new LessonScoresList(10000);
        educationalBackgroundList = new EducationalBackgroundList(1000);
        selectUnitList = new SelectUnitList(10000);
        userRegisterList = new UserRegisterList(1000);
        salary = new Salary();
    }


    public boolean checkUserLogin(String type , String username , String password){
        if (type.equals("employee") && username.equals("admin") && password.equals("admin"))
            return true;
        else
            return userRegisterList.checkUserLogin(type,username,password);
    }
    public void addUser(String type,String username,String password){
        UserRegister newUser = new UserRegister(type,username,password);
        userRegisterList.add(newUser);
    }
    // آیا نباید رجیستر استودنت به عنوان یک متد در کلاس یوزر تعریف شود؟
    public void addStudent(String nationalCode, String firstName, String lastName){
        int studentCode = random.nextInt(100000);//10000,100000
        Student newStudent = new Student(nationalCode,firstName,lastName,String.valueOf(studentCode));
        studentList.add(newStudent);
    }
    public void removeStudent(String nationalCode){

        studentList.remove(nationalCode);
    }
   public void editStudent(String nationalCode,String firstName,String lastName){
        studentList.edit(nationalCode,firstName,lastName);
    }
    public void addTeacher(String nationalCode, String firstName, String lastName , String typeOfEmployment){
        int teacherId = random.nextInt(1200);//1000,1200
        Long income = salary.calcScienceCommitteeSalary(10) ;//****************تعداد واحد*******
        Teacher newTeacher = new Teacher(nationalCode,firstName,lastName,String.valueOf(teacherId),typeOfEmployment, income);
        teacherList.add(newTeacher);
    }
    public void removeTeacher(String nationalCode){
        teacherList.remove(nationalCode);
    }
    public void editTeacher(String nationalCode,String firstName,String lastName,String typeOfEmployment){
        teacherList.edit(nationalCode,firstName,lastName,typeOfEmployment);
    }
    public void addEmployee(String nationalCode, String firstName, String lastName){
        int employeeId = random.nextInt(1400);//1201,1400
        Long income = salary.calcEmployeeSalary();
        Employee newEmployee = new Employee(nationalCode,firstName,lastName,String.valueOf(employeeId),income);
        employeeList.add(newEmployee);
    }
    public void removeEmployee(String nationalCode){
        employeeList.remove(nationalCode);
    }
    public void editEmployee(String nationalCode,String firstName,String lastName){
        employeeList.edit(nationalCode,firstName,lastName);
    }
    public void addLesson(String name, int numberOfUnit){
        int lessonId = random.nextInt(800);//800
        Lesson newLesson = new Lesson(String.valueOf(lessonId),name,numberOfUnit);
        lessonList.add(newLesson);
    }
    public void removeLesson(String name){
        lessonList.remove(name);
    }
    public void editLesson(String id, String name ,int numberOfUnit){
        lessonList.edit(id,name,numberOfUnit);
    }
    public Long calcEmployeeSalary(String nationalCode){
        return salary.calcEmployeeSalary();
    }
    public void addPresentingLessons(String years,String term,String lessonName, String teacherNationalCode){
        int presentationId = random.nextInt(200);
        PresentingLesson newPresentingLesson = new PresentingLesson(String.valueOf(presentationId),years,term,
                lessonList.searchByNameReturnLesson(lessonName),
                teacherList.searchByNationalCodeReturnTeacher(teacherNationalCode));
        presentingLessonsList.add(newPresentingLesson);
    }
    public void showStudent(String nationalCode){
        studentList.show(nationalCode);
    }
    public void showLessons(){
        lessonList.show();
    }
    public void addLessonScores(String year,String term,String lessonName,String nationalCodeStudent, float score){
        LessonScores newLessonScores = new LessonScores(year,term,
                lessonList.searchByNameReturnLesson(lessonName),
                studentList.searchByNationalCodeReturnStudent(nationalCodeStudent),
                score);
        lessonScoresList.add(newLessonScores);
    }
    public void addEducationalBackground(String year,String term,String nationalCodeStudent){
       EducationalBackground newEducationalBackground = new EducationalBackground(year,term,
               studentList.searchByNationalCodeReturnStudent(nationalCodeStudent),
               lessonScoresList.totalAvgByNationalCode(nationalCodeStudent,year,term));
       educationalBackgroundList.add(newEducationalBackground);
    }
    public void addSelectUnit(String year, String term,String nationalCodeStudent,String lessonName){
        SelectUnit newSelectUnit = new SelectUnit(year,term,
                studentList.searchByNationalCodeReturnStudent(nationalCodeStudent),
                lessonList.searchByNameReturnLesson(lessonName),
                lessonScoresList.searchByNameReturnLessonScores(nationalCodeStudent));
        selectUnitList.add(newSelectUnit);
    }
    public void searchByNationalCodeForLessonList(String studentNationalCode){ // لیست درس ها رو بر اساس کد ملی دانشجو میده
        selectUnitList.showLessonByNationalCode(studentNationalCode);
    }
    public void showTeacher(String nationalCode){
        teacherList.show(nationalCode);
    }
    public Long calcScienceCommitteeSalary(String year,String term,String nationalCode){
        int result = presentingLessonsList.search(year,term,nationalCode);
        return salary.calcScienceCommitteeSalary(result);
    }
    public Long calcTuitionSalary(String year,String term,String nationalCode){
        int result = presentingLessonsList.search(year,term,nationalCode);
        return salary.calcTuitionSalary(result);
    }
}
