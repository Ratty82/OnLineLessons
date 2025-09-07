public class AppLibrary {
    public static void main(String[] args) {
        System.out.println("1. Создадим библиотеку и читателей");
         System.out.println("");
        Library library = new Library();
        library.addItem(new Book("","Пасынки вселенной",true,"Хайнлайн","1442-BBN-1232-EW"));
        library.addItem(new Book("","Астронавт Джонс",true,"Хайнлайн","1442-SS-1132-EW"));
        library.addItem(new Magazine("","Огонек",true,1,1));
        library.addItem(new Magazine("","Огонек",true,2,2));
        library.addReader(new Reader("Евгений",null));
        library.addReader(new Reader("Константин",null));

        library.listItems();
        System.out.println("");
        library.listReaders();
        System.out.println("");

        System.out.println("2. Протестируем выдачу книг читателю Евгений");
        System.out.println("");
        System.out.println("--успешная выдача");
        
        try {library.borrowItem("B1", "R1");}
        catch (ItemNotFoundException inf) {
            System.out.println("Ошибка : " + inf.getMessage());
        }
        catch (ItemNotAvailableException ina) {
            System.out.println("Ошибка : " + ina.getMessage());
        }
        catch (ReaderNotFoundException rnf) {
            System.out.println("Ошибка : " + rnf.getMessage());
        }
        catch (LibraryException le) {
            System.out.println("Ошибка : " + le.getMessage());
        }
        finally{
            System.out.println("Статистика библиотеки и читателя");
            library.listItems();
            try {
            library.listBorrowedItemsByReader("R1");
            } catch (ReaderNotFoundException rnf) {System.out.println("Ошибка : " + rnf.getMessage());}
            
        }

        System.out.println("--неверная книга, неверный читатель");
        
        try {library.borrowItem("B12", "R12");}
        catch (ItemNotFoundException inf) {
            System.out.println("Ошибка : " + inf.getMessage());
        }
        catch (ItemNotAvailableException ina) {
            System.out.println("Ошибка : " + ina.getMessage());
        }
        catch (ReaderNotFoundException rnf) {
            System.out.println("Ошибка : " + rnf.getMessage());
        }
        catch (LibraryException le) {
            System.out.println("Ошибка : " + le.getMessage());
        }
        finally{
            System.out.println("Статистика библиотеки и читателя");
            library.listItems();
            try {
            library.listBorrowedItemsByReader("R12");
            } catch (ReaderNotFoundException rnf) {System.out.println("Ошибка : " + rnf.getMessage());}
            
        }

        System.out.println("--книга уже взята этим же читетелем");
        
        try {library.borrowItem("B1", "R1");}
        catch (ItemNotFoundException inf) {
            System.out.println("Ошибка : " + inf.getMessage());
        }
        catch (ItemNotAvailableException ina) {
            System.out.println("Ошибка : " + ina.getMessage());
        }
        catch (ReaderNotFoundException rnf) {
            System.out.println("Ошибка : " + rnf.getMessage());
        }
        catch (LibraryException le) {
            System.out.println("Ошибка : " + le.getMessage());
        }
        finally{
            System.out.println("Статистика библиотеки и читателя");
            library.listItems();
            try {
            library.listBorrowedItemsByReader("R1");
            } catch (ReaderNotFoundException rnf) {System.out.println("Ошибка : " + rnf.getMessage());}
            
        }

         System.out.println("--книга уже взята другим читателем");
        
        try {library.borrowItem("B1", "R2");}
        catch (ItemNotFoundException  | ItemNotAvailableException inf) {
            System.out.println("Ошибка : " + inf.getMessage());
        }
        catch (ReaderNotFoundException rnf) {
            System.out.println("Ошибка : " + rnf.getMessage());
        }
        catch (LibraryException le) {
            System.out.println("Ошибка : " + le.getMessage());
        }
        finally{
            System.out.println("Статистика библиотеки и читателя:");
            library.listItems();
            try {
            library.listBorrowedItemsByReader("R2");
            } catch (ReaderNotFoundException rnf) {System.out.println("Ошибка : " + rnf.getMessage());}
            
        }


        System.out.println("3. Протестируем возврат книги читателем Евгений");
        System.out.println("--успешный возврат");
        
        try {library.returnItem("B1", "R1");}
        catch (ItemNotFoundException inf) {
            System.out.println("Ошибка : " + inf.getMessage());
        }
        catch (ReaderNotFoundException rnf) {
            System.out.println("Ошибка : " + rnf.getMessage());
        }
        catch (ItemAlreadyReturnedException iar) {
            System.out.println("Ошибка : " + iar.getMessage());
        }
        catch (LibraryException le) {
            System.out.println("Ошибка : " + le.getMessage());
        }
        finally{
            System.out.println("Статистика библиотеки и читателя:");
            library.listItems();
            try {
            library.listBorrowedItemsByReader("R1");
            } catch (ReaderNotFoundException rnf) {System.out.println("Ошибка : " + rnf.getMessage());}
            
        }
        
        System.out.println("--книга уже возвращена");
        
        try {library.returnItem("B1", "R1");}
        catch (ItemNotFoundException inf) {
            System.out.println("Ошибка : " + inf.getMessage());
        }
        catch (ReaderNotFoundException rnf) {
            System.out.println("Ошибка : " + rnf.getMessage());
        }
        catch (ItemAlreadyReturnedException iar) {
            System.out.println("Ошибка : " + iar.getMessage());
        }
        catch (LibraryException le) {
            System.out.println("Ошибка : " + le.getMessage());
        }
        finally{
            System.out.println("Статистика библиотеки и читателя:");
            library.listItems();
            try {
            library.listBorrowedItemsByReader("R1");
            } catch (ReaderNotFoundException rnf) {System.out.println("Ошибка : " + rnf.getMessage());}
            
        }
        
        System.out.println("--читатель не найден");
        
        try {library.returnItem("B1", "R12");}
        catch (ItemNotFoundException inf) {
            System.out.println("Ошибка : " + inf.getMessage());
        }
        catch (ReaderNotFoundException rnf) {
            System.out.println("Ошибка : " + rnf.getMessage());
        }
        catch (ItemAlreadyReturnedException iar) {
            System.out.println("Ошибка : " + iar.getMessage());
        }
        catch (LibraryException le) {
            System.out.println("Ошибка : " + le.getMessage());
        }
        finally{
            System.out.println("Статистика библиотеки и читателя:");
            library.listItems();
            try {
            library.listBorrowedItemsByReader("R12");
            } catch (ReaderNotFoundException rnf) {System.out.println("Ошибка : " + rnf.getMessage());}
            
        }
        
        System.out.println("--книга не найдена");
        
        try {library.returnItem("B12", "R1");}
        catch (ItemNotFoundException inf) {
            System.out.println("Ошибка : " + inf.getMessage());
        }
        catch (ReaderNotFoundException rnf) {
            System.out.println("Ошибка : " + rnf.getMessage());
        }
        catch (ItemAlreadyReturnedException iar) {
            System.out.println("Ошибка : " + iar.getMessage());
        }
        catch (LibraryException le) {
            System.out.println("Ошибка : " + le.getMessage());
        }
        finally{
            System.out.println("Статистика библиотеки и читателя:");
            library.listItems();
            try {
            library.listBorrowedItemsByReader("R1");
            } catch (ReaderNotFoundException rnf) {System.out.println("Ошибка : " + rnf.getMessage());}
            
        }

    }
    
}
