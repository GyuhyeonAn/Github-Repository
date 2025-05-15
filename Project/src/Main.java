import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = 0, col =0, seatNum=0;
        System.out.print("행을 입력해주세요: ");
        int rowCount = sc.nextInt();
        System.out.print("열을 입력해주세요: ");
        int colCount = sc.nextInt();
        System.out.print("빈 열을 입력하세요(없으면 0): ");
        int X = sc.nextInt();

        int[][] seat;
        seat = new int[colCount][rowCount];

        for (int emptyCol= 0; emptyCol <= colCount; emptyCol++) {
            int R = 0;
            seat[R][X] = 0;
            R++;
        }
        for (int i = 0; i <= colCount; i++) {
            int j = 0;
            for (j = 0; j <= rowCount; j++) {
                System.out.println(seat[i][j]);
            }
        }
    }
}
