public class InheritanceBankAccount {
    //Private
    //Accessible only inside the same class
    //Not visible to subclasses or any other class
    protected String accountNUmber;
    protected double balance;

    //Constructor
    public InheritanceBankAccount(String accountNUmber,double balance){
        this.accountNUmber = accountNUmber;
        this.balance =balance;
    }
    public void deposit(double amount){
        balance+=amount;
    }
    public void withdraw(double amount){
        if(amount<=balance && amount>0){
            balance-=amount;
            System.out.println("Withdrawal amount is"+amount);
        }
        else{
            System.out.println("Invalid amount");
        }

    }
    public void displayInfo(){
        System.out.println("Account Number is"+accountNUmber);
        System.out.println("The balance is"+balance);
    }
}

class SavingsAccount extends InheritanceBankAccount{
    private double interestRate;
    public SavingsAccount(String accountNumber,double balance,double interestRate){
        super(accountNumber,balance);
        this.interestRate = interestRate;
    }
    public void addInterest(){
        double interest = balance * interestRate/100;
        balance += interest;
    }


    public static  void main(String[] args){
        SavingsAccount sa = new SavingsAccount("1234",100,5.0);
        sa.deposit(500);
        sa.addInterest();
        sa.displayInfo();
    }
}
