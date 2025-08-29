/*3. **Создайте класс `Library`:**
   - Поле: `items` (коллекция LibraryItem)
   - Методы: `addItem()`, `borrowItem(String id)`, `returnItem(String id)`, `findItemById(String id)` */
import java.util.ArrayList;
import java.util.List;

public class Library {
    private  List<LibraryItem> items = new ArrayList<>();
    private  List<Reader> readers = new ArrayList<>();

    public void addItem(LibraryItem libItem){
        items.add(libItem);
    }

    public void addReader(Reader reader) {
        readers.add(reader);
    }

    public LibraryItem findItemById(String id) throws ItemNotFoundException{
        if (id == null || id.isBlank()) {
            throw new ItemNotFoundException("Значение отсутствует");
        }
        else {
        for (LibraryItem item : items) {
            if (item.getId().equalsIgnoreCase(id)) {
                return item;
                    }           
           }
        throw new ItemNotFoundException(id); 
        }
    }

    public Reader findReaderById(String id) throws ReaderNotFoundException{
        if (id == null || id.isBlank()) {
            throw new ReaderNotFoundException("Значение отсутствует");
        }
        else {
        for (Reader reader : readers) {
            if (reader.getId().equalsIgnoreCase(id)) {
                return reader;
                    }         
           }
        throw new ReaderNotFoundException(id);  
        }
    }

    public void borrowItem(String bookId,String readerId) throws LibraryException,ItemNotFoundException,ItemNotAvailableException,ReaderNotFoundException{
        
        LibraryItem foundItem = findItemById(bookId);
        Reader foundReader = findReaderById(readerId);
        
        if (foundReader.hasBorrowedItems(foundItem.getId())){
            throw new LibraryException("Такой объект уже взят");
        }
        
        if (foundItem.isAvailable()) {
                foundReader.setBorrowedItem(foundItem);
                foundItem.setAvailability(false);
        }
        else {throw new ItemNotAvailableException(foundItem.getId());}
    }  

    public void returnItem(String bookId, String readerId) throws LibraryException,ItemNotFoundException,ItemAlreadyReturnedException{
        
        LibraryItem foundItem = findItemById(bookId);
        Reader foundReader = findReaderById(readerId);

        if (!foundReader.hasBorrowedItems(bookId)){
            throw new ItemAlreadyReturnedException(bookId);
        }
        else {
                foundReader.removeBorrowedItem(foundItem);
                foundItem.setAvailability(true);
        }

    }


}
