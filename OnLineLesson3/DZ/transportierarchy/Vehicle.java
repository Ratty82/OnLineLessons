//Создайте абстрактный класс `Vehicle
public abstract class Vehicle {
    //- Поля: `brand` (String), `maxSpeed` (int), `fuelLevel` (double)
    protected String brand;
    protected int maxSpeed;
    protected double fuelLevel;
    
    public Vehicle(String brand, int maxSpeed,double fuelLevel){
        setBrand(brand);
        setFuelLevel(fuelLevel);
        setMaxSpeed(maxSpeed);
    }
    //геттеры
    public String getBrand() {
        return brand;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public double getFuelLevel() {
        return fuelLevel;}

    //сеттеры с валидацией
    public void setBrand(String brand) {
        if (brand == null || brand.trim().isEmpty()) {
            throw new IllegalArgumentException("Бренд не заполнен");
        }
        else {
            this.brand = brand;
        }   
    }
        
    public void setMaxSpeed(int maxSpeed){
        if (maxSpeed <= 0 ) {
            throw new IllegalArgumentException("Максимальная скорость должна быть больше нуля");
        }
        else {
            this.maxSpeed = maxSpeed;
        }  
    }

    public void setFuelLevel(double fuelLevel){
        if (fuelLevel < 0 ) {
            throw new IllegalArgumentException("Уровень топлива не может быть отрицательным");
        }
        else {
            this.fuelLevel = fuelLevel;
        }  
    }

    //- Абстрактный метод: `move(double distance)`
    public abstract void move(double distance) throws OutOfFuelException,NegativeDistanceException;

    //- Конкретный метод: `refuel(double amount)` А можно ли указывать исключение в сеттере а потом вызывать?
    public void refuel(double amount) throws InvalidFuelAmountException {
        if (amount <=0) {
            throw new InvalidFuelAmountException("Уровень топлива не может быть отрицательным, указано ", amount);
        }
        else {setFuelLevel(getFuelLevel() + amount);}

    }

    //- Абстрактный метод: информация о транспорте

    public abstract String getInfo();

}
