/*Simple Menu Program
Build a menu (1. Add 2 numbers, 2. Find largest of 3 numbers, 3. Exit). 
Execute based on user choice using switch-case. */

import java.util.Scanner;

public class SimpleMenuProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(    " MENU "    );
        System.out.println("1. Add 2 Numbers. ");
        System.out.println("2. Find largest of 3 Numbers. ");
        System.out.println("3. Exit ");
        System.out.println("--------------------------------------");
        System.out.println("Enter your Choice   1, 2, 3 : ");
        
        int choice = sc.nextInt();
        //logic
        switch (choice) {
            case 1:
                System.out.println("Enter Two Numbers: ");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("Addition: " + (a + b));               
                break;

            case 2:
                System.out.println("Enter Three Numbers: ");
                int a2 = sc.nextInt();
                int b2 = sc.nextInt();
                int c2 = sc.nextInt();
                if (a2 >= b2 && b2 >= c2) {
                    System.out.println("Largest: " + a2);
                } else if(b2 >= a2 && b2 >= c2){
                    System.out.println("Largest: " + b2 );
                }else{
                    System.out.println("Largest: " + c2);
                }
            
            case 3:
                System.out.println("Exit");
                break;
        
            default:
                System.out.println("Invalid!! Choice");
                break;

        }
        sc.close();
    }
}