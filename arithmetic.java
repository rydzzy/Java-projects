import java.util.Scanner;

      public class arithmetic {
          public static void main(String[] args) {

              double first, second, sum, difference, product, quotient, remainder;

              first = 10.5;
              second = 5.2;
              sum = first + second;
              difference = first - second;
              product = first * second;
              quotient = first / second;
              remainder = first % second;

              System.out.println("The sum of the two numbers is: " +sum);
              System.out.println("The difference of the two numbers is: " +difference);
              System.out.println("The product of the two numbers is: " +product);
              System.out.println("The quotient of the two numbers is: " +quotient);
              System.out.println("The remainder of the two numbers is: " +remainder);
          }
      }