package OnLineLessons.OnLineLesson2;

public class Cat extends Animal{
    private Dog dog = new Dog();

    public Cat(String name, int age){
        super(name, age);
    }

    @Override
    public String makeSound() {
        dog.makeSound();
        return "мяу";
    }
    
}
