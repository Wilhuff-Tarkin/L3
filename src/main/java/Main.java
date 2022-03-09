import java.util.ArrayList;

public class Main implements ConsoleFormatting {

final static int numberOfInitialEmployees = 1;

    public static void main(String[] args) {
        Company company = new Company(new ArrayList<>());

        System.out.println(ANSI_YELLOW + "Please insert data for " + numberOfInitialEmployees + " initial employees." + ANSI_RESET);

        for (int i = 1; i <= numberOfInitialEmployees; i++) {
            company.addEmployee();
        }
        Operations.mainMenu(company);
    }
}
