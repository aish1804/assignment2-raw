package RefactoringDesignPatterns.Assignment2;

public class Restaurant {
    protected final String food;
    protected boolean foodReady = false;

    public Restaurant(String food) {
        this.food = food;
    }

    public boolean isFoodReady() {
        return foodReady;
    }
}
