// Using the Account constructor to initialize the name instance
// variable at the time each Account object is created.

public class AccountTwoTest {
   public static void main(String[] args) { 
      // create two Account objects
      AccountTwo account1 = new AccountTwo("Jane Green");
      AccountTwo account2 = new AccountTwo("John Blue"); 

      // display initial value of name for each Account
      System.out.printf("account1 name is: %s%n", account1.getName());
      System.out.printf("account2 name is: %s%n", account2.getName());
   } 
}