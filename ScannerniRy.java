import java.util.Scanner; //Jave Scanner Library

public class Main {
    public static void main(String[] args) {
        
        Scanner user_input = new Scanner(System.in); //Scanner Object
        
        String lname, fname, address, fbacc, gmail, cnum, middleinitial;
        int age;
        
        System.out.print("Enter your Lastname: ");
        lname = user_input.nextLine();
        
        System.out.print("Enter your FirstName: ");
        fname = user_input.nextLine();
        
        System.out.print("Enter your Address: ");
        address = user_input.nextLine();
        
        System.out.print("Enter your FacebookAccount: ");
        fbacc = user_input.nextLine();
        
        System.out.print("Enter your Gmail: ");
        gmail = user_input.nextLine();
        
        System.out.print("Enter your ContactNumber: ");
        cnum = user_input.nextLine();
        
        System.out.print("Enter your MiddleInitial: ");
        middleinitial = user_input.nextLine();
        
        System.out.print("Enter your Age: ");
        age = user_input.nextInt();
        
        System.out.println("Lastname: " + lname);
        System.out.println("Firstname: " + fname); 
        System.out.println("Address: " + address);
        System.out.println("Facebook Account: " + fbacc);
        System.out.println("Gmail: " + gmail);
        System.out.println("Contact Number: " + cnum);
        System.out.println("MiddleInitial: " + middleinitial);
        System.out.println("Age: " + age);
        
        user_input.close();
    }
}

