//Program 5
class MathUtility {
    // Static method
    public static int add(int a, int b) {
        return a + b;
    }

    // Non-static method
    public int multiply(int a, int b) {
        return a * b;
    }
}

public class MathUtilityDemo {
    public static void main(String[] args) {
        // Call static method directly using class name
        int sum = MathUtility.add(5, 3);
        System.out.println("Sum: " + sum);

        // Call non-static method using an object
        MathUtility util = new MathUtility();
        int product = util.multiply(5, 3);
        System.out.println("Product: " + product);
    }
}