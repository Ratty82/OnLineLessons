public class App {
    public static void main(String[] args) {
        System.out.println("1. Создадим библиотеку и читателей");
        Library library = new Library();
        library.addItem(new Book("","Пасынки вселенной",true,"Хайнлайн","1442-BBN-1232-EW"));
        library.addItem(new Magazine("","Огонек",true,1,1));
        library.addReader(new Reader("","Евгений",null));


    }
    
}
