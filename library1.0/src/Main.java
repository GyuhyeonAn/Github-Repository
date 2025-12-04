import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Library.addBook("도서명", "저자", "분류");
        Library.addBook("해리포터", "J.K. 롤링", "문학");
        Library.addBook("반지의 제왕", "J.R.R. 톨킨", "문학");

        while (true) {
            System.out.print(
                    """
                    \s
                    ==== 도서관 ====
                    1. 도서 검색
                    2. 도서 대출
                    3. 도서 반납
                    0. 종료
                    작업 번호를 입력하세요:\s"""
            );

            int idx = sc.nextInt();
            switch (idx) {
                case 1:
                    View.printBooks(Library.searchBook(sc));
                    break;
                case 2:
                    Library.manageBook(sc, true);
                    break;
                case 3:
                    Library.manageBook(sc, false);
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
}