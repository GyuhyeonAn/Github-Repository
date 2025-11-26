import java.util.List;

public class view {
    public static void printBooks(List<Library.Book> books) {
        int i = 1;
        for (Library.Book b : books) {
            System.out.printf("%2d. 제목: %-10s | 저자: %-10s | 분류(KDC): %-3s%n", i++, b.title(), b.author(), b.KDC());
        }
    }
}
