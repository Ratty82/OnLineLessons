## Задание 1: Обобщённый класс "Корзина товаров"

Создайте класс `ShoppingCart<T extends Product>`, где `Product` — базовый класс товара с полями `name` и `price`.

### Реализуйте методы:

- `add(T item)` — добавление товара
- `remove(T item)` — удаление товара
- `getTotalPrice()` — общая стоимость
- `getItems()` — список товаров
- `getMostExpensive()` — самый дорогой товар

---
