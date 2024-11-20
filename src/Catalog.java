import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Catalog {
    private List<Book> books;

    public Catalog() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book searchBook(String title) {
        return books.stream().filter(book -> book.getTitle().toLowerCase().contains(title.toLowerCase())).findFirst().orElse(null);
    }

    public List<Book> searchBooksByAuthor(String author) {
        return books.stream().filter(book -> book.getAuthor().toLowerCase().contains(author.toLowerCase())).collect(Collectors.toList());
    }

    public List<Book> searchBooksByGenre(String genre) {
        return books.stream().filter(book -> book.getGenre().toLowerCase().contains(genre.toLowerCase())).collect(Collectors.toList());
    }
}
