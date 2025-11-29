package RefactoringDesignPatterns.Assignment2;

import java.util.ArrayList;
import java.util.List;

public class ErieFamousRestaurant extends Restaurant {
    private final List<Customer> customers = new ArrayList<>();

    public ErieFamousRestaurant(String food) {
        super(food);
    }

    public void prepareFood() throws InterruptedException {
        System.out.println("Processing food...");
        Thread.sleep(5000);
        this.foodReady = true;
        System.out.println("Food is ready!");
    }

    public void seatIn(Customer customer) {
        customers.add(customer);
    }
}
