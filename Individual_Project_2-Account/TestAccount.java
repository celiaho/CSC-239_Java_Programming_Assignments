/* *****************************************
 *  Author : Celia Ho   
 *  Last Modified : Thu Feb 29 2024
 *  File : TestAccount.java
 *  Description :  Due: Saturday, March 2, 2024, 11:59 PM
Account
- 	type: char 	valid entries 's' for savings, 'c' for checking 'L' for loan
- 	balance:double 	
- 	interestRate: double 	
- 	accountID: int 	start at 1000, increment by 1
- 	ownerFirstName: String 	
- 	ownerLastName: String 	
- 	lastUpdateDate: Date 	date of last update - used for calculating interest initially set 
to account open date.
+ 	Account(type: char, balance: double, interestRate: double, ownerFirstName: String, ownerLastName:String) 	
+ 	setters and getters 	
+ 	updateInterest() 	
+ 	makeDeposit(amount: double) 	also updates interest
+ 	makeWithdrawal(amount: double) : bool 	also update interest - returns false if unable to withdraw amt
+ 	toString(): String 	
- 	other private methods as may be required 	

1. Create Account class.

2. Create TestAccount class. instantiate an array of Accounts - the first 3 should be for owner Fred Flint, who has a checkng account with $100., and no interest, a savings account with $500 an interest rat of 0.5%, and a loan of $5000 at an interest rate of 8.25% for 5 years that Fred pays off monthly at 101.98 from his checking account. Create a loop that randomly creates a deposit or withdrawal and randomly creates a deposit or withdrawal amount between $0.99 and $99.99. There is one deposit or withdrawal per day. Do not forget to pay the loan from the checking account. Run your loop for 3 months, printing each deposit and withdrawal. On the first of each month, recalculate the balance of the savings account.  Don't forget to recalculate how much is owed on the loan each month. the loan and the savings account are both calculated using simple interest not compound interest

3. Don't forget to document your code.

4. submit your entire project as a zipped folder.

 * ******************************************/

// (2) Create TestAccount class.

import java.util.Random;

public class TestAccount {

    public static void main(String[] args) {
        Random random = new Random();

        // Instantiate accounts - the first 3 should be for owner Fred Flint, who has a checkng account with $100., and no interest, 
        Account checking = new Account('c', 100, 0.0, "Fred", "Flint");
        
        // a savings account with $500 an interest rate of 0.5%, and 
        Account savings = new Account('s', 500, 0.005, "Fred", "Flint");
        
        // a loan of $5000 at an interest rate of 8.25% for 5 years that Fred pays off monthly at 101.98 from his checking account. 
        Account loan = new Account('l', 5000, 0.0825, "Fred", "Flint");
        

        // Instantiate an array of Accounts
        Account[] accounts = new Account[3];

        accounts[0] = checking;
        accounts[1] = savings;
        accounts[2] = loan;
        

        // Loop for 90 days
        for (int d = 0; d < 90; d++) {     // Starting with day count 0, for every day < 90 days, do the following and then add 1 to the count of days
            if ((d % 30) == 0) {  // make sure it's the end of the month
                if (accounts[0].makeWithdrawal(101.98)) {  // If loan payment can be debited from Checking...
                    accounts[2].makeWithdrawal(101.98);
                    System.out.print("Loan paid from Checking account: $101.98\n");
                }
                else {
                    System.out.println("Insufficient funds to complete loan payment\n");
            }
            System.out.println("The new loan balance is " + accounts[2].getBalance());
            }

        // Create a loop that randomly creates a deposit or withdrawal and randomly creates a deposit or withdrawal amount between $0.99 and $99.99.
        boolean isDeposit = random.nextBoolean();   // Yields random boolean: T = deposit, F = withdrawal
        double amount = random.nextDouble(0.99, 99.99);

        if (isDeposit)  { 
            accounts[0].makeDeposit(amount);   // Add deposit to Checking
            System.out.printf("%s%.2f\n", "Checking deposit: $", amount);   // Print deposit amount 
        }
        else {
            if (accounts[0].makeWithdrawal(amount)) {  // If withdrawal from Checking can be made
                System.out.printf("%s%.2f\n", "Checking withdrawal: $", amount);    // Print withdrawal amount
            }
            else {
                System.out.println("Insufficient funds to complete checking withdrawal\n");
            }
        }

        System.out.println(accounts[0]);
        System.out.println(accounts[1]);
        System.out.println();
    }
}
}

