import java.util.Scanner;

public class Calculator {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.println("Enter first number:");
      double num1 = input.nextDouble();

      System.out.println("Enter second number:");
      double num2 = input.nextDouble();

      System.out.println("Enter an operator (+, -, *, /):");
      char operator = input.next().charAt(0);

      double result;

      switch (operator) {
         case '+':
            result = num1 + num2;
            break;

         case '-':
            result = num1 - num2;
            break;

         case '*':
            result = num1 * num2;
            break;

         case '/':
            result = num1 / num2;
            break;

         default:
            System.out.println("Invalid operator");
            return;
      }

      System.out.println("Result: " + result);
   }
}
