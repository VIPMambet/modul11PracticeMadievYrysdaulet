import java.util.List;

public interface ICatalog {
    void addBook(Book book);
    Book searchBook(String title);
    List<Book> searchBooksByAuthor(String author);
    List<Book> searchBooksByGenre(String genre);
}
