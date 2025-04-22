/*Create a BankAccount class that initializes name, balance, and account number 
using parameterized constructor. Display details with a method. */
public class BankAccountSetup {
    String Name;
    float Balance;
    long Account_Number;

    //parameterized constructor
    BankAccountSetup(String name, float balance, long acc_no){
        this.Name = name;
        this.Balance = balance;
        this.Account_Number = acc_no;
    }

    public static void main(String[] args) {
        BankAccountSetup obj1 = new BankAccountSetup("Gaurav", 20000, 423232323);
        System.out.println("Name: " + obj1.Name);
        System.out.println("Balance: " + obj1.Balance);
        System.out.println("Account_No: " + obj1.Account_Number);
    }
}
