/* *****************************************
 *  Author : Celia Ho   
 *  Last Modified : Thu Feb 29 2024
 *  File : Individual Programming Project - Account (Account.java)
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

CITATIONS & ACADEMIC HONESTY NOTES:
• Furey, Edward "Simple Interest Calculator I = Prt" at https://www.calculatorsoup.com/calculators/financial/simple-interest-calculator.php from CalculatorSoup, https://www.calculatorsoup.com - Online Calculators

 * ******************************************/

import java.util.Date;   // For variable lastUpdateDate

// (1) Create Account class.
public class Account {
    // ATTRIBUTES SECTION
    private char type;              // 's' for savings, 'c' for checking 'l' for loan
    private double 
      balance,
      interestRate;
    private int accountID;
    private static int initialAccountID = 1000;          // start at 1000, increment by 1
    private String 
      ownerFirstName,
      ownerLastName;
    private Date lastUpdateDate;    // To calculate interest initially set to account open date
    

    // CONSTRUCTOR SECTION
    public Account(char type, double balance, double interestRate, String ownerFirstName, String ownerLastName) {
      this.type = type;
      this.balance = balance;
      this.interestRate = interestRate;
      this.ownerFirstName = ownerFirstName;
      this.ownerLastName = ownerLastName;
      this.lastUpdateDate = new Date();   // Creates a new date for each object created
      this.accountID = initialAccountID;  // Start account IDs at 1000...
      initialAccountID++;                 // ...and increment up for subsequent accounts
    }


    // GETTERS AND SETTERS SECTION
    public char getType() {
        return type;
    }

    public void setType(char type) {
      this.type = type;
    }

    public double getBalance() {
      return balance;
    }

    public void setBalance(double balance) {
      this.balance = balance;
    }

    public double getInterestRate() {
      return interestRate;
    }

    public void setInterestRate(double interestRate) {
      this.interestRate = interestRate;
    }

    public int getAccountID() {
      return accountID;
    }

    public void setAccountID(int accountID) {
      this.accountID = accountID;
    }

    public String getOwnerFirstName() {
      return ownerFirstName;
    }

    public void setOwnerFirstName(String ownerFirstName) {
      this.ownerFirstName = ownerFirstName;
    }

    public String getOwnerLastName() {
      return ownerLastName;
    }

    public void setOwnerLastName(String ownerLastName) {
      this.ownerLastName = ownerLastName;
    }

    public Date getLastUpdateDate() {
      return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
      this.lastUpdateDate = lastUpdateDate;
    }


    // METHODS SECTION
    // Method to update interest
    public void updateInterest() {
      Date currentDate = new Date();
      long currentTime = currentDate.getTime();         // Gets milliseconds since 1/1/1970
      long lastUpdateTime = lastUpdateDate.getTime();   // Gets milliseconds from Epoch to last update date
      long timeDifference = currentTime - lastUpdateTime;   
      // Simple interest formula: simple interest = balance * annual interest rate/100 * time period involved (years) per https://www.calculatorsoup.com/calculators/financial/simple-interest-calculator.php
      double interest = balance * interestRate * timeDifference / 100 * (1000 * 60 * 60 * 24);  // for daily interest for time difference specified, /100 = percentage, 1000 for milliseconds, *60 for minutes, *60 for hours, *24 for days
      balance += interest;
      lastUpdateDate = currentDate;
    }

    // Method to make a deposit to update interest
    public void makeDeposit(double amount) {
      updateInterest();
      balance += amount;
    }

    /* public double getPostDepositBalance(double amount) {
      return balance += amount;
    } */

    // Method to check if amount can be withdrawn; also updates interest
    public boolean makeWithdrawal(double amount) {
      if (amount < balance) {
        updateInterest();
        balance -= amount;
        return true; 
      }
        return false;
    }

    /* // Method to make a withdrawal to update interest:
    public double getPostWithdrawalBalance(double amount) {
      return balance -= amount;
    } */

    // toString method
    @Override
    public String toString() {
      return "Account [Type = " + type + ", Balance = $" + balance + ", Interest Rate = " + interestRate + "%, Account ID " + accountID + ", owner = " + ownerFirstName + " " + ownerLastName + ", Last Update Date = " + lastUpdateDate + "]";
    }

    // Account = overloaded constructor
    // update interest - simple interest, need to know the time, v. simple, comment your methods explaining what you're trying to do.
    // Run loop 90 times for 90 days (3 months)

}