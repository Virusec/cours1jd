package lesson9.min;

public class Book {
    private final String bookName;
    private final Author author;
    private int yearOfPublication;


    public Book(String bookName, Author author, int yearOfPublication) {
        this.bookName = bookName;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getBookName() {
        return bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearOfPublish() {
        return yearOfPublication;
    }

    public void setYearOfPublish(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author=" + author +
                ", yearOfPublication=" + yearOfPublication +
                '}';
    }

        public String getAuthorName() {
        return author.getFirstName() + " " + author.getLastName();
    }
}
