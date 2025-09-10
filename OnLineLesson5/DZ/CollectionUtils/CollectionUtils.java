import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function;
import java.util.stream;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectionUtils {

    //- `filter(List<T> list, Predicate<T> predicate)` — фильтрация списка

    public <T> List<T> filterList(List<T> list, Predicate<T> predicate){
        
        List<T> filteredItems = list.stream()
            .filter(predicate)   
            .toList();

        return filteredItems;
    }

    //- `transform(List<T> list, Function<T, R> function)` — преобразование элементов

    public <T, R> List<R> transformList(List<T> list, Function<T, R> function){
        List<R> transformedItems = list.stream()
            .map(function)
            .toList();
        
        return transformedItems;
    }
    
    //- `findFirst(List<T> list, Predicate<T> predicate)` — поиск первого подходящего

     public <T> T findFirstList(List<T> list, Predicate<T> predicate){
        T foundItem = list.stream()
            .filter(predicate)
            .findFirst()
            .orElse(null);

        return foundItem;
    } 
    
    //- `partition(List<T> list, int size)` — разбиение списка на подсписки
    /*public <T> List<List<T>> divideList(List<T> list, int size){
        int subListSize = listSize/size;
        List<List<T>> dividedLists = list.stream()
            .collect(Collectors.groupingBy(subListSize))
            .values().stream()
            .toList();   

        return dividedLists;
    }*/


}
