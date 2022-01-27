package Entity;

public class Employee extends Person{
    private String id;
    private Long income;

    public Employee(String nationalCode, String firstName, String lastName, String id, Long income) {
        super(nationalCode, firstName, lastName);
        this.id = id;
        this.income = income;
    }
}
