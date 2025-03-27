import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Class responsible for communication with user
class InsuranceManager {
    private List<InsuredPerson> insuredPeople = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    //Constructor of adding insured person
    public void addInsuredPerson() {
        System.out.print("Name: ");
        String firstName = scanner.nextLine().trim();
        System.out.print("Surname: ");
        String lastName = scanner.nextLine().trim();
        System.out.print("Age: ");
        int age;
        try {
            age = Integer.parseInt(scanner.nextLine().trim());

            //Ensures that user do not use non-numeric value for age

        } catch (NumberFormatException e) {
            System.out.println("Invalid input.");
            return;
        }
        System.out.print("Phone number: ");
        String phoneNumber = scanner.nextLine().trim();

        try {
            insuredPeople.add(new InsuredPerson(firstName, lastName, age, phoneNumber));
            System.out.println("Insured successfully added .");

            //Handles invalid input when creating an InsuredPerson

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    //Constructor responsible for creating a list of insured people.

    public void displayAllInsured() {
        if (insuredPeople.isEmpty()) {
            System.out.println("There are no insured recorded.");
            return;
        }
        System.out.println("\nList of insured:");
        for (InsuredPerson person : insuredPeople) {
            System.out.println(person);
        }
    }

    //Constructor responsible for searching insured in ArrayList

    public void searchInsuredPerson() {
        System.out.print("Enter name to search: ");
        String firstName = scanner.nextLine().trim();
        System.out.print("Enter surname to search: ");
        String lastName = scanner.nextLine().trim();

        boolean found = false;
        for (InsuredPerson person : insuredPeople) {
            //Catches possible mistakes of user entering a name adn surname when searching an insured
            if (person.getFirstName().equalsIgnoreCase(firstName) && person.getLastName().equalsIgnoreCase(lastName)) {
                System.out.println(person);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Insured has not been found.");
        }
    }
}
