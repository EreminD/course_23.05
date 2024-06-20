package ru.inno.lesson9;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

import java.nio.file.Path;
import java.util.List;

public class BookXml {

    public static void main(String[] args) throws JAXBException {

        Path filePath = Path.of("book.xml");
        Path listFilePath = Path.of("books.xml");

        Book book1 = new Book("12 стульев", 1927, "И.Ильф, Е.Петров");
        Book book2 = new Book("13 стульев", 1927, "И.Ильф, Е.Петров");
        Book book3 = new Book("14 стульев", 1927, "И.Ильф, Е.Петров");

        List<Book> books = List.of(book1, book2, book3);

        JAXBContext context = JAXBContext.newInstance(Book.class);

        // Obj -> xml
        Marshaller marshaller = context.createMarshaller();
        marshaller.marshal(book1, filePath.toFile());

        // XML -> Obj
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Book unmarshal = (Book) unmarshaller.unmarshal(filePath.toFile());

    }
}


