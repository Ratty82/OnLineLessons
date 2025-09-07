import java.util.*;
import java.util.stream.*;

public class ShoppingCart<T extends Product> {
    
    private Map<Integer,T> items = new HashMap<>();

    //- `add(T item)` — добавление товара
    //вопрос - как при таком обобщении сделать валидацию item?
    public void addItem(Integer id,T item) throws IllegalArgumentException{     
        if (id > 0){
            items.put(id, item);}
        else {throw new IllegalArgumentException();}
    }

    //- `remove(T item)` — удаление товара
    public void removeItem(Integer id) throws IllegalArgumentException{
        if (id > 0){ 
            items.remove(id);}
        else {throw new IllegalArgumentException("Number should be positive");}
    }

    //- `getTotalPrice()` — общая стоимость
    // выносим метод getPrice в интерфейс Priceable, чтобы любой объект типа T реализовывал метод getPrice()
    public double getTotalPrice(){
        double sum = items.values().stream()
                .mapToDouble(t -> t.getPrice())
                .sum();
        return sum;
    }

    //- `getItems()` — список товаров
    // выносим метод getName() в интерфейс Nameable, чтобы любой объект типа T реализовывал метод getName()
    public void getItems(){
        List<String> itemList = items.values().stream()
                .map(t -> t.getName())
                .toList();
        System.out.println(itemList);
    }

    //- `getMostExpensive()` — самый дорогой товар
    // пользуемся интерфейсом Priceable 
    public void getMostExpensive(){
        T maxItem = items.values().stream()
                .max(Comparator.comparing(t -> t.getPrice()))
                .orElse(null);
        System.out.println("Item : " + maxItem.getName() + " has max price : " + maxItem.getPrice());
    }







   

   






   
    







    
}
