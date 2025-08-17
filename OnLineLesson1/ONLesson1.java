package OnLineLessons.OnLineLesson1;

public class ONLesson1 {

    public static void main(String[] args) {
        /*
         public
         private
         protected 
         */
        /*Cat cat = new Cat("Barsik", 10);

        cat.setAge(19);
        
        cat.setAge(100);
        System.out.println(cat.getName());*/
        BankAccount bankAccount = new BankAccount("my", 12345, 558822, 65.2);
        bankAccount.setAccountName("My2");

        System.out.println(bankAccount.toString());


    }
    
}
