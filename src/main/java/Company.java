import java.math.BigDecimal;
import java.util.ArrayList;

public class Company {

    private ArrayList<Employee> employees;

    public Company(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public BigDecimal getAllSalaries() {
        BigDecimal salaries = BigDecimal.valueOf(0);
        for (Employee employee : employees) {
            salaries = salaries.add((employee.getSalary()));
        }
        return salaries;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public int getNumberOfEmployees() {
        return employees.size();
    }

    public void printSumOfSalaries() {
        ConsoleFormatting.printInYellow("Printing sum of salaries...");
        System.out.println("Sum of salaries for your company of " + employees.size() + " employee(s): " + getAllSalaries());
    }

    public void printDataOfAllEmployees() {
        ConsoleFormatting.printInYellow("Printing data for your employees:");
        int listOrder = 1;
        for (Employee e : employees) {
            System.out.print(listOrder + " ");
            e.getAllData();
            listOrder++;
        }
    }
}

