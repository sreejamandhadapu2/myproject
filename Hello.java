public class Hello{

    public static void main(String[] args) {
        // Simple "Hello, World!" program
        System.out.println("Hello, World!");

        // Example using variables and basic arithmetic
        int num1 = 10;
        int num2 = 5;
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        double quotient = (double) num1 / num2; // Cast to double for accurate division

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

        // Example using a loop
        for (int i = 0; i < 5; i++) {
            System.out.println("Loop iteration: " + i);
        }

        // Example using an if statement
        if (num1 > num2) {
            System.out.println("num1 is greater than num2");
        } else if (num1 < num2) {
            System.out.println("num1 is less than num2");
        } else {
            System.out.println("num1 is equal to num2");
        }

        // Example using an array
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("First element of the array: " + numbers[0]);

        //Example using a String
        String myString = "This is my string.";
        System.out.println(myString);
        System.out.println("Length of string: "+myString.length());
        System.out.println("Uppercase: "+myString.toUpperCase());

    }
}