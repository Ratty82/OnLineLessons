public class Book {
    private String bookName;
    private String bookAuthor;
    private String bookIssuer;
    private int bookYear;
    private boolean isIssued;
    private boolean isAvailable;
    
    public Book(String bookName, String bookAuthor, String bookIssuer, int bookYear, boolean isIssued,
            boolean isAvailable) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookIssuer = bookIssuer;
        this.bookYear = bookYear;
        this.isIssued = isIssued;
        this.isAvailable = isAvailable;
    }

    public String getBookName() {
        return bookName;
    }
   
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    
    public String getBookAuthor() {
        return bookAuthor;
    }
    
    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }
    
    public String getBookIssuer() {
        return bookIssuer;
    }
    
    public void setBookIssuer(String bookIssuer) {
        this.bookIssuer = bookIssuer;
    }
    
    public int getBookYear() {
        return bookYear;
    }
    
    public void setBookYear(int bookYear) {
        this.bookYear = bookYear;
    }
    
    public boolean isIssued() {
        return isIssued;
    }
    
    public void setIssued(boolean isIssued) {
        this.isIssued = isIssued;
    }
    
    public boolean isAvailable() {
        return isAvailable;
    }
    
    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    




}
