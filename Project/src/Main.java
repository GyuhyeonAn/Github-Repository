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
                } else {
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


        while (true) {
            System.out.println("----------현재 좌석-----------");
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

            boolean seatFind = false;
            for(int col = 0; col < colMax && !seatFind; col++) {
                for(int row = 0; row < rowMax && !seatFind; row++) {
                    if(input.matches("\\d+")) { //일치하는 번호 찾기
                        System.out.print("이름을 입력해주세요: ");
                        String name = sc.nextLine();
                        seat[col][row] = name;
                        seat[col][row] = String.format("|%-3s|", name);
                    } else if (seat[col][row].matches(".*[가-힣]")) { //번호가 없을 때 일치하는 이름 찾기
                        seat[col][row] = String.format("|%3d |", seatCopy[col][row]);
                    } else {System.out.println("잘못된 값을 입력하셨습니다.");} // 이름도 없을 때
                }
                seatFind = true;
            }

        }
        System.out.println("프로그램이 종료되었습니다.");
        sc.close();
    }
}
