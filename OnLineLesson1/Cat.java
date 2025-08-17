package OnLineLessons.OnLineLesson1;
public class Cat {

    // String name;
    // int age;
   
   private final String name;
   private int age;

   public Cat(String name, int age){
        this.name = name;
        this.age = age;
   }

   public void setAge(int age){
    if(age>0){
        this.age = age;
    }
   }

   public String getName(){
    return name;
   }

}
