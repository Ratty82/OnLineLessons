import java.util.Random;

public class Student extends Person implements IPerson{
    private String domain;

    public Student(String name, int age,String sex, String faculty, String domain) {
        super(name, age ,sex,faculty);
        setDomain(domain);

    }

    @Override
    public String informAboutRole() {
        String role = "Студент";     
        return role;
    }

    public void setDomain(String domain){
        if (domain == null || domain.trim().isEmpty())  {
            throw new IllegalArgumentException("Направление введено неверно");
        }
        else {
            this.domain = domain;
        }  
    }

    public String informAboutDomain() {  
        return domain;
    }

    @Override
    public String getInfo(){
        return String.format("%s: Имя: %s , Возраст: %s , Пол: %s , Факультет: %s , Направление: %s" , informAboutRole(), getName(),getAge(),getSex(),getFaculty(),informAboutDomain());
     }

    @Override
    public String doJob() {
        final int days = generateDays();
        final String job = "Учится ";
        final String jobResult = job + Integer.toString(days) + " дней";
        return jobResult;
    }
    
 
}
