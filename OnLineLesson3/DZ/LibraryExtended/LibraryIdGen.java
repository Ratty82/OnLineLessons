public class LibraryIdGen {
    private static int counterBook;
    private static int counterReader;
    private static String bookPrefix = "B";
    private static String readerPrefix = "R";

    public static String bookNextId(){
        return bookPrefix + Integer.toString(++counterBook);
    }

    public static String readerNextId(){
        return readerPrefix + Integer.toString(++counterReader);
    }
    
}
