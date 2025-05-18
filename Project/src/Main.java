import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = 0, col =0, seatNum=0;
        System.out.print("행을 입력해주세요: ");
        int rowCount = sc.nextInt();
        System.out.print("열을 입력해주세요: ");
        int colCount = sc.nextInt();
        System.out.print("빈 열을 입력하세요(없으면 0): ");
        int none = sc.nextInt();

        int[][] seat;
        seat = new int[colCount][rowCount];

        for (int i = 0; i <= none; i++) {
            if (none != 0) {
                seat[i][none] = 0;
                i++;
            } else break;
        }

        for (col = 0; col <= colCount; col++) {
            for (row = 0; row <= rowCount; row++) {
                if (row != none && col <= colCount) {
                    seat[col][row] = seatNum;
                    row++;
                    seatNum++;
                }
                else {
                    col++;
                    row = 0;
                    seatNum = 0;
                }

            System.out.print(Arrays.deepToString(seat));

            }
        }
    }
}

