/**Создайте классы-наследники:**
   - `Book` (дополнительные поля: `author`, `isbn`)
   - `Magazine` (дополнительные поля: `issueNumber`, `month`)*/
public class Book extends LibraryItem{
    private String author;
    private String isbn;

    public Book (String id,String title, boolean isAvailable,String author,String isbn){
        super(id,title,isAvailable);
        setAuthor(author);
        setIsbn(isbn);
    }

    public void setAuthor(String author) {
        if (author == null || author.trim().isEmpty()) {
            throw new IllegalArgumentException("Автор не заполнен");
        }
        else {
            this.author = author;
        }   
    }

    public void setIsbn(String isbn) {
        if (isbn == null || isbn.trim().isEmpty()) {
            throw new IllegalArgumentException("Автор не заполнен");
        }
        else {
            this.isbn = isbn;
        }   
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String  getItemType(){
        return "Book";
    }

    
    
}
