package ru.inno.lesson9;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class BookJson {

    public static void main(String[] args) throws IOException {

        Path filePath = Path.of("book.json");
        Path listFilePath = Path.of("books.json");

        Book book1 = new Book("12 стульев", 1927, "И.Ильф, Е.Петров");
        Book book2 = new Book("13 стульев", 1927, "И.Ильф, Е.Петров");
        Book book3 = new Book("14 стульев", 1927, "И.Ильф, Е.Петров");

        // помогатор
        ObjectMapper mapper = new ObjectMapper();

        // Записать и прочитать экземпляр
        // Serialize
        // mapper.writeValue(filePath.toFile(), book);

        // Deserialize
        // Book b = mapper.readValue(filePath.toFile(), Book.class);

        List<Book> books = List.of(book1, book2, book3);
        // mapper.writeValue(listFilePath.toFile(), books);
        // List<Book> myBooks = mapper.readValue(listFilePath.toFile(), new TypeReference<>(){});

        String string = mapper.writeValueAsString(books);


    }
}
