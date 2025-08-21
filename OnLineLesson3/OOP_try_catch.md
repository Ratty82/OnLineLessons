## Часть 1: Объектно-ориентированное программирование в Java

### Четыре столпа ООП определяют архитектуру современных Java-приложений

Объектно-ориентированное программирование представляет собой парадигму, основанную на концепции объектов, которые содержат данные (поля) и код (методы). Четыре основных принципа ООП работают синергически для создания гибких, масштабируемых и поддерживаемых решений.

### Инкапсуляция защищает целостность данных

**Инкапсуляция** — это принцип сокрытия внутренней реализации объекта от внешнего мира и предоставления контролируемого доступа через открытый интерфейс. Этот принцип обеспечивает **защиту данных от некорректного изменения** и позволяет изменять внутреннюю реализацию без нарушения работы зависимого кода.

```java
public class BankAccount {
    private double balance;  // сокрытое состояние
    private String accountNumber;
    
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        }
    }
    
    // Контролируемый доступ к данным
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
    
    public double getBalance() {
        return balance;  // только для чтения
    }
}
```

Ключевые преимущества инкапсуляции включают валидацию входных данных, предотвращение некорректных состояний объекта и возможность логирования операций без изменения клиентского кода.

### Наследование обеспечивает повторное использование кода

**Наследование** позволяет создавать новые классы на основе существующих, заимствуя их свойства и поведение. В Java поддерживается только **одиночное наследование классов**, что предотвращает проблему "алмаза" и упрощает понимание иерархии.

```java
// Абстрактный базовый класс
public abstract class Animal {
    protected String name;
    protected int age;
    
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void sleep() {
        System.out.println(name + " спит");
    }
    
    // Абстрактный метод для реализации в подклассах
    public abstract void makeSound();
}

// Конкретная реализация
public class Dog extends Animal {
    private String breed;
    
    public Dog(String name, int age, String breed) {
        super(name, age);  // вызов конструктора родителя
        this.breed = breed;
    }
    
    @Override
    public void makeSound() {
        System.out.println(name + " лает: Гав-гав!");
    }
    
    public void wagTail() {  // дополнительное поведение
        System.out.println(name + " виляет хвостом");
    }
}
```

Наследование создает **отношения "IS-A"**: собака это животное. Ключевое слово `super` обеспечивает доступ к функциональности родительского класса, а аннотация `@Override` гарантирует корректное переопределение методов.

### Полиморфизм обеспечивает гибкость через единый интерфейс

**Полиморфизм** позволяет использовать объекты с одинаковым интерфейсом без знания их конкретной реализации. В Java существует два типа полиморфизма: времени компиляции (перегрузка методов) и времени выполнения (переопределение методов).

```java
// Runtime полиморфизм через интерфейсы
public interface Shape {
    double calculateArea();
    void draw();
}

public class Circle implements Shape {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public void draw() {
        System.out.println("Рисуем круг");
    }
}

// Использование полиморфизма
Shape[] shapes = {new Circle(5), new Rectangle(4, 6)};
for (Shape shape : shapes) {
    shape.draw();  // вызывается соответствующая реализация
    System.out.println("Площадь: " + shape.calculateArea());
}
```

**Compile-time полиморфизм** реализуется через перегрузку методов с различными параметрами:

```java
public class Calculator {
    public int add(int a, int b) { return a + b; }
    public double add(double a, double b) { return a + b; }
    public int add(int a, int b, int c) { return a + b + c; }
}
```

### Абстракция упрощает сложность через сокрытие деталей

**Абстракция** представляет существенные характеристики объекта, скрывая несущественные детали реализации. В Java абстракция достигается через абстрактные классы и интерфейсы.

Абстрактные классы могут содержать как конкретные, так и абстрактные методы, предоставляя **частичную реализацию** для наследников:

```java
public abstract class GraphicObject {
    protected int x, y;
    
    public GraphicObject(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    // Конкретный метод
    public void moveTo(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }
    
    // Абстрактные методы для реализации в подклассах
    public abstract void draw();
    public abstract double calculateArea();
    
    // Шаблонный метод
    public void displayInfo() {
        System.out.println("Позиция: (" + x + ", " + y + ")");
        System.out.println("Площадь: " + calculateArea());
    }
}
```

### Модификаторы доступа контролируют видимость элементов

Java предоставляет четыре уровня доступа, обеспечивающих **принцип наименьших привилегий**:

| Модификатор | Внутри класса | Внутри пакета | Подкласс | Везде |
|-------------|---------------|---------------|----------|-------|
| **private** | ✅ | ❌ | ❌ | ❌ |
| **default** | ✅ | ✅ | ❌ | ❌ |
| **protected** | ✅ | ✅ | ✅ | ❌ |
| **public** | ✅ | ✅ | ✅ | ✅ |

```java
public class Person {
    public String name;           // доступно везде
    protected int age;           // доступно в пакете и наследникам
    String address;              // доступно только в пакете
    private String phoneNumber;   // доступно только в классе
    
    private void validatePhone() {  // внутренняя логика
        // проверка номера телефона
    }
    
    public void updatePhone(String phone) {  // публичный API
        validatePhone();
        this.phoneNumber = phone;
    }
}
```

### Статические элементы принадлежат классу, не экземплярам

**Статические переменные и методы** существуют в единственном экземпляре на уровне класса и доступны без создания объектов:

```java
public class Counter {
    private static int totalCount = 0;  // общая для всех экземпляров
    private int instanceId;
    
    public Counter() {
        instanceId = ++totalCount;  // уникальный ID для каждого объекта
    }
    
    public static int getTotalCount() {  // статический метод
        return totalCount;
    }
    
    // Статический блок инициализации
    static {
        System.out.println("Класс Counter загружен");
        totalCount = 0;
    }
}

// Использование без создания экземпляра
int count = Counter.getTotalCount();
```

**Ограничения статических методов** включают невозможность обращения к нестатическим элементам и использования ключевых слов `this` или `super`.

### Интерфейсы определяют контракты поведения

**Интерфейсы** задают набор методов, которые должны быть реализованы классами, обеспечивая **множественное наследование типов** в Java:

```java
public interface Vehicle {
    // Константы (неявно public static final)
    int MAX_SPEED = 300;
    
    // Абстрактные методы (неявно public abstract)
    void start();
    void stop();
    
    // Default методы (Java 8+)
    default void honk() {
        System.out.println("Beep beep!");
    }
    
    default void performMaintenance() {
        checkEngine();
        checkTires();
    }
    
    // Статический метод
    static boolean isValidSpeed(int speed) {
        return speed >= 0 && speed <= MAX_SPEED;
    }
    
    // Приватные методы (Java 9+) для внутреннего использования
    private void checkEngine() {
        System.out.println("Проверяем двигатель...");
    }
    
    private void checkTires() {
        System.out.println("Проверяем шины...");
    }
}

public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Двигатель запущен");
    }
    
    @Override
    public void stop() {
        System.out.println("Автомобиль остановлен");
    }
    
    // Можем переопределить default метод
    @Override
    public void honk() {
        System.out.println("Автомобильный гудок: Бип-бип!");
    }
}
```

**Default методы** позволяют добавлять новую функциональность в интерфейсы без нарушения обратной совместимости, что критично для эволюции API.

### Выбор между абстрактными классами и интерфейсами

**Используйте абстрактные классы** когда нужно:
- Предоставить общую реализацию для связанных классов
- Определить нестатические поля
- Использовать модификаторы доступа отличные от public
- Обеспечить отношения "IS-A"

**Используйте интерфейсы** когда нужно:
- Определить контракт для несвязанных классов
- Достичь множественного наследования типов
- Обеспечить слабую связанность компонентов
- Определить способности ("CAN-DO" отношения)

## Часть 2: Система исключений в Java

### Иерархия исключений обеспечивает структурированную обработку ошибок

Система исключений Java построена на иерархии с корневым классом **Throwable**, от которого наследуются все объекты, способные быть выброшенными. Эта архитектура разделяет проблемы на **восстанавливаемые исключения** (Exception) и **критические системные ошибки** (Error).

```
Throwable
├── Error (системные ошибки)
│   ├── OutOfMemoryError
│   ├── StackOverflowError
│   └── VirtualMachineError
└── Exception (восстанавливаемые исключения)
    ├── IOException (checked)
    ├── SQLException (checked)
    └── RuntimeException (unchecked)
        ├── NullPointerException
        ├── IllegalArgumentException
        └── IndexOutOfBoundsException
```

**Класс Error** представляет серьезные системные проблемы, такие как нехватка памяти или переполнение стека, которые обычно **не предназначены для обработки** в приложении и указывают на критические состояния JVM.

### Checked и unchecked исключения определяют стратегию обработки

**Checked исключения** (проверяемые) должны быть обязательно обработаны или объявлены в сигнатуре метода. Они представляют **ожидаемые проблемы внешнего характера**, от которых приложение может восстановиться:

```java
// Checked exception - требует обработки
public void readConfigFile(String fileName) throws IOException {
    try (BufferedReader reader = Files.newBufferedReader(
            Paths.get(fileName), StandardCharsets.UTF_8)) {
        
        String line;
        while ((line = reader.readLine()) != null) {
            processConfigLine(line);
        }
    } catch (IOException e) {
        logger.error("Ошибка чтения конфигурации: " + fileName, e);
        throw e;  // re-throw для обработки на более высоком уровне
    }
}
```

**Unchecked исключения** (непроверяемые) наследуются от RuntimeException и обычно указывают на **программные ошибки**, которые можно предотвратить правильным программированием:

```java
public class UserService {
    public User findUser(String userId) {
        if (userId == null) {
            // RuntimeException - указывает на ошибку программиста
            throw new IllegalArgumentException("User ID не может быть null");
        }
        
        User user = database.findById(userId);
        if (user == null) {
            // Checked exception - нормальная бизнес-ситуация
            throw new UserNotFoundException("Пользователь не найден: " + userId);
        }
        return user;
    }
}
```

### Try-catch-finally обеспечивает структурированную обработку

Механизм **try-catch-finally** предоставляет надежный способ обработки исключений с гарантированным выполнением cleanup-кода:

```java
public void processPayment(double amount, String cardNumber) {
    PaymentGateway gateway = null;
    try {
        gateway = PaymentGatewayFactory.create();
        gateway.connect();
        
        validatePaymentAmount(amount);
        gateway.processPayment(amount, cardNumber);
        
    } catch (ValidationException e) {
        // Обработка ошибок валидации
        logger.warn("Некорректные данные платежа: " + e.getMessage());
        throw new PaymentException("Проверьте данные платежа", e);
        
    } catch (PaymentGatewayException e) {
        // Обработка ошибок платежного шлюза
        logger.error("Ошибка платежного шлюза", e);
        throw new PaymentException("Временные проблемы с оплатой", e);
        
    } catch (Exception e) {
        // Обработка неожиданных ошибок
        logger.error("Неожиданная ошибка при обработке платежа", e);
        throw new PaymentException("Внутренняя ошибка системы", e);
        
    } finally {
        // Освобождение ресурсов выполняется всегда
        if (gateway != null) {
            try {
                gateway.disconnect();
            } catch (Exception e) {
                logger.warn("Ошибка при отключении от платежного шлюза", e);
            }
        }
    }
}
```

**Правила множественной обработки** требуют размещения более специфичных исключений перед общими, поскольку блоки catch проверяются последовательно.

### Try-with-resources автоматизирует управление ресурсами

**Try-with-resources** (Java 7+) обеспечивает автоматическое закрытие ресурсов, реализующих интерфейс AutoCloseable:

```java
public String processDataFile(String inputFile, String outputFile) throws IOException {
    // Множественные ресурсы закрываются автоматически в обратном порядке
    try (FileInputStream fis = new FileInputStream(inputFile);
         FileOutputStream fos = new FileOutputStream(outputFile);
         BufferedInputStream bis = new BufferedInputStream(fis);
         BufferedOutputStream bos = new BufferedOutputStream(fos)) {
        
        byte[] buffer = new byte[8192];
        int bytesRead;
        while ((bytesRead = bis.read(buffer)) != -1) {
            bos.write(buffer, 0, bytesRead);
        }
        
        return "Файл успешно обработан";
        
    } // Все ресурсы закроются автоматически даже при исключении
}

// Собственный ресурс для try-with-resources
public class DatabaseConnection implements AutoCloseable {
    private boolean connected = false;
    
    public DatabaseConnection() throws SQLException {
        connected = true;
        System.out.println("Соединение с БД установлено");
    }
    
    public void executeQuery(String sql) throws SQLException {
        if (!connected) {
            throw new SQLException("Соединение закрыто");
        }
        System.out.println("Выполняем: " + sql);
    }
    
    @Override
    public void close() throws SQLException {
        if (connected) {
            connected = false;
            System.out.println("Соединение с БД закрыто");
        }
    }
}
```

Преимущества try-with-resources включают **предотвращение утечек ресурсов**, автоматическую обработку suppressed exceptions и более чистый код.

### Создание собственных исключений расширяет выразительность

Пользовательские исключения должны следовать **соглашениям именования** (окончание на Exception) и предоставлять **информативные сообщения**:

```java
// Checked исключение для бизнес-логики
public class InsufficientFundsException extends Exception {
    private final double requestedAmount;
    private final double availableAmount;
    
    public InsufficientFundsException(double requestedAmount, double availableAmount) {
        super(String.format("Недостаточно средств. Запрошено: %.2f, доступно: %.2f", 
                           requestedAmount, availableAmount));
        this.requestedAmount = requestedAmount;
        this.availableAmount = availableAmount;
    }
    
    public InsufficientFundsException(String message, Throwable cause) {
        super(message, cause);
        this.requestedAmount = 0;
        this.availableAmount = 0;
    }
    
    public double getRequestedAmount() { return requestedAmount; }
    public double getAvailableAmount() { return availableAmount; }
}

// Unchecked исключение для системных ошибок
public class ConfigurationException extends RuntimeException {
    private final String configKey;
    
    public ConfigurationException(String configKey, String message) {
        super("Ошибка конфигурации для ключа '" + configKey + "': " + message);
        this.configKey = configKey;
    }
    
    public ConfigurationException(String configKey, String message, Throwable cause) {
        super("Ошибка конфигурации для ключа '" + configKey + "': " + message, cause);
        this.configKey = configKey;
    }
    
    public String getConfigKey() { return configKey; }
}
```

### Лучшие практики обеспечивают надежность приложений

**Принцип "Throw Early, Catch Late"** рекомендует выбрасывать исключения при первой возможности обнаружения проблемы и обрабатывать их на уровне, где можно принять осмысленные действия:

```java
public class OrderService {
    public void processOrder(Order order) throws OrderProcessingException {
        // Проверяем предусловия как можно раньше
        if (order == null) {
            throw new IllegalArgumentException("Order не может быть null");
        }
        if (order.getCustomerId() == null) {
            throw new IllegalArgumentException("Customer ID обязателен");
        }
        if (order.getItems().isEmpty()) {
            throw new IllegalArgumentException("Order должен содержать товары");
        }
        
        try {
            validateInventory(order);
            processPayment(order);
            updateInventory(order);
            sendConfirmation(order);
            
        } catch (InventoryException e) {
            // Откатываем изменения если возможно
            logger.error("Недостаточно товара для заказа " + order.getId(), e);
            throw new OrderProcessingException("Товар недоступен", e);
            
        } catch (PaymentException e) {
            logger.error("Ошибка оплаты заказа " + order.getId(), e);
            throw new OrderProcessingException("Проблемы с оплатой", e);
        }
    }
}
```

**Правильное логирование исключений** включает контекстную информацию и избегает дублирования:

```java
public class FileProcessor {
    private static final Logger logger = LoggerFactory.getLogger(FileProcessor.class);
    
    public void processFile(String fileName) throws ProcessingException {
        try {
            performFileProcessing(fileName);
        } catch (IOException e) {
            // Логируем с контекстом, НЕ re-throw если обрабатываем
            logger.error("Не удалось обработать файл: {}", fileName, e);
            throw new ProcessingException("Ошибка обработки файла: " + fileName, e);
        }
    }
    
    // НЕ дублируйте логирование при re-throw
    private void performFileProcessing(String fileName) throws IOException {
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(fileName))) {
            // обработка файла
        } // IOException будет автоматически проброшена выше
    }
}
```

**Выбор между checked и unchecked исключениями** основывается на возможности восстановления:
- **Checked**: внешние проблемы (сеть, файлы, БД), от которых можно восстановиться
- **Unchecked**: программные ошибки, нарушения контрактов, состояния "не должно случиться"

### Производительность и исключения требуют осторожного подхода

Создание исключений — **дорогая операция** из-за генерации stack trace. Никогда не используйте исключения для управления потоком выполнения:

```java
// НЕПРАВИЛЬНО - исключения для логики
public boolean isPositiveNumber(String str) {
    try {
        return Integer.parseInt(str) > 0;
    } catch (NumberFormatException e) {
        return false;  // медленно!
    }
}

// ПРАВИЛЬНО - предварительная проверка
public boolean isPositiveNumber(String str) {
    if (str == null || str.trim().isEmpty()) {
        return false;
    }
    try {
        return Integer.parseInt(str) > 0;
    } catch (NumberFormatException e) {
        return false;
    }
}

// ЛУЧШЕ ВСЕГО - избегаем исключений
public boolean isPositiveNumber(String str) {
    return str != null && str.matches("\\d+") && !str.equals("0");
}
```