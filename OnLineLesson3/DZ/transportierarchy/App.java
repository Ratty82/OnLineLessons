import java.util.Arrays;

public class App {
    
    public static void moveTransport(Vehicle[] vehicles, double distance) throws NegativeDistanceException, OutOfFuelException{
         for (Vehicle v : vehicles) {
            try {
                v.move(distance);
                System.out.println(v.getInfo() + " Moved to " + distance + " km. FuelLevel changed");
                 } catch (NegativeDistanceException e)
                    {System.out.println(v.getInfo() + " Ошибка :" + e.getMessage() + e.getDistance());}
                   catch (OutOfFuelException f)
                    {System.out.println(v.getInfo() + " Ошибка :" + f.getMessage() + f.getFuelAmount() );}        
    }               
            } 
    
    
    public static void main(String[] args) {
        Vehicle[]  vehicles = {new Car("Toyota",180,0), new Motorcycle("Honda",200,0)};
        System.out.println("1 .Выведем автопарк");
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getInfo());
        }

        System.out.println(" ");
    
        System.out.println("2 .Заправим транспортные средства");   
        double[] fuelAmounts =  {-30.0,40.0};
        System.out.println("Варианты заправки:" + Arrays.toString(fuelAmounts));
        for (int i = 0; i < fuelAmounts.length; i++) {
            for (Vehicle vehicle : vehicles) {
                try {
                    vehicle.refuel(fuelAmounts[i]);
                    System.out.println("Заправлено, новое инфо по машине: " + vehicle.getInfo() + " Заправили: " + fuelAmounts[i]);
                } catch (InvalidFuelAmountException e) 
                    { System.out.println(vehicle.getInfo() + " ,Ошибка : " + e.getMessage() + "неверное значение:  " + e.getFuelAmount());}                 
            }

        }
        
        System.out.println(" ");

        System.out.println("3. Передвинем транспортные средства");
        double[] distancesToRun = {-10.90,100.3,10000};
        System.out.println("Варианты перемещений: " + Arrays.toString(distancesToRun));
        for (double d : distancesToRun)
        try {
            moveTransport(vehicles,d);
        } catch (NegativeDistanceException e)
            {System.out.println("Ошибка :" + e.getMessage() + e.getDistance());}
          catch (OutOfFuelException f)
            {System.out.println("Ошибка :" + f.getMessage() + f.getFuelAmount());}
        
    }
}
