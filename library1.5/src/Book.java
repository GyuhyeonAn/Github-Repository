public class Book {
    String isbn;
    String title;
    String author;
    String category;
    boolean isRental;

    public Book(String isbn, String title, String author, String category) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.category = category;
        this.isRental = false;
    }
    @Override
    public String toString() {
        return  " ISBN:" + isbn + " | 제목:" + title + " | 저자:" + author + " | 분야:" + category;
    }
}