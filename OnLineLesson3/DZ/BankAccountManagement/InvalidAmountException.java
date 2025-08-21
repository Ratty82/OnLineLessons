public class InvalidAmountException extends Exception {
    double InvalidAmount;

    public InvalidAmountException(String msg,double amount){
        super(msg);
        this.InvalidAmount = amount;
    }

    public double getInvalidAmount(){
        return InvalidAmount;
    }
}
