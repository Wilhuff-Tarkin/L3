import java.util.Scanner;

public abstract class Operations implements ConsoleFormatting {

    public static void mainMenu(Company company) {
        printOptions();
        int userChoice = validateInput();

        switch (userChoice) {
            case 1:
                company.printSumOfSalaries();
                mainMenu(company);
                break;
            case 2:
                company.printDataOfAllEmployees();
                mainMenu(company);
                break;
            case 3:
                company.addEmployee(UserInputHandler.getEmployee(company));
                mainMenu(company);
                break;
            case 4:
                System.out.println(ANSI_YELLOW + "Bye, bye." + ANSI_RESET);
                return;
            default: {
                System.out.println(ANSI_RED + "Sorry, this data seems to be incorrect. Please try again." + ANSI_RESET);
            }
        }
    }

    private static int validateInput() {
        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNext("[1-4]")) {
            System.out.println(ANSI_RED + "Please stick to options: 1, 2, 3 or 4" + ANSI_RESET);
            scanner.next();
        }
        return scanner.nextInt();
    }

    private static void printOptions() {
        System.out.println("\n");
        System.out.println(YELLOW_UNDERLINED + "WELCOME TO EMPLOYEE MANAGEMENT SYSTEM" + ANSI_RESET);
        System.out.println("Please choose one from following options:");
        System.out.println("\n");
        System.out.println(ANSI_GREEN + "1" + ANSI_RESET + " Print sum of all employees salaries.");
        System.out.println(ANSI_GREEN + "2" + ANSI_RESET + " Display all employees data.");
        System.out.println(ANSI_GREEN + "3" + ANSI_RESET + " Add new employee.");
        System.out.println(ANSI_GREEN + "4" + ANSI_RESET + " End program.");
    }
}
