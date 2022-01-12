package EducationalSystemManagement;

public class EmployeeList {
    private Employee[] employees;
    private int emptyIndex = 0;
    private int saveIndex;

    public EmployeeList(int count) {

        this.employees = new Employee[count];
    }

    public void add(Employee employee) {
        employees[emptyIndex] = employee;
        emptyIndex++;
    }

    public int searchByNationalCode(String nationalCode) {
        if (emptyIndex != 0) {
            for (int i = 0; i < emptyIndex; i++) {
                if (employees[i].getNationalCode().equals(nationalCode))
                    return i;
            }
        }
        return -1;
    }
    public void remove(String nationalCode) {
        if (emptyIndex != 0) {
            saveIndex = searchByNationalCode(nationalCode);
            if (saveIndex >= 0) {
                for (int j = saveIndex; j < emptyIndex - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                emptyIndex--;
            }
        }
    }

    public void edit(String nationalCode, String firstName, String lastName) {
        if (emptyIndex != 0) {
            saveIndex = searchByNationalCode(nationalCode);
            if (saveIndex >= 0) {
                employees[saveIndex].setFirstName(firstName);
                employees[saveIndex].setLastName(lastName);
            }
        }
    }
}
