package BankAccountApp;

public class BankAccountApp {
    public static void main(String[] args) {
        BankAccount acct1 = new BankAccount("485267852", 1248.25);
        BankAccount acct2 = new BankAccount("304805963", 5000);
        BankAccount acct3 = new BankAccount("685297358", 14863.58);
    
        acct1.setName("Bill");
        System.out.println("acct1: " + acct1.getName());

        acct1.deposit(500);
        acct1.withdrawal(200);
        acct1.accrue();
        System.out.print(acct1.toString());
    }
}
