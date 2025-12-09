import java.io.*;
import java.util.TreeMap;

public class CsvManager {
    static String filename = "libraryBook.csv";

    public static void SaveBook(String filename, TreeMap<String, Book> map) {
        try {
            FileWriter fw = new FileWriter(filename);
            BufferedWriter bw = new BufferedWriter(fw);

            for (String key : map.keySet()) {
                Book book = map.get(key);
                String line = book.isbn + "," + book.title + "," + book.author + "," + book.category;

                bw.write(line);
                bw.newLine();
            }

            bw.close();
            System.out.println("파일 저장이 완료되었습니다.");

        } catch (Exception e) {
            System.out.println("저장 오류: " + e.getMessage());
        }
    }

    public static void LoadBook(String filename, TreeMap<String, Book> map) {
        File file = new File(filename);
        if (!file.exists()) {
            return;
        }

        try {
            FileReader reader = new FileReader(file);
            BufferedReader Breader = new BufferedReader(reader);

            String line;
            while ((line = Breader.readLine()) != null) {
                String[] data = line.split(",");

                if (data.length == 4) {
                    String isbn = data[0];
                    String title = data[1];
                    String author = data[2];
                    String category = data[3];

                }
            }
            Breader.close();
            System.out.println("파일에서 데이터 읽어옴 (" + map.size() + "권)");

        } catch (Exception e) {
            System.out.println("로드 오류");
        }
    }

    public static void exampleBooks(TreeMap<String, Book> bookMap) { //초기 도서 정보
        bookMap.put("978-90-005", new Book("978-90-005", "나는 나로 살기로 했다", "김수현", "에세이"));
        bookMap.put("978-20-003", new Book("978-20-003", "1984", "조지 오웰", "소설"));
        bookMap.put("978-50-002", new Book("978-50-002", "난중일기", "이순신", "역사"));
        bookMap.put("978-10-001", new Book("978-10-001", "리버싱 입문", "이보안", "IT"));
        bookMap.put("978-70-004", new Book("978-70-004", "리액트를 다루는 기술", "김민준", "IT"));
        bookMap.put("978-40-002", new Book("978-40-002", "돈의 속성", "김승호", "경제"));
        bookMap.put("978-80-001", new Book("978-80-001", "물고기는 존재하지 않는다", "룰루 밀러", "과학"));
        bookMap.put("978-60-003", new Book("978-60-003", "노르웨이의 숲", "무라카미 하루키", "소설"));
        bookMap.put("978-10-005", new Book("978-10-005", "Do it! 리눅스", "이지스", "IT"));
        bookMap.put("978-30-004", new Book("978-30-004", "이기적 유전자", "도킨스", "과학"));
        bookMap.put("978-90-001", new Book("978-90-001", "아주 작은 습관의 힘", "제임스 클리어", "자기계발"));
        bookMap.put("978-50-005", new Book("978-50-005", "정의란 무엇인가", "마이클 샌델", "인문"));
        bookMap.put("978-20-002", new Book("978-20-002", "듄(Dune)", "허버트", "SF"));
        bookMap.put("978-40-005", new Book("978-40-005", "넛지(Nudge)", "리처드 탈러", "경제"));
        bookMap.put("978-70-001", new Book("978-70-001", "자바스크립트 딥 다이브", "이웅모", "IT"));
        bookMap.put("978-80-004", new Book("978-80-004", "용의자 X의 헌신", "히가시노 게이고", "추리"));
        bookMap.put("978-10-003", new Book("978-10-003", "Clean Code", "마틴", "IT"));
        bookMap.put("978-60-001", new Book("978-60-001", "데미안", "헤르만 헤세", "소설"));
        bookMap.put("978-30-002", new Book("978-30-002", "총 균 쇠", "다이아몬드", "인문"));
        bookMap.put("978-90-003", new Book("978-90-003", "언어의 온도", "이기주", "에세이"));
        bookMap.put("978-20-005", new Book("978-20-005", "소년이 온다", "한강", "소설"));
        bookMap.put("978-50-001", new Book("978-50-001", "징비록", "류성룡", "역사"));
        bookMap.put("978-40-003", new Book("978-40-003", "부자의 그릇", "이즈미 마사토", "경제"));
        bookMap.put("978-70-005", new Book("978-70-005", "혼자 공부하는 파이썬", "윤인성", "IT"));
        bookMap.put("978-10-002", new Book("978-10-002", "화이트 해커의 길", "김해킹", "IT"));
        bookMap.put("978-60-005", new Book("978-60-005", "어린 왕자", "생텍쥐페리", "동화"));
        bookMap.put("978-80-002", new Book("978-80-002", "침묵의 봄", "레이첼 카슨", "과학"));
        bookMap.put("978-30-001", new Book("978-30-001", "사피엔스", "하라리", "인문"));
        bookMap.put("978-90-004", new Book("978-90-004", "죽고 싶지만 떡볶이는 먹고 싶어", "백세희", "에세이"));
        bookMap.put("978-50-004", new Book("978-50-004", "지적 대화를 위한 넓고 얕은 지식", "채사장", "인문"));
        bookMap.put("978-20-001", new Book("978-20-001", "반지의 제왕", "톨킨", "판타지"));
        bookMap.put("978-40-001", new Book("978-40-001", "부의 추월차선", "엠제이 드마코", "경제"));
        bookMap.put("978-70-002", new Book("978-70-002", "이것이 취업을 위한 코딩 테스트다", "나동빈", "IT"));
        bookMap.put("978-10-004", new Book("978-10-004", "알고리즘 문제해결", "구종만", "IT"));
        bookMap.put("978-60-002", new Book("978-60-002", "변신", "프란츠 카프카", "소설"));
        bookMap.put("978-80-005", new Book("978-80-005", "슬램덩크", "이노우에 다케히코", "만화"));
        bookMap.put("978-30-005", new Book("978-30-005", "미움받을 용기", "기시미", "철학"));
        bookMap.put("978-90-002", new Book("978-90-002", "그릿(GRIT)", "앤젤라 더크워스", "자기계발"));
        bookMap.put("978-50-003", new Book("978-50-003", "역사란 무엇인가", "E.H. 카", "역사"));
        bookMap.put("978-20-004", new Book("978-20-004", "나미야 잡화점의 기적", "히가시노", "소설"));
        bookMap.put("978-40-004", new Book("978-40-004", "트렌드 코리아 2025", "김난도", "경영"));
        bookMap.put("978-70-003", new Book("978-70-003", "헤드 퍼스트 디자인 패턴", "에릭 프리먼", "IT"));
        bookMap.put("978-80-003", new Book("978-80-003", "셜록 홈즈 전집", "코난 도일", "추리"));
        bookMap.put("978-60-004", new Book("978-60-004", "인간 실격", "다자이 오사무", "소설"));
        bookMap.put("978-30-003", new Book("978-30-003", "코스모스", "칼 세이건", "과학"));
    }
}