//**Создайте базовый класс `LibraryItem`:**
//   - Поля: `id` (String), `title` (String), `isAvailable` (boolean)

public class LibraryItem {
    protected String id;
    protected String title;
    protected boolean isAvailable;

    public LibraryItem(String id,String title, boolean isAvailable){
    this.isAvailable = true;
    setTitle(title);
    this.id = bookNextId();

    }

    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Название не заполнено");
        }
        else {
            this.title = title;
        }   
    }
    
    //   - Абстрактный метод: `getItemType()` Комментарий: но получается что метод не абстрактый- он конкретный, но будет переопределяться наследниками 
    public String  getItemType(){
        return "LibraryItem";
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

        

    
}
