import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class Library {

    public static void searchAndPrint(TreeMap<String, Book> map, Scanner sc) {
        ArrayList<Book> list = findBooks(map, sc);

        if (list.size() == 0) {
            System.out.println("검색된 책이 없습니다.");
        } else {
            System.out.println("--- 검색 결과 ---");
            for (int i = 0; i < list.size(); i++) {
                Book b = list.get(i);
                System.out.println(b.toString());
            }
        }
    }

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

    public static void manageBook(TreeMap<String, Book> map, Scanner sc, boolean mode) {
        ArrayList<Book> list = findBooks(map, sc);

        if (list.size() == 0) {
            System.out.println("책을 못 찾았습니다.");
            return;
        }

        System.out.println("--- 도서 선택 ---");
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ". " + list.get(i).toString());
        }

        System.out.print("번호 선택 (취소 0) : ");
        int num = sc.nextInt();

        if (num == 0) return;
        if (num < 1 || num > list.size()) {
            System.out.println("잘못된 번호입니다.");
            return;
        }

        Book b = list.get(num - 1);

        if (mode == true) {
            if (b.isRental == true) {
                System.out.println("이미 대출중입니다.");
            } else {
                b.isRental = true;
                System.out.println("대출 완료");
            }
        } else {
            if (b.isRental == false) {
                System.out.println("반납할 게 없습니다.");
            } else {
                b.isRental = false;
                System.out.println("반납 완료");
            }
        }
    }

    public static ArrayList<Book> findBooks(TreeMap<String, Book> map, Scanner sc) {
        System.out.println("""
                \s
                1.ISBN 
                2.제목 
                3.저자 
                4.분야\s""");
        System.out.print("검색 기준 : ");
        int type = sc.nextInt();

        System.out.print("검색어 : ");
        String text = sc.next();

        ArrayList<Book> result = new ArrayList<>();

        for (String key : map.keySet()) {
            Book book = map.get(key);
            boolean found = false;

            if (type == 1) {
                if (book.isbn.contains(text)) found = true;
            } else if (type == 2) {
                if (book.title.contains(text)) found = true;
            } else if (type == 3) {
                if (book.author.contains(text)) found = true;
            } else if (type == 4) {
                if (book.category.contains(text)) found = true;
            }

            if (found == true) {
                result.add(book);
            }
        }
        return result;
    }
}