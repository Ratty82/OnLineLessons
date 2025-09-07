import java.util.ArrayList;
import java.util.List;

public class Lesson5 {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add(";;");
        list.add(111);

        String s = (String) list.get(1);


        
        List<String> list2 = new ArrayList<>();
        list.add(";;");
        // list.add(111);

        String s2 = (String) list.get(1);


        Box<String> strBox = new Box<>();
        strBox.put("item");

        Box<Integer> intbox = new Box<>();
        strBox.put(1111);
        
        NumberBox<Integer> numBox = new NumberBox<>(111);
        System.out.println(numBox.getDoubleVal());


        List<String> strings = new ArrayList<>();
        List<Integer> ints= new ArrayList<>();

         // strings.getClass() == ints.getClass() ???  true

         // T[] array = new T[10];

    }


    public static <T> void swap(T[] array, int i, int j){
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
