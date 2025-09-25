/*

1. Create a Bank class and declare an instance variable named amount of type double.

Create parameterized constructor to initialize variable “amount” with value 10000.Create two methods withdraw(double withdrawalAmount) and deposit(double depositAmount).

Calculate withdrawal based on some condition (using ternary operator) like If amount is sufficient then “withdraw successful” message will be printed on the console and amount should be updated after withdraw. Later on, deposit 5000 in the account balance.At the end display total balance on the console. String message = (withdrawalAmount <= amount) ? "Withdrawal successful" : "Insufficient balance";


code:  

class Bank {
    double amount;

    // Parameterized constructor
    Bank(double amount) {
        this.amount = amount;
    }

    // Method to withdraw amount
    void withdraw(double withdrawalAmount) {
        String message = (withdrawalAmount <= amount) ? 
            "Withdrawal successful" : "Insufficient balance";

        if (withdrawalAmount <= amount) {
            amount -= withdrawalAmount;
        }

        System.out.println(message);
    }

    // Method to deposit amount
    void deposit(double depositAmount) {
        amount += depositAmount;
        System.out.println("Deposit successful");
    }

    // Method to display total balance
    void displayBalance() {
        System.out.println("Total balance: " + amount);
    }

    // Main method to test
    public static void main(String[] args) {
        Bank myAccount = new Bank(10000); // Initial amount = 10000

        myAccount.withdraw(5000);         // Withdraw 5000
        myAccount.deposit(5000);          // Deposit 5000
        myAccount.displayBalance();       // Show final balance
    }
}

Output: Withdrawal successful
        Deposit successful
        Total balance: 10000.0



 */