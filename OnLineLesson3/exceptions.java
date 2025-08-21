import java.nio.file.Files;
import java.nio.file.Path;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.management.RuntimeErrorException;
import javax.xml.catalog.Catalog;

public class exceptions {
    
    public static void main(String[] args) {
        /*
         
            Throwable 

            1) Error
            
            2) Exception
             - проверяемыые исключения
             - не проверяемые
         */

/*
  
          try{
            Files.readString(Path.of("null"));
         }catch(Exception e){
            System.out.println( "MyError: " + e.getMessage());
         }
 */
        int num = 0;
        try{
            Scanner scanner = new Scanner(System.in);
            num = scanner.nextInt();

            try{

            int num2 = scanner.nextInt();
            System.out.println("Деление:" + num/num2);
            }catch(ArithmeticException e){
                System.out.println("Erroe arith: " + e.getMessage());
            }
            
            
            num+=666;
         
        }catch(InputMismatchException e){
            System.out.println("Error input: " + e.getMessage() );
            num+=100;
        }catch(Exception e){
            System.out.println("Неизвестна ошибка");
        }

        System.out.println("Input num: ");
         System.out.println(num);


         try{
            service1();

            service2();
         }catch(MyServiceEx1 e){
            System.out.println("Error input1: " + e.getMessage() );
            
         }catch(MyServiceEx2 e){
            System.out.println("Error input2: " + e.getMessage() );
            
         }

         new Catalog()
         service1();
        
    }



    private static void service1() throws MyServiceEx1 {
        int num = 0;
        try{
            Scanner scanner = new Scanner(System.in);
            num = scanner.nextInt();
        
        }catch(InputMismatchException e){
            System.out.println("Error input: " + e.getMessage() );
            throw new MyServiceEx1(e.getMessage());
        }catch(Exception e){
            System.out.println("Неизвестна ошибка");
        }
    }

    


    private static void service2(){
        int num = 0;
        try{
            Scanner scanner = new Scanner(System.in);
            num = scanner.nextInt();

         
        }catch(InputMismatchException e){
            System.out.println("Error input: " + e.getMessage() );
            throw new MyServiceEx2(e.getMessage());
        }catch(Exception e){
            System.out.println("Неизвестна ошибка");
        }
    }
}
