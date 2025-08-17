import java.util.Random;

public interface IPerson {
    String doJob();
    Random random = new Random();
    default int generateDays(){
        return random.nextInt(365) +1;
    }
    
}
