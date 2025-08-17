package OnLineLessons.OnLineLesson2;

public abstract class Animal {
    /*
     extends\super\protected
     */


     protected String name;
     protected int age;


     public Animal(String name, int age) {
        this.name = name;
        this.age = age;
     }


     public abstract String makeSound();

     public String getInfo(){
        return String.format("Имя: %s , возраст: %s", name,age );
     }
}