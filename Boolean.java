import java.util.Scanner;

    public class Main {
         public static void main(String args[]) {
         
         Scanner scanner = new Scanner(System.in);
         System.out.println("Input number n1: ");
         int n1 = scanner.nextInt();
         System.out.println("Input number n2: ");
         int n2 = scanner.nextInt();
         System.out.println("Input number n3: ");
         int n3 = scanner.nextInt();
         
         
         
         boolean result1, result2, result3;
         result1 = ( (n1 / 2) * 2 == n1);
         result2 = ( (n2 / 2) * 2 == n2);
         result3 = ( (n3 / 2) * 2 == n3);
         
           if (result1) {
            System.out.print("Num1 is Even (" + result1 +")");
            } else {
            System.out.print("Num1 is Even (" + result1 + ")");
            }
            if (result2) {
            System.out.print("Num2 is Even (" + result2 + ")");
            } else {
            System.out.print("Num2 is Even (" + result2 + ")");
            }
            if (result2) {
            System.out.print("Num3 is Even (" + result3 + ")");
            } else {
            System.out.print("Num3 is Even (" + result3 + ")");
            }
            
            scanner.close();
            
         
         }
    }