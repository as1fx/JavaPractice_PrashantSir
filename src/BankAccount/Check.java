package BankAccount;

public class Check {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("0002", "Nayan");
        account.depositMoney(100);
        System.out.println(account.withdrawMoney(200));
        account.depositMoney(500);
        account.depositMoney(-220);
    }
}
