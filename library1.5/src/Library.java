import java.util.*;

public class Library {

    public static void printAllBooks(TreeMap<String, Book> map) {
        if (map.size() == 0) {
            System.out.println("등록된 도서가 하나도 없습니다.");
            return;
        }

        System.out.println("--- 전체 도서 목록 (" + map.size() + "권) ---");

        for (String key : map.keySet()) {
            Book b = map.get(key);
            System.out.println(b.toString());
        }
    }
}