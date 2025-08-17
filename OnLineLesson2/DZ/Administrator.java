import java.util.Random;

public class Administrator extends Person implements IPerson{

    public Administrator(String name, int age,String sex,String faculty) {
        super(name, age,sex,faculty);

    }

    @Override
    public String informAboutRole() {
        String role = "Администратор";     
        return role;
    }

    @Override
    public String getInfo(){
        return String.format("%s: Имя: %s , Возраст: %s , Пол: %s , Факультет %s" , informAboutRole(), getName(),getAge(),getSex(),getFaculty());
     }

    @Override
    public String doJob() {
        final int days = generateDays();
        final String job = "Работает ";
        final String jobResult = job + Integer.toString(days) + " дней, администрирует " + getFaculty();
        return jobResult;
    }
    
     
}
