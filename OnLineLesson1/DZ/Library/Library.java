import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    
    public void addBook(Book book){
        books.add(book);    
    }


    public void listBooks() {
        for (Book b : books) {
            System.out.println(b.getBookName()+","+b.getBookAuthor()+","+b.getBookYear()+","+b.getBookIssuer() + "," + "На балансе:" + b.isAvailable() + "," + "Выдана:" + b.isIssued());
        }           
    }

    public Book searchBook(String bookTitle) {
    for (Book b : books) {
        if (b.getBookName().equalsIgnoreCase(bookTitle)) {return b; }
    }        
    return null;
    
    }

    public Boolean issueBook(String bookTitle) {
        Book foundBook = searchBook(bookTitle);
        if (foundBook != null && foundBook.isAvailable() && foundBook.isIssued()) {
            foundBook.setIssued(true);
            System.out.println("Выдана книга: "+ foundBook.getBookName());
        }
        
        return foundBook==null ? null: foundBook.isIssued();
    }

    public boolean returnBook(String bookTitle) {
        Book foundBook = searchBook(bookTitle);
        if (foundBook != null && foundBook.isIssued() && foundBook.isAvailable()) {foundBook.setIssued(false);
                        System.out.println("Выдана книга: "+ foundBook.getBookName());}
        else {}

        return foundBook.isIssued();    

    }

}
