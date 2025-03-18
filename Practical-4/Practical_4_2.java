class BankAccount {
    String accountHolder;
    double balance;
    
    BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }
    
    void openAccount() {
        System.out.println("Account opened for " + accountHolder);
    }
    
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }
    
    void checkBalance() {
        System.out.println("Balance for " + accountHolder + ": " + balance);
    }
    
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }
    
    void calInterest() {
        System.out.println("Interest calculation not implemented for base class.");
    }
}

class SavingAccount extends BankAccount {
    double interestRate;
    
    SavingAccount(String accountHolder, double initialBalance, double interestRate) {
        super(accountHolder, initialBalance);
        this.interestRate = interestRate;
    }
    
    void calInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest added: " + interest + ", New Balance: " + balance);
    }
}

class FixedDepositAccount extends BankAccount {
    double interestRate;
    int tenure;
    
    FixedDepositAccount(String accountHolder, double initialBalance, double interestRate, int tenure) {
        super(accountHolder, initialBalance);
        this.interestRate = interestRate;
        this.tenure = tenure;
    }
    
    void calInterest() {
        double interest = balance * (interestRate / 100) * tenure;
        balance += interest;
        System.out.println("Fixed deposit interest added: " + interest + ", New Balance: " + balance);
    }
    
    void withdraw(double amount) {
        System.out.println("Withdrawals are not allowed from a fixed deposit account before maturity.");
    }
}

public class Practical_4_2 {
    public static void main(String[] args) {
        SavingAccount savings = new SavingAccount("Yashesh", 5000, 7.5);
        savings.openAccount();
        savings.deposit(4000);
        savings.checkBalance();
        savings.calInterest();
        savings.withdraw(2000);
        
        System.out.println();
        
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("Het", 10000, 5.0, 3);
        fixedDeposit.openAccount();
        fixedDeposit.checkBalance();
        fixedDeposit.calInterest();
        fixedDeposit.withdraw(1000);
    }
}
