package lesson10;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublication == book.yearOfPublication && Objects.equals(bookName, book.bookName) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, author, yearOfPublication);
    }

    public String getAuthorName() {
        return author.getFirstName() + " " + author.getLastName();
    }
}
