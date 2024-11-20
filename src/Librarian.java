import java.util.Set;
import java.util.HashSet;

public class Librarian {
    private Set<Book> issuedBooks = new HashSet<>(); // Храним список выданных книг

    public void issueBook(Book book, Reader reader) {
        if (issuedBooks.contains(book)) {
            System.out.println("Эта книга уже выдана!");
        } else {
            issuedBooks.add(book);
            System.out.println("Книга '" + book.getTitle() + "' выдана " + reader.getFirstName() + " " + reader.getLastName());
        }
    }

    public void returnBook(Book book, Reader reader) {
        if (!issuedBooks.contains(book)) {
            System.out.println("Эта книга не была выдана.");
        } else {
            issuedBooks.remove(book);
            System.out.println("Книга '" + book.getTitle() + "' возвращена " + reader.getFirstName() + " " + reader.getLastName());
        }
    }
}
