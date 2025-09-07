public class ItemIdGen {
    private static int counter;
    
    public static int itemNextId(){
        return ++counter;
    }
    
}