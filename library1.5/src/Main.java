import java.util.TreeMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, Book> bookMap = new TreeMap<>();

        bookMap.put("978-90-005", new Book("978-90-005", "나는 나로 살기로 했다", "김수현", "에세이"));
        bookMap.put("978-20-003", new Book("978-20-003", "1984", "조지 오웰", "소설"));
        bookMap.put("978-50-002", new Book("978-50-002", "난중일기", "이순신", "역사"));
        bookMap.put("978-10-001", new Book("978-10-001", "리버싱 입문", "이보안", "IT"));
        bookMap.put("978-70-004", new Book("978-70-004", "리액트를 다루는 기술", "김민준", "IT"));

        System.out.println("\n 저장된 도서 목록 ");

        for (String key : bookMap.keySet()) {
            Book book = bookMap.get(key);
            System.out.println(book.toString());
        }
    }
}