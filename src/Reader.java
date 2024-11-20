public class Reader {
    private String firstName;
    private String lastName;
    private String libraryCardNumber;

    public Reader(String firstName, String lastName, String libraryCardNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.libraryCardNumber = libraryCardNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getLibraryCardNumber() {
        return libraryCardNumber;
    }
}
