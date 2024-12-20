import com.bms.model.Customer;
import com.bms.model.account.Account;
import com.bms.model.account.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("upendra",9870," conser Street ");
        System.out.println(customer);

         Account account = new SavingsAccount(1234567890,2000.00,0.02);
           account.deposit(100);
           account.withdraw(200);
           System.out.println(account.calculateIntrest());




    }
}