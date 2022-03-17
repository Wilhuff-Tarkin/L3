import java.util.ArrayList;

public class Main {

    final static int numberOfInitialEmployees = 1;

    public static void main(String[] args) {
        Company company = new Company(new ArrayList<>());
        UserInputHandler.askForInitialData(numberOfInitialEmployees);

        for (int i = 1; i <= numberOfInitialEmployees; i++) {
            company.addEmployee(UserInputHandler.getEmployee(company));
        }
        Operations.mainMenu(company);
    }
}
