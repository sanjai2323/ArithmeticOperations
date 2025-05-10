public class Arithmetic {
    public static void main(String args[]) {
        int a = 20;
        int b = 5;
        
        System.out.println("Basic Arithmetic Operation");
        System.out.println("Addition");
        int c = a + b;
        System.out.println("Sum = " + c);
        
        System.out.println("Subtraction");
        int d = a - b;
        System.out.println("Difference = " + d);
        
        System.out.println("Multiplication");
        int m = a * b;
        System.out.println("Product = " + m);
        
        System.out.println("Division");
        int q = a / b;
        System.out.println("Quotient = " + q);
        
        // Call the TESTCase class
        System.out.println("\nRunning Tests using TESTCase...");
        TESTCase.main(new String[]{}); // Call the main method of TESTCase
    }
}