public class NegativeDistanceException extends Exception {
    double distance;

    public NegativeDistanceException(String msg,double distance){
        super(msg);
        this.distance = distance;
    }

    public double getDistance() {
        return distance;
    }

    
}
