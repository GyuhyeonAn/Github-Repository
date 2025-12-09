import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, Book> bookMap = new TreeMap<>();
        String filename = "libraryBook.csv";

        CsvManager.LoadBook(filename, bookMap);

        if (bookMap.size() == 0) {
            CsvManager.exampleBooks(bookMap);
        }

        Library.printAllBooks(bookMap);

        CsvManager.SaveBook(filename, bookMap);
    }
}