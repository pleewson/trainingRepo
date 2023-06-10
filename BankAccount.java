public class BankAccount {

    final int number;
    private double cash = 0;

    BankAccount(int number){
        this.number = number;
    }


    void depositCash(double amount){
        if(amount > 0){
            this.cash += amount;
        }
    }

    double withdrawCash(double amount) {
        if (amount > 0) {
            if (this.cash < amount) {
                return this.cash = 0;
            } else {
                return this.cash -= amount;
            }
        }else{
            return 0;
        }
    }



    private int getNumber(){
        return this.number;
    }

    private double getCash(){
        return this.cash;
    }


    String printInfo(){
        return getNumber() + " - " + getCash() + " USD";
    }
}
