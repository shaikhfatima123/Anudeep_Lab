3. Write a program to check whether a number is a Strong number or not.
 Strong number is a special number whose sum of factorial of digits is equal to the
 original number.
 For example: 145 is a strong number. Since, 1! + 4! + 5! = 145
 [Hint: conditional operator,method,use parameterized method to take input]
 Sample Input 1:
 145

code:
import java.util.Scanner;

public class StrongNumberChecker {

    // Method to calculate factorial
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Parameterized method to check if number is Strong
    static void checkStrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }

        // Using ternary operator to check and print result
        String result = (sum == originalNumber) ? 
            originalNumber + " is a Strong number." : 
            originalNumber + " is not a Strong number.";

        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a number to check if it's a Strong number: ");
        int inputNumber = sc.nextInt();

        // Call the method with input
        checkStrongNumber(inputNumber);
    }
}

  Output:
        Enter a number to check if it's a Strong number: 145
        145 is a Strong number.


  
