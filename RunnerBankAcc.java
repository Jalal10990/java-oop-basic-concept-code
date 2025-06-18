
class BankAccount{

    private String accountNumber;
    private double balance;

    public void setAccountNumber(String accNo){
        accountNumber = accNo;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }

//deposit method
public void deposit(double amount){
    if(amount > 0){
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
}
//withdraw method
public void withdraw(double amount){
    if(amount > 0 && amount <= amount){
        balance = balance - amount;
        System.out.println("Withdrawn: " + amount);
    }else {
            System.out.println("Insufficient balance or invalid amount.");
        }
}

}


public class RunnerBankAcc {
 public static void main(String[] args) {
    BankAccount myAccount = new BankAccount();

    //set account number
    myAccount.setAccountNumber("096743562");
    
    myAccount.deposit(50000);
    myAccount.withdraw(15000);

     System.out.println("Current Balance: " + myAccount.getBalance());
 System.out.println("Account Number: " + myAccount.getAccountNumber());
 }   
}
