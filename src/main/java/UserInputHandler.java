import java.math.BigDecimal;
import java.util.Scanner;

public abstract class UserInputHandler implements ConsoleFormatting {


    public static void askForInitialData(int numberOfInitialEmployees) {
        System.out.println(ANSI_YELLOW + "Please insert data for " + numberOfInitialEmployees + " initial employees." + ANSI_RESET);
    }

    public static void printIncorrectInputNotification() {
        ConsoleFormatting.printInRed("This seems to be incorrect..");
    }

    private static void askUserFor(String askingFor, int employeeNumber) {
        System.out.println("Please insert " + PURPLE_BOLD + askingFor + ANSI_RESET + " for employee nr " + ANSI_YELLOW + employeeNumber + ANSI_RESET);
    }

    public static Employee getEmployee(Company company) {
        askUserFor("first name", company.getNumberOfEmployees() + 1);
        String name = getStringFromUser();
        askUserFor("surname", company.getNumberOfEmployees() + 1);
        String surname = getStringFromUser();
        askUserFor("salary", company.getNumberOfEmployees() + 1);
        int salary = getSalaryFromUser();

        return new Employee(name, surname, BigDecimal.valueOf(salary));
    }

    private static String getStringFromUser() {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNext("[a-zA-Z]+")) {
            printIncorrectInputNotification();
            scanner.next();
        }
        return scanner.next();
    }

    private static int getSalaryFromUser() {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            printIncorrectInputNotification();
            scanner.next();
        }
        return scanner.nextInt();
    }
}



