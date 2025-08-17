import java.util.ArrayList;
import java.util.Scanner;

public class UniversityRunner {
    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    boolean isRunning = true;    
    ArrayList<Person> persons = new ArrayList<>();
    persons.add(new Student("Аристарх",19,"Мужской","Радиотехника","телевидение"));
    persons.add(new Teacher("Артемий",55,"Мужской","Электротехника","ТЭЦ"));
    persons.add(new Administrator("Анатолий",40,"Мужской","Цифровая техника"));

    while (isRunning) {
            System.out.println("\n=== МЕНЮ ===");
            System.out.println("1. Вывести список всех ролей");
            System.out.println("2. Вывести только студентов");
            System.out.println("3. Вывести только преподавателей");
            System.out.println("4. Вывести только админов");
            System.out.println("5. Добавить студентов ");
            System.out.println("6. Добавить преподавателя");
            System.out.println("7. Добавить администраторов");
            System.out.println("0. Выход");
            System.out.print("Введите номер опции: ");
        
        
        int userChoice = scanner.nextInt();
        scanner.nextLine();        

    
     switch (userChoice) {
            case 1 : 
                for (Person p : persons) {
                System.out.println(p.getInfo());
                };
                break; 
            case 2:
                for (Person p : persons) {
                if (p instanceof Student s) {
                System.out.println(s.getInfo() + " , " + s.doJob());
                        }               
                } 
                break; 
            case 3:
                for (Person p : persons) {
                if (p instanceof Teacher t) {
                System.out.println(t.getInfo() + " , " + t.doJob());
                        }               
                } 
                break;
            case 4:
                for (Person p : persons) {
                if (p instanceof Administrator a) {
                System.out.println(a.getInfo() + " , " + a.doJob());
                        }               
                } 
                break;
            case 5:
                System.out.println("Введите имя");
                String name = scanner.nextLine();
                System.out.println("Введите пол");
                String sex = scanner.nextLine();
                System.out.println("Введите факультет");
                String faculty = scanner.nextLine();
                System.out.println("Введите направление");
                String domain = scanner.nextLine();
                System.out.println("Введите возраст");
                int age = scanner.nextInt();
                scanner.nextLine();
                persons.add(new Student(name,age,sex,faculty,domain));
                break;
            case 6:
                System.out.println("Введите имя");
                String namet = scanner.nextLine();
                System.out.println("Введите пол");
                String sext = scanner.nextLine();
                System.out.println("Введите факультет");
                String facultyt = scanner.nextLine();
                System.out.println("Введите предмет");
                String subject = scanner.nextLine();
                System.out.println("Введите возраст");
                int aget = scanner.nextInt();
                scanner.nextLine();
                persons.add(new Teacher(namet,aget,sext,facultyt,subject));
                break;  
            case 7:
                System.out.println("Введите имя");
                String namea = scanner.nextLine();
                System.out.println("Введите пол");
                String sexa = scanner.nextLine();
                System.out.println("Введите факультет");
                String facultya = scanner.nextLine();
                System.out.println("Введите предмет");
                System.out.println("Введите возраст");
                int agea = scanner.nextInt();
                scanner.nextLine();
                persons.add(new Administrator(namea,agea,sexa,facultya));
                break;    
            case 0:
                System.out.println("До свидания!");
                scanner.close();
                isRunning = false;
                break;
            default: 
                System.out.println("Неверный выбор");
                break;        
     
            }
        
         }
    }
}
