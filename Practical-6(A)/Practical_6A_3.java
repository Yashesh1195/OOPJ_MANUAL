// // Custom Exception for Insufficient Funds
// class InsufficientFundsException extends Exception {
//     public InsufficientFundsException(String message) {
//         super(message);
//     }
// }

// public class Practical_6A_3 {
//     private double balance;

//     // Method for deposit
//     public void deposit(double amount) {
//         balance += amount;
//         System.out.println("Deposited: Rs " + amount);
//     }

//     // Method for withdrawal
//     public void withdraw(double amount) throws InsufficientFundsException {
//         if (amount > balance) {
//             throw new InsufficientFundsException("Not Sufficient Funds: You are trying to withdraw Rs " + amount + " but your balance is Rs " + balance);
//         }
//         balance -= amount;
//         System.out.println("Withdrew: Rs " + amount);
//     }

//     // Method to get the current balance
//     public double getBalance() {
//         return balance;
//     }

//     public static void main(String[] args) {
//         Practical_6A_3 account = new Practical_6A_3(); // Account with no initial balance

//         // Deposit amount
//         account.deposit(1000.00);  // Depositing Rs 1000
//         System.out.println("Balance after deposit: Rs " + account.getBalance());

//         // Withdraw amount
//         try {
//             account.withdraw(400.00);  // Withdraw Rs 400
//             System.out.println("Balance after withdrawal of Rs 400: Rs " + account.getBalance());
            
//             account.withdraw(300.00);  // Withdraw Rs 300
//             System.out.println("Balance after withdrawal of Rs 300: Rs " + account.getBalance());
            
//             // This will throw the exception because balance is insufficient
//             account.withdraw(500.00);  // Attempt to withdraw Rs 500
//         } catch (InsufficientFundsException e) {
//             System.out.println(e.getMessage());
//         }

//         System.out.println("Final Balance: Rs " + account.getBalance());
//     }
// }

class NotSufficientFundException extends Exception {
    public NotSufficientFundException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance = 0;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: Rs " + amount);
        System.out.println("Current Balance: Rs " + balance);
        System.out.println("-----------------------------");
    }

    public void withdraw(double amount) throws NotSufficientFundException {
        System.out.println("Attempting to withdraw: Rs " + amount);
        if (amount > balance) {
            throw new NotSufficientFundException("Not Sufficient Fund: Cannot withdraw Rs " + amount + ". Available balance: Rs " + balance);
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful: Rs " + amount);
            System.out.println("Remaining Balance: Rs " + balance);
        }
        System.out.println("-----------------------------");
    }
}

public class Practical_6A_3 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.deposit(1000.00);

        try {
            account.withdraw(400.00);
        } catch (NotSufficientFundException e) {
            System.out.println(e.getMessage());
        }

        try {
            account.withdraw(300.00);
        } catch (NotSufficientFundException e) {
            System.out.println(e.getMessage());
        }

        try {
            account.withdraw(500.00);
        } catch (NotSufficientFundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Banking operations completed.");
    }
}
