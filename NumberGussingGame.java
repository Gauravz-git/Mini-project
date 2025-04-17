import java.util.Scanner;
import java.util.Random;

class NumberGussingGame {
  public static void main(String[] args) {
    Random rand = new Random();
    int target = rand.nextInt(100) + 1; // Random number from 1 to 100

    Scanner sc = new Scanner(System.in);
    int guess = 0;

    while (guess != target) {
      System.out.print("Enter your guess (1-100): ");
      guess = sc.nextInt();

      if (guess > target) {
        System.out.println("Too high");
      } else if (guess < target) {
        System.out.println("Too low");
      } else {
        System.out.println("Correct!");
      }
    }

    sc.close();
  }
}
