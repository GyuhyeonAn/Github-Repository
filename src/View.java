import java.util.List;

public class View {
    public static void printBooks(List<Library.Book> books) {
        if (books.isEmpty()) System.out.println("검색 결과가 없습니다.");
        int i = 1;
        for (Library.Book b : books) {
            System.out.printf("%2d. 제목: %-10s | 저자: %-10s | 분류(kdc): %-3s | %s\n", i++, b.title(), b.author(), b.kdc(), b.situation() ? "대출가능": "대출불가");
        }
    }
}
