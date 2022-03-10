import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class Company implements ConsoleFormatting {

    Scanner scanner = new Scanner(System.in);
    private final ArrayList<Employee> employees;

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

    public void addEmployee() {
        int nextEmployeeNr = employees.size() + 1;
        Employee employee = new Employee();

        askUserFor("first name", nextEmployeeNr);
        validateInputAsString();
        employee.setFirstName(scanner.next());

        askUserFor("surname", nextEmployeeNr);
        validateInputAsString();
        employee.setSurname(scanner.next());

        askUserFor("salary", nextEmployeeNr);
        validateInputAsInt();
        employee.setSalary(BigDecimal.valueOf(scanner.nextInt()));

        employees.add(employee);
        System.out.println("Employee nr " + ANSI_YELLOW + nextEmployeeNr + ANSI_RESET + " added.");
        System.out.println();
    }

    private void validateInputAsInt() {

        while (!scanner.hasNextInt())  {
            incorrectInputNotification();
            scanner.next();
        }
    }

    private void validateInputAsString() {
        while (!scanner.hasNext("[a-zA-Z]+")) {
            incorrectInputNotification();
            scanner.next();
        }
    }

    private void askUserFor(String askingFor, int employeeNumber) {
        System.out.println("Please insert " + PURPLE_BOLD + askingFor + ANSI_RESET + " for employee nr " + ANSI_YELLOW + employeeNumber + ANSI_RESET);
    }

    public void printSumOfSalaries() {
        System.out.println(YELLOW_UNDERLINED + "Printing sum of salaries..." + ANSI_RESET);
        System.out.println("Sum of salaries for your company of " + ANSI_GREEN + employees.size() + ANSI_RESET + " employee(s): " + GREEN_UNDERLINED + getAllSalaries() + ANSI_RESET);
    }

    public void printDataOfAllEmployees() {
        System.out.println(YELLOW_UNDERLINED + "Printing data for your employees:" + ANSI_RESET);
        int listOrder = 1;
        for (Employee e : employees) {
            System.out.print(ANSI_YELLOW + listOrder + ANSI_RESET + " ");
            e.getAllData();
            listOrder++;
        }
    }

    public static void incorrectInputNotification() {
        System.out.println(ANSI_RED + "Sorry, this data seems to be incorrect. Please try again." + ANSI_RESET);
    }
}

