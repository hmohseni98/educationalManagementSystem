package EducationalSystemManagement;

public class StudentList {
    private Student[] students;
    private int emptyIndex = 0;
    private int saveIndex;

    public StudentList(int count) {
        this.students = new Student[count];
    }

    public void add(Student student) {
        students[emptyIndex] = student;
        emptyIndex++;
    }

    public int searchByNationalCode(String nationalCode) {
        for (int i = 0; i < emptyIndex; i++) {
            if (students[i].getNationalCode().equals(nationalCode))
                return i;
        }
        return -1;
    }
    public Student searchByNationalCodeReturnStudent(String nationalCode) {
        for (int i = 0; i < emptyIndex; i++) {
            if (students[i].getNationalCode().equals(nationalCode))
                return students[i];
        }
        return null;
    }

    public void remove(String nationalCode) {
        if (emptyIndex != 0) {
            saveIndex = searchByNationalCode(nationalCode);
            if (saveIndex >= 0) {
                for (int j = saveIndex; j < emptyIndex - 1; j++) {
                    students[j] = students[j + 1];
                }
                emptyIndex--;
            }
        }
    }

    public void edit(String nationalCode, String firstName, String lastName) {
        if (emptyIndex != 0) {
            saveIndex = searchByNationalCode(nationalCode);
            if (saveIndex >= 0) {
                students[saveIndex].setFirstName(firstName);
                students[saveIndex].setLastName(lastName);
            }
        }
    }
    public void show(String nationalCode) {
        if (emptyIndex != 0) {
            saveIndex = searchByNationalCode(nationalCode);
            System.out.println("NationalCode: " + students[saveIndex].getNationalCode() + "   " +
                    "StudentCode:" + students[saveIndex].getStudentCode() + "   " +
                    "FirstName:" + students[saveIndex].getFirstName() + "   " +
                    "LastName:" + students[saveIndex].getLastName());
        }
    }
}
