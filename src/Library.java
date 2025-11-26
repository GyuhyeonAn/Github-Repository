import java.util.ArrayList;
import java.util.List;

public class Library {

    public static void addBook(String title, String author, String genre) {
        books.add(new Book(title, author, genre));
    }

    public record Book(String title, String author, String KDC) {}
    private static final List<Book> books = new ArrayList<>();

    public static List<Book> searchBook(String query, int searchStandard) {
        List<Book> searchResults = new ArrayList<>();
        for (Book book : books) {
            if (searchStandard == 1 && book.title.contains(query)) {
                searchResults.add(book);
            } else if (searchStandard == 2 && book.author.contains(query)) {
                searchResults.add(book);
            } else if (searchStandard == 3 && book.KDC.contains(query)) {
                searchResults.add(book);
            }
        }

        return searchResults;
    }

}
