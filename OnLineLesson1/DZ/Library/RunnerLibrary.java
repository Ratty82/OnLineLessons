import java.util.Scanner;

public class RunnerLibrary {
    
    public static void clearConsole() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        Library library = new Library();
        library.addBook(new Book("Пасынки вселенной", "Р.Хайнлайн", "ООО Издательство Эксмо", 2005, false, true));
        library.addBook(new Book("Астронавт Джонс", "Р.Хайнлайн", "ООО Издательство Эксмо", 2004, false, true));
        library.addBook(new Book("Дверь в лето", "Р.Хайнлайн", "ООО Издательство Эксмо", 2005, false, true));
        
        while (isRunning) {
            System.out.println("\n=== МЕНЮ ===");
            System.out.println("1. Добавить книгу");
            System.out.println("2. Найти книгу");
            System.out.println("3. Выдать книгу");
            System.out.println("4. Вернуть книгу");
            System.out.println("5. Показать все книги");
            System.out.println("0. Выход");
            System.out.print("Введите номер опции: ");
        
        
        int userChoice = scanner.nextInt();
        scanner.nextLine();        
        
        switch (userChoice) {
            case 1 : 
                System.out.println("Введите название");
                String title = scanner.nextLine();
                System.out.println("Введите автора");
                String author = scanner.nextLine();
                System.out.println("Введите издательство");
                String issuer = scanner.nextLine();
                System.out.println("Введите год издания");
                int year = scanner.nextInt();
                scanner.nextLine();
                library.addBook(new Book(title,author,issuer,year,false,true));
                break;
            case 2:
                System.out.println("Введите название");
                String title2 = scanner.nextLine();
                Book found = library.searchBook(title2);
                if (found != null) {System.out.println("Найдена книга: " + found.getBookName()+","+ found.getBookAuthor()+","+ found.getBookIssuer()+","+ found.getBookYear()+",на балансе:"+ found.isAvailable()+",выдана:"+ found.isIssued());} 
                else {System.out.println("Книга не найдена");}
                break;
            case 3:
                System.out.println("Введите название");
                String title3 = scanner.nextLine();
                library.issueBook(title3);
                break;
            case 4:
                System.out.println("Введите название");
                String title4 = scanner.nextLine();
                library.returnBook(title4);
                break;
            case 5:
                System.out.println("Все книги:");
                library.listBooks();
                break;
            case 0:
                System.out.println("До свидания!");
                isRunning = false;
                break;
            default: 
                System.out.println("Неверный выбор");
                break;

        }
    }
        
        
   }
}


