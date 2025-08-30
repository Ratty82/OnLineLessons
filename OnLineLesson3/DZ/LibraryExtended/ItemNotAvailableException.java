public class ItemNotAvailableException extends LibraryException {
    public ItemNotAvailableException(String itemId){
        super("Элемент библиотеки с ID: " + itemId + " взят другим читателем");
    }
    
}
