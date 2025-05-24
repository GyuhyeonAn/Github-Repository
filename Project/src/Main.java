import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("행을 입력해주세요: ");
        int rowMax = sc.nextInt();
        System.out.print("열을 입력해주세요: ");
        int colMax = sc.nextInt();
        System.out.print("빈 열을 입력하세요(없으면 0): ");
        int emptyLine = sc.nextInt();
        emptyLine -= 1;

        String[][] seat = new String[colMax][rowMax];
        int seatNum = 1;
        for (int col = 0; col < colMax; col++) {
            for (int row = 0; row < rowMax; row++) {
                if (row == emptyLine) {
                    seat[col][row] = "    ";
                }
                else {
                    seat[col][row] = String.format("|%3d |", seatNum++);
                }
            }
        }
        String[][] seatCopy = new String[colMax][rowMax];
        for (int col = 0; col < colMax; col++) {
            for (int row = 0; row < rowMax; row++) {
             seatCopy[col][row] = seat[col][row];
            }
        }

        System.out.println("----------현재 좌석-----------");
        while (true) {
            for (int col = 0; col < colMax; col++) {
                for (int row = 0; row < rowMax; row++) {
                    System.out.print(seat[col][row]);
                }
            System.out.println();
            } //좌석 구성 및 출력 끝

            System.out.print("좌석 혹은 이름을 입력하세요(종료하려면 exit 입력): ");
            String input = sc.nextLine();

            if (input.equals("exit")) {
                break;
            }







        }
        System.out.println("프로그램이 종료되었습니다.");
        sc.close();
    }
}