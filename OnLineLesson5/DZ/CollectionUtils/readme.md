## Задание 2: Утилитный класс для работы с коллекциями

Создайте класс `CollectionUtils` с обобщёнными статическими методами:

### Методы для реализации:

- `filter(List<T> list, Predicate<T> predicate)` — фильтрация списка
- `transform(List<T> list, Function<T, R> function)` — преобразование элементов
- `findFirst(List<T> list, Predicate<T> predicate)` — поиск первого подходящего
- `partition(List<T> list, int size)` — разбиение списка на подсписки

---

## Примечания

- Используйте обобщения для обеспечения типобезопасности
- Обратите внимание на ограничения типов (bounded wildcards)
- Рекомендуется использовать функциональные интерфейсы из пакета `java.util.function`