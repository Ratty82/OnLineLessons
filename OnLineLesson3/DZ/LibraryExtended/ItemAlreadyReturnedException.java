public class ItemAlreadyReturnedException extends LibraryException {
    public ItemAlreadyReturnedException(String itemId){
        super("Элемент библиотки с ID: " + itemId + " уже возвращен");

    }
    
}
