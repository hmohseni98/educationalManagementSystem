package EducationalSystemManagement;

public class TeacherList {
    private Teacher[] teachers;
    private int emptyIndex = 0;
    private int saveIndex;

    public TeacherList(int count) {
        this.teachers = new Teacher[count];
    }

    public void add(Teacher teacher) {
        teachers[emptyIndex] = teacher;
        emptyIndex++;
    }

    public int searchByNationalCode(String nationalCode) {
        for (int i = 0; i < emptyIndex; i++) {
            if (teachers[i].getNationalCode().equals(nationalCode))
                return i;
        }
        return -1;
    }

    public Teacher searchByNationalCodeReturnTeacher(String nationalCode) {
        for (int i = 0; i < emptyIndex; i++) {
            if (teachers[i].getNationalCode().equals(nationalCode))
                return teachers[i];
        }
        return null;
    }

    public void remove(String nationalCode) {
        if (emptyIndex != 0) {
            saveIndex = searchByNationalCode(nationalCode);
            if (saveIndex >= 0) {
                for (int j = saveIndex; j < emptyIndex - 1; j++) {
                    teachers[j] = teachers[j + 1];
                }
                emptyIndex--;
            }
        }
    }

    public void edit(String nationalCode, String firstName, String lastName, String typeOfEmployment) {
        if (emptyIndex != 0) {
            saveIndex = searchByNationalCode(nationalCode);
            if (saveIndex >= 0) {
                teachers[saveIndex].setFirstName(firstName);
                teachers[saveIndex].setLastName(lastName);
                teachers[saveIndex].setTypeOfEmployment(typeOfEmployment);

            }
        }
    }
    public void show(String nationalCode) {
        if (emptyIndex != 0) {
            saveIndex = searchByNationalCode(nationalCode);
            System.out.println("NationalCode: " + teachers[saveIndex].getNationalCode() + "   " +
                    "TypeOfEmployment:" + teachers[saveIndex].getTypeOfEmployment() + "   " +
                    "FirstName:" + teachers[saveIndex].getFirstName() + "   " +
                    "LastName:" + teachers[saveIndex].getLastName());
        }
    }
}