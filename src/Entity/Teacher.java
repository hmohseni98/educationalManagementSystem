package Entity;

public class Teacher extends Person {
    private String typeOfEmployment;
    private Long income;
    public Teacher(String nationalCode, String firstName, String lastName,String typeOfEmployment, Long income) {
        super(nationalCode, firstName, lastName);
        this.typeOfEmployment = typeOfEmployment;
        this.income = income;
    }

    public String getTypeOfEmployment() {
        return typeOfEmployment;
    }

    public void setTypeOfEmployment(String typeOfEmployment) {
        this.typeOfEmployment = typeOfEmployment;
    }
}
