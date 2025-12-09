import org.junit.jupiter.api.Assertions;
import java.util.*;
import org.junit.jupiter.api.Test;

class CsvManagerTest {

    @Test
    void testSaveLoud() {
        final String filename1 = "test1.csv";
        TreeMap<String, Book> Scv1 = new TreeMap<String, Book>();
        TreeMap<String, Book> Scv2 = new TreeMap<String, Book>();
        Scv1.put("111", new Book("1", "2", "3", "4"));
        Scv1.put("222", new Book("2", "3", "4", "5"));
        Scv1.put("333", new Book("3", "4", "5", "6"));
        Scv1.put("444", new Book("4", "5", "6", "7"));
        Scv1.put("555", new Book("5", "6", "7", "8"));
        Scv1.put("666", new Book("6", "7", "8", "9"));
        Scv1.put("777", new Book("7", "8", "9", "10"));
        Scv1.put("888", new Book("8", "9", "10", "11"));
        Scv1.put("999", new Book("9", "10", "11", "12"));
        Scv1.put("0000", new Book("10", "11", "12", "13"));

        CsvManager.SaveBook(filename1, Scv1);
        CsvManager.LoadBook(filename1, Scv2);

        for(Map.Entry<String, Book> entry : Scv2.entrySet()) {
            String key = entry.getKey();
            Book value = entry.getValue();
            Assertions.assertEquals(Scv2.get(key), value);
        }
    }
    @Test
    void testLongSaveLoud() {
        final String filename1 = "test2.csv";
        TreeMap<String, Book> Scv1 = new TreeMap<String, Book>();
        TreeMap<String, Book> Scv2 = new TreeMap<String, Book>();
        Scv1.put("아아아아아아아아아아아아아아아아아", new Book("아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아", "아아아아아아아아아아아아아아아아아아아아아", "아아아아아아아", "아아아아아아아아아아아아아아아아아아아아아아"));
        Scv1.put("야야야야야야야야", new Book("야야야야야야야야야야야야야야야야야야야야야야야야야야", "야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야", "야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야", "야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야야"));
        Scv1.put("어어", new Book("어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어", "어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어", "어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어", "어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어어"));

        CsvManager.SaveBook(filename1, Scv1);
        CsvManager.LoadBook(filename1, Scv2);

        for(Map.Entry<String, Book> entry :Scv2.entrySet()) {
            String key = entry.getKey();
            Book value = entry.getValue();
            Assertions.assertEquals(Scv2.get(key), value);
        }
    }
}
