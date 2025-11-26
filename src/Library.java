import java.util.ArrayList;
import java.util.List;

public class Library {

    public static void addBook(String title, String author, String genre) {
        books.add(new Book(title, author, genre));
    }

    public record Book(String title, String author, String KDC) {}
    private static final List<Book> books = new ArrayList<>();
}
