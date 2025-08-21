public class InsufficientFundsException extends Exception {
    double InsufficientFunds;
    double RequestedAmount;

    public InsufficientFundsException(String msg,double amount,double funds){
        super(msg);
        this.InsufficientFunds = funds;
        this.RequestedAmount = amount;
    }

    public double getInsufficientFunds(){
        return InsufficientFunds;
    }

    public double getRequestedAmount(){
        return RequestedAmount;
    }


}
