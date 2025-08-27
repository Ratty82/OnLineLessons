/*3. **Создайте класс `Library`:**
   - Поле: `items` (коллекция LibraryItem)
   - Методы: `addItem()`, `borrowItem(String id)`, `returnItem(String id)`, `findItemById(String id)` */
import java.util.ArrayList;

public class Library {
    private ArrayList<LibraryItem> items = new ArrayList<>();
}
