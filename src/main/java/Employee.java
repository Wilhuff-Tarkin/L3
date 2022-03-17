import java.math.BigDecimal;

public class Employee {

    private final String firstName;
    private final String surname;
    private final BigDecimal salary;

    public Employee(String firstName, String surname, BigDecimal salary) {
        this.firstName = firstName;
        this.surname = surname;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void getAllData() {
        System.out.println("Salary for " + this.getFirstName() + " " + this.getSurname() + " is " + this.getSalary());
    }
}