//**Создайте базовый класс `LibraryItem`:**
//   - Поля: `id` (String), `title` (String), `isAvailable` (boolean)

public class LibraryItem {
    protected String id;
    protected String title;
    protected boolean isAvailable;

    public LibraryItem(String id,String title, boolean isAvailable){
    setAvaiability(isAvailable);
    setTitle(title);
    setId();

    }

    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Название не заполнено");
        }
        else {
            this.title = title;
        }   
    }

    public void setAvailability(boolean newState) {
        if (newState) {
            this.isAvailable = true;
        }
        if (!newState) {
            this.isAvailable = false;
        }
        else {
            throw new IllegalArgumentException("Неверное значение аргумента isAvailable")
        }   
    }    

    public String setId(String inId){
        if (inId == null || title.trim().isEmpty()) {
            return bookNextId();
        }
        else {return inId;}
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
