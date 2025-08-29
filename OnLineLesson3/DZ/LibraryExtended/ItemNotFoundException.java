public class ItemNotFoundException extends LibraryException {
    public ItemNotFoundException(String itemId){
        super("Элемент библиотеке с ID: " + itemId + " не найден");

    }
    
}
