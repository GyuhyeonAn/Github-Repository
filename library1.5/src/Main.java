import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<String, Book> bookMap = new TreeMap<>();
        String filename = "libraryBook.csv";
        CsvManager.LoadBook(filename, bookMap);

        if (bookMap.size() == 0) {
            CsvManager.exampleBooks(bookMap);
        }

        while (true) {
            System.out.println("\n===== 도서관 관리 프로그램 =====");
            System.out.print("""
                             \s
                             1. 전체 도서 목록
                             2. 검색
                             3. 대출
                             4. 반납
                             0. 종료
                             \s"""
            );
            System.out.print("메뉴 : ");
            int menu = sc.nextInt();

            switch (menu) {
                case 0:
                    CsvManager.SaveBook(filename, bookMap);
                    System.out.println("프로그램을 종료합니다.");
                    return;
                case 1:
                    Library.printAllBooks(bookMap); break;
                case 2:
                    Library.searchAndPrint(bookMap, sc); break;
                case 3:
                    Library.manageBook(bookMap, sc, true); break;
                case 4:
                    Library.manageBook(bookMap, sc, false); break;
            }
        }
    }
}