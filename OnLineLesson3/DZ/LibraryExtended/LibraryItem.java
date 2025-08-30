//**Создайте базовый класс `LibraryItem`:**
//   - Поля: `id` (String), `title` (String), `isAvailable` (boolean)

public abstract class LibraryItem {
    protected String id;
    protected String title;
    protected boolean isAvailable;

    public LibraryItem(String id,String title, boolean isAvailable){
    setAvailability(isAvailable);
    setTitle(title);
    setId(id);

    }

    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Название не заполнено");
        }
        else {
            this.title = title;
        }   
    }

    public void setAvailability(Boolean newState) {
    if (newState == null) {
        throw new IllegalArgumentException("isAvailable не может быть null");
    }
    this.isAvailable = newState;
}  

    public void setId(String inId){
        if (inId == null || inId.trim().isEmpty()) {
            this.id =  LibraryIdGen.bookNextId();
        }
        else {this.id = inId;}
    }

    
    //   - Абстрактный метод: `getItemType()` Комментарий: но получается что метод не абстрактый- он конкретный, но будет переопределяться наследниками 
    public String  getItemType(){
        return "LibraryItem";
    }

    public String getLibraryItemInfo(){
        return "Элемент: ";
    };

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
