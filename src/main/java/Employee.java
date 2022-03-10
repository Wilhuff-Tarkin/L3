import java.math.BigDecimal;

public class Employee implements ConsoleFormatting {

    private String firstName;
    private String surname;
    private BigDecimal salary;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        if (salary.compareTo(BigDecimal.ZERO) > 0) {
            this.salary = salary;
        } else {
            System.out.println(ANSI_RED + "Setting up as zero" + ANSI_RESET);
            this.salary = BigDecimal.ZERO;
        }
    }

    public void getAllData() {
        System.out.println("Salary for " + this.getFirstName() + " " + this.getSurname() + " is " + ANSI_GREEN + this.getSalary() + ANSI_RESET);
    }
}