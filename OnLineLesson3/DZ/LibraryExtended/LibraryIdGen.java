public class LibraryIdGen {
    private static int counterBook;
    private static int counterReader;
    private static String bookPrefix;
    private static String readerPrefix;

    public LibraryIdGen(int counterBook,int counterReader,String prefix){
        LibraryIdGen.counterBook = 0;
        LibraryIdGen.counterReader = 0;
        LibraryIdGen.bookPrefix = "B";
        LibraryIdGen.readerPrefix = "R";
    }

    public static String bookNextId(){
        return bookPrefix + Integer.toString(++counterBook);
    }

    public static String readerNextId(){
        return readerPrefix + Integer.toString(++counterReader);
    }
    
}
