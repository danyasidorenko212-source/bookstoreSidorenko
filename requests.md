# Перевірка API книгарні

Запустіть backend з каталогу проєкту:

```bash
mvn spring-boot:run
```

## Список книжок

```bash
curl -i http://localhost:8080/api/books
```

Повертається масив карток із полями `id`, `title`, `author`, `price`, `coverUrl`.

## Одна книжка з деталями

```bash
curl -i http://localhost:8080/api/books/1
```

Відповідь містить також рік видання, опис і жанр.

## Книжки з невідомим id

```bash
curl -i http://localhost:8080/api/books/999
```

Очікуваний статус: `404 Not Found`.
