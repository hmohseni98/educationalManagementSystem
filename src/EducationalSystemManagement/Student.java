package EducationalSystemManagement;

public class Student extends Person {
    private String studentCode;
    public Student(String nationalCode, String firstName, String lastName, String studentCode) {
        super(nationalCode, firstName, lastName);
        this.studentCode = studentCode;
    }

    public String getStudentCode() {
        return studentCode;
    }
}
