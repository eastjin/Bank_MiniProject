import java.util.HashMap;
import java.util.Map;

public class BankService {


    Map<Long, BankAccount> map = new HashMap<Long, BankAccount>() {{
        User user1 = new User(1,"eastjin1");
        User user2 = new User(2,"eastjin2");
        User user3 = new User(3,"eastjin3");
        User user4 = new User(4,"eastjin4");
        User user5 = new User(5,"eastjin5");
        User user6 = new User(6,"eastjin6");
        User user7 = new User(7,"eastjin7");
        User user8 = new User(8,"eastjin8");
        User user9 = new User(9,"eastjin9");
        User user10 = new User(10,"eastjin10");

        Account account1= new Account(1, 10000);
        Account account2= new Account(2, 10000);
        Account account3= new Account(3, 10000);
        Account account4= new Account(4, 10000);
        Account account5= new Account(5, 10000);
        Account account6= new Account(6, 10000);
        Account account7= new Account(7, 10000);
        Account account8= new Account(8, 10000);
        Account account9= new Account(9, 10000);
        Account account10= new Account(10, 10000);

        BankAccount bankAccount1 = new BankAccount(account1, user1);
        BankAccount bankAccount2 = new BankAccount(account2, user2);
        BankAccount bankAccount3 = new BankAccount(account3, user3);
        BankAccount bankAccount4 = new BankAccount(account4, user4);
        BankAccount bankAccount5 = new BankAccount(account5, user5);
        BankAccount bankAccount6 = new BankAccount(account6, user6);
        BankAccount bankAccount7 = new BankAccount(account7, user7);
        BankAccount bankAccount8 = new BankAccount(account8, user8);
        BankAccount bankAccount9 = new BankAccount(account9, user9);
        BankAccount bankAccount10 = new BankAccount(account10, user10);

        map.put(1L,bankAccount1);
        map.put(2L,bankAccount2);
        map.put(3L,bankAccount3);
        map.put(4L,bankAccount4);
        map.put(5L,bankAccount5);
        map.put(6L,bankAccount6);
        map.put(7L,bankAccount7);
        map.put(8L,bankAccount8);
        map.put(9L,bankAccount9);
        map.put(10L,bankAccount10);

    }};


    // todo initialize() 를 구현해주세요.
    // todo 이 메소드 안에서는 유저 10명, 계좌 10개를 생성하고 그 이후 BankAccount 에 10를 만들어서 위 map 에 할당까지 해주세요.
    // todo 여기까지 되면 다시 확인하겠습니다.

}




