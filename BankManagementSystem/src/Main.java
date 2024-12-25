import com.bms.model.Customer.Customer;
import com.bms.model.account.Account;
import com.bms.model.account.CurrentAccount;
import com.bms.model.account.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("upendra",9870," conser Street ");
        System.out.println(customer);

         Account savingsaccount = new SavingsAccount(1234567890,2000.00,0.02);
           savingsaccount.deposit(100);
           savingsaccount.withdraw(200);
           System.out.println("Your savings account intrest amount is : " +savingsaccount.calculateIntrest());
           //System.out.println("your savings account transaction history : " savingsaccount.displayTransaction());
           savingsaccount.displayTransaction();



           Account currentaccount = new CurrentAccount(12345,10000,50000);
           currentaccount.deposit(5000);
           currentaccount.withdraw(2000);

           System.out.println("Your current account intrest amount is : " +currentaccount.calculateIntrest());
           currentaccount.displayTransaction();





    }
}