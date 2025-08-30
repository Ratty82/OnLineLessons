public class ReaderNotFoundException extends LibraryException {
    public ReaderNotFoundException(String readerId){
        super("Читатель с ID: " + readerId + " не найден");

    }
    
}
