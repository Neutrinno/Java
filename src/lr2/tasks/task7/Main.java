package lr2.tasks.task7;

public class Main {
    public static void main(String[] args) {

        ClassBankAccount account = new ClassBankAccount();

        account.createAccount("123456789", 10000.0);
        account.deposit(50000.0);
        account.withdraw(2000.0);
        account.withdraw(20000000.0);

        System.out.println("Текущий баланс: " + account.getBalance());
        account.displayAccountInfo();
    }
}
