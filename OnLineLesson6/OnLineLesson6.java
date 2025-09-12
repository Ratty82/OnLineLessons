import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OnLineLesson6 {

    public static void main(String[] args) {
        Optional<String> present = Optional.of("Hello");
        
        Optional<String> nullable = Optional.ofNullable("Hello");

        if(nullable.isPresent()){
            System.out.println("Реализуем  логику");
            String str = nullable.get();
            
        }

        String str2 = nullable.orElse("Дефолтное занчение");
        
        String str3 = nullable.orElseGet(()->"вызов сложной логики");
        
        String str4 = nullable.orElseThrow(()->new RuntimeException());
        

        nullable.ifPresent(value -> System.out.println("Есть заначение, обрабатываем."));

        nullable.ifPresentOrElse(
            value -> System.out.println("Есть заначение, обрабатываем."),
            ()->System.out.println("Прилетел нул")
            );



        // Работа с optinal
        OptionalInt length = Optional.of("Hello")
            .map(String::length);

        Integer length2 = Optional.ofNullable("Name")
            .map(String::length)
            .orElse(3);

            
        Optional.ofNullable("Name")
            .map(String::length)
            .ifPresent(value -> System.out.println("Есть заначение, обрабатываем."));

        //убрать пробелы с краю, отфильтровать по длине 5 символов, привести к верхнему регистру, если нулл, то вернуть "DEFAULT"
        String result = Optional.ofNullable(" Hello World ")
            .map(String::trim)
            .filter(n ->  n.length() > 5)
            .map(String::toUpperCase)
            .orElse("Дефолт");


        List<Optional<String>> opts = Arrays.asList(
            Optional.of("A"),
            Optional.empty(),
            Optional.of("B")
        );

        //чтобы в values были только значения без нулл. (А, B)
        List<String> values = opts.stream()
            .filter(Optional::isPresent)
            .map(Optional::get)
            .toList();

    }
    
}
