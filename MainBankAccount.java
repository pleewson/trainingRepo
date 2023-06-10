public class MainBankAccount {
    public static void main(String[] args) {

        BankAccount Joseph = new BankAccount(78594023);

        Joseph.depositCash(250);
        Joseph.withdrawCash(100);

        Joseph.depositCash(15);
        Joseph.withdrawCash(-5);




        System.out.println(Joseph.printInfo());
    }
}
