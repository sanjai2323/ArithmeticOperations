public class TESTCase {
    public static void main(String[] args) {
        // Test values
        int a = 20;
        int b = 5;

        // Expected results
        int expectedSum = 25;
        int expectedDifference = 15;
        int expectedProduct = 100;
        int expectedQuotient = 4;

        // Test Addition
        int actualSum = a + b;
        assert actualSum == expectedSum : "Test Failed: Addition. Expected " + expectedSum + " but got " + actualSum;
        System.out.println("Test Passed: Addition");

        // Test Subtraction
        int actualDifference = a - b;
        assert actualDifference == expectedDifference : "Test Failed: Subtraction. Expected " + expectedDifference + " but got " + actualDifference;
        System.out.println("Test Passed: Subtraction");

        // Test Multiplication
        int actualProduct = a * b;
        assert actualProduct == expectedProduct : "Test Failed: Multiplication. Expected " + expectedProduct + " but got " + actualProduct;
        System.out.println("Test Passed: Multiplication");

        // Test Division
        int actualQuotient = a / b;
        assert actualQuotient == expectedQuotient : "Test Failed: Division. Expected " + expectedQuotient + " but got " + actualQuotient;
        System.out.println("Test Passed: Division");
    }
}