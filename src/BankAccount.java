public class BankAccount {

    Account account;
    User user;

    //입금
    boolean deposit(int MoveCash) {
        if(MoveCash >=0) {
            account.balance += MoveCash;
            System.out.println("입금액 : " + MoveCash + "잔고 : " + account.balance);
            return true;
        }
        else {
            return false;
        }
    }

    //출금
    boolean withdraw(int MoveCash) {
        if(MoveCash >=0) {
            account.balance -= MoveCash;
            return true;
        }
        else {
            return false;
        }
    }

}
