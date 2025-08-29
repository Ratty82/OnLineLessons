/***Создайте класс `Reader`:**
   - Поля: `name`, `readerId`, `borrowedItems` (список)
   - Методы для работы с взятыми книгами */

import java.util.ArrayList;
import java.util.List;   

    public class Reader {
    private final String readerId;
    private String name;
    private List<LibraryItem> borrowedItems;

    public Reader(String readerId, String name, ArrayList<LibraryItem> borrowedItems){
        this.readerId = LibraryIdGen.readerNextId();
        this.borrowedItems = new ArrayList<>();
        setName(name);
    }

    public String getId() {
        return readerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Имя не заполнено");
        }
        else {
            this.name = name;
        }   
    }

    public void setBorrowedItem(LibraryItem item){
        borrowedItems.add(item);
    }

    public void removeBorrowedItem(LibraryItem item){
        borrowedItems.remove(item);
    }

    public ArrayList<LibraryItem> getBorrowedItems() {
        return borrowedItems;
    }

    public boolean hasBorrowedItems(String bookId) {
    for (LibraryItem item : borrowedItems) {
        if (item.getId().equalsIgnoreCase(bookId)) {
            return true;
        }
    }
    return false;
}
    
}
