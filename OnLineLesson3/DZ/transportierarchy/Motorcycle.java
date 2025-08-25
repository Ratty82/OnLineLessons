public class Motorcycle extends Vehicle {
    public Motorcycle(String brand,int maxSpeed,double fuelLevel){
        super(brand, maxSpeed, fuelLevel);
    }

    //реализует метод `move`, расходует топливо (1 литр на 10 км)

    @Override
    public void move(double distance) throws OutOfFuelException,NegativeDistanceException{
        if (distance <= 0){
            throw new NegativeDistanceException("Расстояние указано неверно: ", distance);
        }        
        if (getFuelLevel() < distance / 20){
            throw new OutOfFuelException("Не хватает топлива для такой поездки, нужно: ", distance / 20);
        }     
        setFuelLevel(getFuelLevel() - distance / 20);

    }

    @Override
    public String getInfo() {
        return "Motorcycle: brand: " + getBrand() + " Max.Speed: " + getMaxSpeed() + " FuelLevel: " + getFuelLevel();
    }

}
