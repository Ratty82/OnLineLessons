import java.util.Random;

public class Teacher extends Person implements IPerson{
    private String subject;

    public Teacher(String name, int age,String sex,String faculty, String subject) {
        super(name, age,sex, faculty);
        setSubject(subject);

    }

    @Override
    public String informAboutRole() {
        String role = "Преподаватель";     
        return role;
    }
    
    public void setSubject(String subject){
        if (subject == null || subject.trim().isEmpty())  {
            throw new IllegalArgumentException("Предмет введено неверно");
        }
        else {
            this.subject = subject;
        }  
    }

    public String informAboutSubject() {  
        return subject;
    }

    @Override
    public String getInfo(){
        return String.format("%s: Имя: %s , Возраст: %s , Пол: %s , Факультет: %s , Предмет: %s" , informAboutRole(), getName(),getAge(),getSex(),getFaculty(),informAboutSubject());
     }

    @Override
    public String doJob() {
        final int days = generateDays();
        final String job = "Преподает ";
        final String jobResult = job + Integer.toString(days) + " дней, обучает " + informAboutSubject() + " на факультете " + getFaculty();
        return jobResult;
    }
    
     
}
