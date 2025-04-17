/*BMI Calculator
Input height and weight, calculate BMI and print a message (Underweight/Normal/Overweight). */

import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your height in feet: ");
        double height = sc.nextDouble();
        //convert ft to m
        double meters = height / 3.28084;
        System.out.println("Enter your weight in kg: ");
        double weight = sc.nextDouble();

        double bmi = weight / (meters * meters);
        System.out.println("BMI: " + bmi);
        if (bmi < 18.5) {
            System.out.println("Under weight");
        } else if(bmi > 18.5 && bmi < 24.9){
            System.out.println("Healthy weight");
        }else if(bmi > 25){
            System.out.println("Overweight");
        }




        
        sc.close();
    }
}