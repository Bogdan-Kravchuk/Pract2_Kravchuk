public class BankAccount {
    private final String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance){
        this.accountNumber=accountNumber;
        if(accountNumber.equals(null) ){
            System.out.println("Номер рахунку повинен бути більше 0");
        }
        else {
            System.out.println("Акаунт " + accountNumber);
        }

if(initialBalance<0){
    System.out.println("Invalid initial balance");
 throw new IllegalArgumentException();

}
else {
balance=initialBalance;
        System.out.println("Баланс" + balance);
    }}
    public double getBalance() {
        System.out.println("Баланс: " + balance);
        return balance;

    }
    public void deposit(double amount) {
        if(amount<0){
            throw new IllegalArgumentException();
        }
        balance+=amount;
        System.out.println("Баланс після поповнення"  + balance);

    }
    public void withdraw(double amount) {
        if(amount<0){
            throw new IllegalArgumentException();
        }
        if(amount>balance){
            System.out.println("Не можна зняти більше ніж на балансі.");
            System.out.println("На балансі: " + balance);
            throw new IllegalArgumentException();
        }
        balance-=amount;
        System.out.println("Баланс після зняття"  + balance);

    }




}
