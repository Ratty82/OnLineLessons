## Задание 3: Система управления библиотекой (Продвинутый уровень)

### Описание:
Создайте комплексную систему управления библиотекой с использованием всех принципов ООП и продвинутой обработки исключений.

### Требования:

1. **Создайте базовый класс `LibraryItem`:**
   - Поля: `id` (String), `title` (String), `isAvailable` (boolean)
   - Абстрактный метод: `getItemType()`

2. **Создайте классы-наследники:**
   - `Book` (дополнительные поля: `author`, `isbn`)
   - `Magazine` (дополнительные поля: `issueNumber`, `month`)

3. **Создайте класс `Library`:**
   - Поле: `items` (коллекция LibraryItem)
   - Методы: `addItem()`, `borrowItem(String id)`, `returnItem(String id)`, `findItemById(String id)`

4. **Создайте класс `Reader`:**
   - Поля: `name`, `readerId`, `borrowedItems` (список)
   - Методы для работы с взятыми книгами

5. **Создайте иерархию исключений:**
   - `LibraryException` (базовое исключение)
   - `ItemNotFoundException extends LibraryException`
   - `ItemNotAvailableException extends LibraryException`
   - `ItemAlreadyReturnedException extends LibraryException`
   - `ReaderNotFoundException extends LibraryException`

6. **Дополнительные требования:**
   - Используйте инкапсуляцию (private поля, public методы)
   - Реализуйте полиморфизм при работе с разными типами предметов
   - Создайте несколько catch блоков для обработки разных типов исключений
   - Используйте finally блок для логирования операций

### Пример использования:
```java
Library library = new Library();
Reader reader = new Reader("Анна Петрова", "R001");

try {
    library.addItem(new Book("B001", "Война и мир", "Толстой", "978-5-17-085785-0"));
    LibraryItem item = library.borrowItem("B001");
    reader.borrowItem(item);
    library.returnItem("B001");
} catch (ItemNotFoundException e) {
    System.out.println("Предмет не найден: " + e.getMessage());
} catch (ItemNotAvailableException e) {
    System.out.println("Предмет недоступен: " + e.getMessage());
} catch (LibraryException e) {
    System.out.println("Ошибка библиотеки: " + e.getMessage());
} finally {
    System.out.println("Операция завершена");
}
```

---

## Критерии оценки:

1. **Правильное использование принципов ООП:**
   - Инкапсуляция
   - Наследование
   - Полиморфизм
   - Абстракция

2. **Корректная обработка исключений:**
   - Создание собственных исключений
   - Использование try-catch-finally
   - Правильное использование throws и throw

3. **Качество кода:**
   - Читаемость
   - Соответствие соглашениям Java
   - Логичность структуры

4. **Тестирование:**
   - Демонстрация всех возможных сценариев
   - Проверка обработки исключений