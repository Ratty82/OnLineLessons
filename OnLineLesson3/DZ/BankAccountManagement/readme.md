## Задание 1: Система управления банковскими счетами (Базовый уровень)

### Описание:
Создайте систему для управления банковскими счетами с использованием ООП и обработкой исключений.

### Требования:

1. **Создайте класс `BankAccount`:**
   - Поля: `accountNumber` (String), `balance` (double), `ownerName` (String)
   - Конструктор для инициализации всех полей
   - Геттеры для всех полей
   - Методы: `deposit(double amount)`, `withdraw(double amount)`

2. **Создайте собственные исключения:**
   - `InsufficientFundsException` - когда на счету недостаточно средств
   - `InvalidAmountException` - когда сумма операции отрицательная или равна нулю

3. **Реализуйте логику:**
   - Метод `deposit` должен выбрасывать `InvalidAmountException` при некорректной сумме
   - Метод `withdraw` должен выбрасывать `InsufficientFundsException` или `InvalidAmountException`
   - Создайте тестовый класс с методом main, который демонстрирует работу с исключениями

### Пример использования:
```java
try {
    BankAccount account = new BankAccount("12345", 1000.0, "Иван Иванов");
    account.withdraw(1500.0); // Должно выбросить InsufficientFundsException
} catch (InsufficientFundsException e) {
    System.out.println("Ошибка: " + e.getMessage());
}
