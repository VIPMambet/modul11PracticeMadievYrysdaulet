public class LibraryApp {
    public static void main(String[] args) {
        // Создаем объекты
        Book book1 = new Book("Великий Гэтсби", "Фрэнсис Скотт Фицджеральд", "Роман", "9780743273565");
        Book book2 = new Book("Моби Дик", "Герман Мелвилл", "Приключения", "9781503280786");
        Reader reader1 = new Reader("Ырысдаулет", "Мадиев", "12345");
        Reader reader2 = new Reader("Даулет", "Мадиев", "67890");

        Catalog catalog = new Catalog();
        catalog.addBook(book1);
        catalog.addBook(book2);

        AccountingSystem accountingSystem = new AccountingSystem();
        Librarian librarian = new Librarian();

        // Выдаем книгу
        librarian.issueBook(book1, reader1);
        accountingSystem.recordIssuedBook(book1, reader1);

        // Возвращаем книгу
        librarian.returnBook(book1, reader1);
        accountingSystem.recordReturnedBook(book1, reader1);

        // Поиск книги
        Book foundBook = catalog.searchBook("Моби Дик");
        if (foundBook != null) {
            System.out.println("Найдено: " + foundBook);
        } else {
            System.out.println("Книга не найдена.");
        }
    }
}
