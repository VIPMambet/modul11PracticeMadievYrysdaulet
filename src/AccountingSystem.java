import java.util.ArrayList;
import java.util.List;

public class AccountingSystem {
    private List<IssuedBookRecord> issuedBooks;

    public AccountingSystem() {
        issuedBooks = new ArrayList<>();
    }

    public void recordIssuedBook(Book book, Reader reader) {
        issuedBooks.add(new IssuedBookRecord(book, reader, System.currentTimeMillis()));
        System.out.println("Книга '" + book.getTitle() + "' выдана " + reader.getFirstName() + " " + reader.getLastName());
    }

    public void recordReturnedBook(Book book, Reader reader) {
        issuedBooks.removeIf(record -> record.getBook().equals(book) && record.getReader().equals(reader));
        System.out.println("Книга '" + book.getTitle() + "' возвращена " + reader.getFirstName() + " " + reader.getLastName());
    }


    private static class IssuedBookRecord {
        private Book book;
        private Reader reader;
        private long issueDate;

        public IssuedBookRecord(Book book, Reader reader, long issueDate) {
            this.book = book;
            this.reader = reader;
            this.issueDate = issueDate;
        }

        public Book getBook() {
            return book;
        }

        public Reader getReader() {
            return reader;
        }
    }
}
