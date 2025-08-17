package OnLineLessons.OnLineLesson2;

public class Dog extends Animal implements IAnimal, ICar{

    private final String breed;

    public Dog(String name, int age, String breed){
        super(name, age);
        this.breed = breed;
    }
    
    public Dog(String name, int age){
        super(name, age);
        this.breed = "";
    }

    @Override
    public String makeSound() {
        return "gaf";
    }
    
    @Override
    public String getInfo(){
        return String.format("Имя: %s , возраст: %s, порода: %s", name,age, breed );
     }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'run'");
    }

    @Override
    public void method() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'method'");
    }
}
