package Entity;

public class Person {
    private String nationalCode;
    private String firstName;
    private String lastName;

    public Person(String nationalCode, String firstName, String lastName) {
        this.nationalCode = nationalCode;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
