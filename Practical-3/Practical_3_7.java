import java.util.Scanner;
class Account {
    int accountId;
    String name;
    double balance;

    void setAccount(int accountId, String name, double balance) {
        this.accountId = accountId;
        this.name = name;
        this.balance = balance;
    }

    void display() {
        System.out.println("Account ID: " + accountId);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }

    int getAccountId() {
        return accountId;
    }
}

public class Practical_3_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account[] accounts = new Account[5];

        accounts[0] = new Account();
        accounts[0].setAccount(101, "Yashesh", 5000.0);
        accounts[1] = new Account();
        accounts[1].setAccount(102, "Het", 7000.0);
        accounts[2] = new Account();
        accounts[2].setAccount(103, "Priyanshu", 6000.0);
        accounts[3] = new Account();
        accounts[3].setAccount(104, "Sujal", 8000.0);
        accounts[4] = new Account();
        accounts[4].setAccount(105, "Harsh", 9000.0);

        System.out.println("Account Details:");
        for (Account acc : accounts) {
            acc.display();
            System.out.println();
        }

        System.out.print("Enter account ID to search: ");
        int searchId = sc.nextInt();
        boolean found = false;

        for (Account acc : accounts) {
            if (acc.getAccountId() == searchId) {
                System.out.println("Account Found:");
                acc.display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Account not found.");
        }

        sc.close();
    }
}
