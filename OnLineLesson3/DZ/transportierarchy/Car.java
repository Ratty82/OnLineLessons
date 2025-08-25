public class Car extends Vehicle {

    public Car(String brand,int maxSpeed,double fuelLevel){
        super(brand, maxSpeed, fuelLevel);
        
    }
    
    //реализует метод `move`, расходует топливо (1 литр на 10 км)
    @Override
    public void move(double distance) throws OutOfFuelException,NegativeDistanceException{
        if (distance <= 0){
            throw new NegativeDistanceException("Расстояние указано неверно: ", distance);
        }        
        if (getFuelLevel() < distance / 10){
            throw new OutOfFuelException("Не хватает топлива для такой поездки, нужно: ", distance / 10);
        }     
        setFuelLevel(getFuelLevel() - distance / 10);

    }

    @Override
    public String getInfo() {
        return "Car: brand: " + getBrand() + " Max.Speed: " + getMaxSpeed() + " FuelLevel: " + getFuelLevel();
    }

}
