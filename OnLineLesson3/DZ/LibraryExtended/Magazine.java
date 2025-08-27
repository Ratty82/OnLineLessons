/**Создайте классы-наследники:**
   - `Book` (дополнительные поля: `author`, `isbn`)
   - `Magazine` (дополнительные поля: `issueNumber`, `month`)*/
public class Magazine extends LibraryItem{
    private int issueNumber;
    private int month;

    public Magazine (String id,String title, boolean isAvailable,int issueNumber,int month){
        super(id,title,isAvailable);
        setIssueNumber(issueNumber);
        setMonth(month);
    }

    public void setIssueNumber(int issueNumber){
        if (issueNumber <= 0 ) {
            throw new IllegalArgumentException("Номер журнала должен быть больше нуля");
        }
        else {
            this.issueNumber = issueNumber;
        }  
    }

    public void setMonth(int month){
        if (month <= 0 ) {
            throw new IllegalArgumentException("Номер журнала должен быть больше нуля");
        }
        else {
            this.month = month;
        }  
    }

    @Override
    public String  getItemType(){
        return "Magazine";
    }

    

    

    
    
}
