public class InvalidFuelAmountException extends Exception {
    public double fuelAmount;

    public InvalidFuelAmountException(String msg,double fuelAmount){
        super(msg);
        this.fuelAmount = fuelAmount;

    }

    public double getFuelAmount() {
        return fuelAmount;
    }

}
