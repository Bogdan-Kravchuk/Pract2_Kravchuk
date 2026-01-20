import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    @Test
    void depositShouldIncreaseBalance() {
   BankAccount myBankAccount = new BankAccount("1", 1000);
   myBankAccount.deposit(500);
   myBankAccount.deposit(500);
    }
}