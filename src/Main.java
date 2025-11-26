import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Library.addBook("도서명", "저자", "분류");
        Library.addBook("해리포터", "J.K. 롤링", "문학");
        Library.addBook("반지의 제왕", "J.R.R. 톨킨", "문학");

        System.out.println(
                "==== 도서 검색 ====\n" +
                "검색 기준을 선택하세요:\n" +
                "1. 제목\n" +
                "2. 저자\n" +
                "3. 분류(KDC)"
        );

        int searchStandard = sc.nextInt();

        switch (searchStandard) {
            case 1: System.out.println("검색할 도서 제목을 입력하세요:"); break;
            case 2: System.out.println("검색할 저자명을 입력하세요:");    break;
            case 3: System.out.println("검색할 분류(KDC)를 입력하세요:"); break;
        }

        String searchTitle = sc.next();

        view.printBooks(Library.searchBook(searchTitle, searchStandard));
    }
}