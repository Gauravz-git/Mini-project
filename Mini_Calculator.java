/*Mini Calculator App
Ask the user to input two numbers and choose an operation 
(add, subtract, multiply, divide, modulus).
Show the result.*/

import java.util.Scanner;

public class Mini_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the First Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Operator: add, sub, mul, div, mod ->> ");
        String op = sc.next();
        System.out.print("Enter the Second Number: ");
        int num2 = sc.nextInt();

        switch (op) {
            case "add":
                int add = num1 + num2;
                System.out.println(add);
                break;

            case "sub":
                int sub = num1 - num2;
                System.out.println(sub);
                break;

            case "mul":
                int mul = num1 * num2;
                System.out.println(mul);
                break;

            case "div":
                int div = num1 / num2;
                System.out.println(div);
                break;

            case "modulus":
                int mod = num1 % num2;
                System.out.println(mod);
                break;

            default: 
            System.out.println("Invalid!!! Operator");
                break;
        }

        sc.close();
    }
}
