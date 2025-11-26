import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    public static void addBook(String title, String author, String genre) {
        books.add(new Book(title, author, genre, true));
    }

    public static List<Book> searchBook(Scanner sc) {
        System.out.print(
                """
                \s
                ==== 도서 검색 ====
                검색 기준을 선택하세요:
                1. 제목
                2. 저자
                3. 분류(kdc)
                번호를 입력하세요:\s"""
        );
        int searchStandard = sc.nextInt();

        switch (searchStandard) {
            case 1: System.out.print("검색할 도서 제목을 입력하세요: "); break;
            case 2: System.out.print("검색할 저자명을 입력하세요: ");    break;
            case 3: System.out.print("검색할 분류(kdc)를 입력하세요: "); break;
        }
        String searchKeyword = sc.next();

        List<Book> searchResults = new ArrayList<>();
        for (Book book : books) {
            if (searchStandard == 1 && book.title.contains(searchKeyword)) {
                searchResults.add(book);
            } else if (searchStandard == 2 && book.author.contains(searchKeyword)) {
                searchResults.add(book);
            } else if (searchStandard == 3 && book.kdc.contains(searchKeyword)) {
                searchResults.add(book);
            }
        }

        return searchResults;
    }

    public static void manageBook(Scanner sc, boolean isLending) {
        List<Book> searchResults = searchBook(sc);
        if (searchResults.isEmpty()) {
            System.out.println("검색 결과가 없습니다.");
            return;
        }
        System.out.println("==== 검색 결과 ====");
        View.printBooks(searchResults);
        System.out.print((isLending ? "대출" : "반납") + "할 도서 번호를 입력하세요: ");
        int searchIdx = sc.nextInt();

        if (searchIdx < 1 || searchIdx > searchResults.size()) {
            System.out.println("잘못된 번호입니다.");
            return;
        }

        Book selectedBook = searchResults.get(searchIdx - 1);

        if (isLending && !selectedBook.situation()) {
            System.out.println("이미 대출 중인 도서입니다.");
            return;
        }else if (!isLending && selectedBook.situation()) {
            System.out.println("대출 중이 아닌 도서입니다.");
            return;
        }

        int idx = books.indexOf(selectedBook);
        books.set(idx, new Book(selectedBook.title(), selectedBook.author(), selectedBook.kdc(), !isLending));
        System.out.println((isLending ? "대출" : "반납") + "이 완료되었습니다.");
    }

    public record Book(String title, String author, String kdc, boolean situation) {}
    private static final List<Book> books = new ArrayList<>();
}
