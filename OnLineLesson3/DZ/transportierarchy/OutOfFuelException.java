public class OutOfFuelException extends Exception {
    double fuelAmount;

    public OutOfFuelException(String msg,double fuelAmount){
        super(msg);
        this.fuelAmount = fuelAmount;
        
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

}
