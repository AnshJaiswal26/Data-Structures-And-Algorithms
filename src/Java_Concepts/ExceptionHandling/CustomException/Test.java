package Java_Concepts.ExceptionHandling.CustomException;

public class Test {
    public static void main(String[] args) throws Exception {
        BankAccount bankAccount = new BankAccount(35);

        try{
            bankAccount.withdraw(40);
        }catch (InsufficientMoneyException e){
            System.out.println(e);
        }
    }
}
