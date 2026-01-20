public class Main {

    static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(-1, 0);
        bankAccount.deposit(0);
        bankAccount.withdraw(0);
        bankAccount.getBalance();


    int[] accountNumbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

 ArrayStat.findMin(accountNumbers);
        ArrayStat.findMax(accountNumbers);
        ArrayStat.calculateAvg(accountNumbers);

    }

}
