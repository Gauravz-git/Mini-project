/*Create a program that prints your name, age, 
favorite hobby, and favorite quote in a nicely formatted way.*/

import java.util.Scanner;

public class Personal_Info_Card {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Name: ");
        String Name = sc.nextLine();
        System.out.print("Enter your Age: ");
        int Age = sc.nextInt();
        System.out.print("Enter your Favourite Hobby: ");
        String Hobby = sc.next();
        System.out.print("Enter your Favourite Quote of the Day: ");
        sc.nextLine(); // Consume the leftover newline
        String Quote = sc.nextLine();

        System.out.println("---------------------------------------------------------");

        System.out.println("Name: " + Name);
        System.out.println("Age: " + Age);
        System.out.println("Hobby: " + Hobby);
        System.out.println("Quote: " + Quote);

        sc.close();

    }
}