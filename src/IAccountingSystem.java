public interface IAccountingSystem {
    void recordIssuedBook(Book book, Reader reader);
    void recordReturnedBook(Book book, Reader reader);
}
