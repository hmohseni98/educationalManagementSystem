package Entity;

public class Employee extends Person{
    private Long income;
    public Employee(String nationalCode,String firstName,String lastName,Long income){
        super(nationalCode,firstName,lastName);
        this.income = income;
    }
}
