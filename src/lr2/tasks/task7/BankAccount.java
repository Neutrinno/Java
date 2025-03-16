package lr2.tasks.task7;

public interface BankAccount {
    void createAccount(String accountNumber, double initialBalance);
    void deposit(double amount);
    void withdraw(double amount);

    double getBalance();
}