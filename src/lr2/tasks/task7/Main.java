package lr2.tasks.task7;

public class Main {
    public static void main(String[] args) {

        ClassBankAccount account = new ClassBankAccount();

        account.createAccount("123456789", 1000.0);
        account.deposit(500.0);
        account.withdraw(200.0);
        account.withdraw(2000.0);

        System.out.println("Текущий баланс: " + account.getBalance());
        account.displayAccountInfo();
    }
}
