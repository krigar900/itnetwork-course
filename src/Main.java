import java.util.*;

// Entry point of the application, responsible for user interaction and menu navigation.

class Main {
    public static void main(String[] args) {
        InsuranceManager manager = new InsuranceManager();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Add insured person");
            System.out.println("2. Show all insured people");
            System.out.println("3. Search insured person");
            System.out.println("4. End");
            System.out.print("Choose option: ");

            //Switch used for options in main menu.

            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    manager.addInsuredPerson();
                    break;
                case "2":
                    manager.displayAllInsured();
                    break;
                case "3":
                    manager.searchInsuredPerson();
                    break;
                case "4":
                    return;
                default:
                    System.out.println("Invalid selection, try again.");
                    break;
            }
        }
    }
}