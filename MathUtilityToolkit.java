/* Math Utility Toolkit
  Create a class with static methods:
  isPrime(int n)
  factorial(int n)
  reverseNumber(int n)
  isPalindrome(int n) */

  public class MathUtilityToolkit {
  
    //isPrime
    public static boolean isPrime(int num){
      if(num <= 1){
        System.out.print(num + " is not a prime number.");
        return false;
      }

      for(int i = 2; i < num; i++){
        if(num % i == 0){
          System.out.println(num + " is not a prime number");
          return false;
        }
      }
      System.out.println(num + " is a prime number.");
      return true;

    }

    //factorial
    public static int factorial(int num){
      if (num < 0) {
        throw new IllegalArgumentException("Number must be non-negative.");
      }
      int fact = 1;
      for (int i = 1; i <= num; i++) {
        fact *= i;
      }
      return fact;
    }

    //reverse number
    public static int reverse(int num){
      int reverse = 0;
      if(num != 0){
        while (num != 0) {
          int remainder = num % 10;
          reverse = reverse * 10 + remainder;
          num = num / 10;
        }
      }
      return reverse;
    }

    //isPalindrome
    public static boolean isPalindrome(int num) {
        int original = num;
        int reversed = reverse(num);
        return original == reversed;
    }
    
    public static void main(String[] args){
      MathUtilityToolkit.isPrime(2);
      System.out.println("Factorial of 5: " + MathUtilityToolkit.factorial(5));
      System.out.println("Reverse of 123: " + MathUtilityToolkit.reverse(123));
      System.out.println("Is 12321 a palindrome? " + MathUtilityToolkit.isPalindrome(12321));
    }
  }
