package lr2.tasks.task7;

public class ClassBankAccount implements BankAccount {
    private String accountNumber;
    private double balance;


    public ClassBankAccount() {
        this.accountNumber = "";
        this.balance = 0.0;
    }

    @Override
    public void createAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        System.out.println("Счет создан: " + accountNumber + ", начальный баланс: " + initialBalance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Депозит на " + amount + " выполнен. Новый баланс: " + balance);
        } else {
            System.out.println("Сумма депозита должна быть положительной.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Снятие " + amount + " выполнено. Новый баланс: " + balance);
        } else {
            System.out.println("Недостаточно средств или сумма снятия некорректна.");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }

    public void displayAccountInfo() {
        System.out.println("Номер счета: " + accountNumber + ", Баланс: " + balance);
    }
}
