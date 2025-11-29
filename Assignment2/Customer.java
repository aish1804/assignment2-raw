package RefactoringDesignPatterns.Assignment2;

public class Customer {
    private final String name;
    private final String email;
    private final Phone phoneNumber;

    public Customer(String name, String email, Phone phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Phone getPhoneNumber() {
        return phoneNumber;
    }

    public void eat() {
        System.out.println("Eating... ...!");
    }
}
