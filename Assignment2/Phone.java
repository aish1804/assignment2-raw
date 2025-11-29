package RefactoringDesignPatterns.Assignment2;

public class Phone {
    private final int areaCode;
    private final int number;

    public Phone(int areaCode, int number) {
        this.areaCode = areaCode;
        this.number = number;
    }

    public int getAreaCode() {
        return areaCode;
    }

    public int getNumber() {
        return number;
    }
}
