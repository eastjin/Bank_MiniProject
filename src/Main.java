
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        BankService bankService = new BankService();
        System.out.println(bankService.map.get(1L));

    }
}