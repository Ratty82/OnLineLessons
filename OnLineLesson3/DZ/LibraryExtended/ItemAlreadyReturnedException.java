public class ItemAlreadyReturnedException extends LibraryException {
    public ItemAlreadyReturnedException(String itemId){
        super("Объект библиотки с ID: " + itemId + " уже возвращен");

    }
    
}
