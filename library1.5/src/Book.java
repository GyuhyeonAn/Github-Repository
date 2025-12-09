public class Book {
    String isbn;
    String title;
    String author;
    String category;

    public Book(String isbn, String title, String author, String category) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.category = category;
    }
    @Override
    public String toString() {
        return  " ISBN:" + isbn + " | 제목:" + title + " | 저자:" + author + " | 분야:" + category;
    }
}