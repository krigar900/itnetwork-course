
//Class responsible for storing an insured person and its credentials.

class InsuredPerson {
    private String firstName;
    private String lastName;
    private int age;
    private String phoneNumber;

    public InsuredPerson(String firstName, String lastName, int age, String phoneNumber) {

        //Validates if firstName and lastName are not empty or null.

        if (firstName == null || firstName.trim().isEmpty() || lastName == null || lastName.trim().isEmpty()) {
            throw new IllegalArgumentException("Name and Surname cannot be empty.");
        }

        //Ensures that age is a positive number

        if (age <= 0) {
            throw new IllegalArgumentException("Age has to be a positive number.");
        }

        //Checks if a phone number si not empty or null

        if (phoneNumber == null || phoneNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("Phone number cannot be empty.");
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    // Console output for insured person

    @Override
    public String toString() {
        return firstName + " " + lastName + ", age: " + age + ", tel: " + phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}