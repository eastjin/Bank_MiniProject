
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        User user1 = new User();
        User user2 = new User();
        User user3 = new User();
        User user4 = new User();
        User user5 = new User();
        User user6 = new User();
        User user7 = new User();
        User user8 = new User();
        User user9 = new User();
        User user10 = new User();

        BankAccount ba1 = new BankAccount();
        BankAccount ba2 = new BankAccount();
        BankAccount ba3 = new BankAccount();
        BankAccount ba4 = new BankAccount();
        BankAccount ba5 = new BankAccount();
        BankAccount ba6 = new BankAccount();
        BankAccount ba7 = new BankAccount();
        BankAccount ba8 = new BankAccount();
        BankAccount ba9 = new BankAccount();
        BankAccount ba10 = new BankAccount();

        user1.account = ba1;
        ba1.user = user1;
        ba1.deposit(10000);

    }
}