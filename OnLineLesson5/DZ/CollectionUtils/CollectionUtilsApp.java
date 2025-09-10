import java.util.List;
import java.util.function.Function;

public class CollectionUtilsApp {
    public static void main(String[] args) {
        
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9);

        CollectionUtils methods = new CollectionUtils();

        List<Integer> filteredNums = methods.filterList(numbers,n -> n % 2 == 0);

        List<Double> transformedNums = methods.transformList(numbers,n -> n / 3.0);

        Integer foundItem = methods.findFirstList(numbers, n -> n == 3);

        //List<List<Integer>> dividedItems = methods.divideList(numbers, 4); 
        

        System.out.println("1. Фильтрация элементов списка: фильтрация только чисел которые деляться на 2");
        System.out.println("Исходный список: " + numbers);
        System.out.println("Отфильтрованный список: " + filteredNums);
        System.out.println("");
        System.out.println("2. Преобразование элементов списка: деление всех элементов на 3 , возвращает double");
        System.out.println("Исходный список: " + numbers);
        System.out.println("Преобразованный список: " + transformedNums);
        System.out.println("");
        System.out.println("3. Поиск первого элемента удовлетворяющего критерию (ищем элемент равный 3)");
        System.out.println("Исходный список: " + numbers);
        System.out.println("Найденный элемент: " + foundItem);
        /*System.out.println("");
        System.out.println("4. Делим список на подсписки (делим на 4)");
        System.out.println("Исходный список: " + numbers);
        System.out.println("Результат: " + dividedItems);
        System.out.println("");*/






    }
    
}
