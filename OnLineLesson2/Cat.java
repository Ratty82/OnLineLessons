package OnLineLessons.OnLineLesson2;

public class Cat extends Animal{
    public Cat(String name, int age){
        super(name, age);
    }

    @Override
    public String makeSound() {
        return "мяу";
    }
    
}
