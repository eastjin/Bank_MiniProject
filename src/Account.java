public class Account {
    long accountNumber;
    int balance; //잔고

    Account(long accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    boolean deposit(int MoveCash) {
        if(MoveCash >=0) {
            balance += MoveCash;
            System.out.println("입금액 : " + MoveCash + " 잔고 : " + balance);
            return true;
        }
        else {
            return false;
        }
    }

    //출금
    boolean withdraw(int MoveCash) {
        if(MoveCash >=0) {
            balance -= MoveCash;
            System.out.println("출금액 : " + MoveCash + " 잔고 : " + balance);
            return true;
        }
        else {
            return false;
        }
    }


}