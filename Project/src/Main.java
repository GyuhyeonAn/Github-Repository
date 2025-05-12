import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int roomNum = 0;
        System.out.print("행을 입력해주세요: ");
        int row = sc.nextInt();
        System.out.print("열을 입력해주세요: ");
        int col = sc.nextInt();
        System.out.print("빈 열을 입력하세요(없으면 0): ");
        int X = sc.nextInt();

        String[][][] seat;
        seat = new String[row][col][roomNum];
        System.out.print(seat);

        for (int i = 0; i < col; i++) {
        }


    }
}
