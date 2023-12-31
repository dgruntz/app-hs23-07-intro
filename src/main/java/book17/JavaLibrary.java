package book17;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class JavaLibrary {
    public static final List<Book> books = Arrays.asList(new Book("A", "A1"), new Book("A", "A2"), new Book("B", "B1"));

    public static List<Book> booksByAuthor(String author) {
        List<Book> result = new LinkedList<>();
        for (Book b : books) {
            if (b.author().equals(author))
                result.add(b);
        }
        return result;
    }

    public static void main(String[] args) {
        List<Book> booksByA = booksByAuthor("A");
        Collections.sort(booksByA, (b1, b2) -> b1.title().compareTo(b2.title()));
        System.out.print(booksByA);
    }
}