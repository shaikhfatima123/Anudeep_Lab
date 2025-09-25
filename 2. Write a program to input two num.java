 2. Write a program to input two numbers and find the maximum between two numbers using the conditional/ternary operator. Sample Input: num1 = 10 num2 = 30

   code:

        import java.util.Scanner;

         public class MaxOfTwo {
         public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number (num1): ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number (num2): ");
        int num2 = sc.nextInt();

        // Use ternary operator to find maximum
        int max = (num1 > num2) ? num1 : num2;

        // Output the result
        System.out.println("Maximum number is: " + max);
    }
}
Output:

Enter first number (num1): 10
Enter second number (num2): 30
 Maximum number is: 30




