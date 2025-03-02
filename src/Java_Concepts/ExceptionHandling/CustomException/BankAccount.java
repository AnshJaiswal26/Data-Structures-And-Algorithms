package Java_Concepts.ExceptionHandling.CustomException;

public class BankAccount {
    private double balance;

    BankAccount(double amount){
       this.balance = amount;
    }

    public void withdraw(double amount ) throws Exception {
        if(amount>balance){
            throw new InsufficientMoneyException();
        }
        balance-=amount;
    }
}
