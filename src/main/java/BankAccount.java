import java.util.*;
public class BankAccount {
    private String accountNumber;
    private double balance;

    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposited"+amount);
        }
        else{
            System.out.println("Invalid deposit amount!");
        }

    }
    public void withdraw(double withdrawn){
        if(withdrawn>0 && withdrawn<=balance){
            balance-=withdrawn;
            System.out.println("Withdrawn:"+balance);
        }
        else if(withdrawn>balance){
            System.out.println("Insufficent balance");
        }
        else{
            System.out.println("Invalid amount");
        }
    }
    public double getBalance(){
        return balance;

    }
    public void dispalyInfo(){
        System.out.println("Accountnumber"+accountNumber);
        System.out.println("Balance"+balance);

    }
    public void setAccountNumber(String accNumber){
        accountNumber = accNumber;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        BankAccount bankAccount = new BankAccount();
        System.out.println("Enter account number:");
        String accNumber = scanner.nextLine();
        bankAccount.setAccountNumber(accNumber);
        System.out.println("Enter amount to deposit");
        double depositAmount = scanner.nextDouble();
        bankAccount.deposit(depositAmount);
        System.out.println("Enter amount to withdraw");
        double withdrawlAmount = scanner.nextDouble();
        bankAccount.withdraw(withdrawlAmount);
        System.out.println("\nFinal Account Details");
        bankAccount.dispalyInfo();
        scanner.close();

    }
}
