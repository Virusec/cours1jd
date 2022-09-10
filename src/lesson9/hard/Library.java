package lesson9.hard;

import lesson9.min.Book;

public class Library {
    private final Book[] books;

    public Library(int size) {
        this.books = new Book[size];
    }

    public void addBook(Book newBook) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = newBook;
                return;
            }
        }
    }

    public void printBook(Book book) {
        System.out.println(String.join(": ", book.getAuthor().getFirstName() + " " + book.getAuthor().getLastName(), book.getBookName(), String.valueOf(book.getYearOfPublish())));
    }

    public void printBooks() {
        for (Book book : books) {
            if (book != null) {
                printBook(book);
            }
        }
    }

    public void printBookName(String bookName) {
        for (Book book : books) {
            if (book != null && book.getBookName().equals(bookName)) {
                System.out.println(book.getBookName() + " by " + book.getAuthorName() + " was published in " + book.getYearOfPublish());
                return;
            }
        }
        System.out.println("The book " + bookName + " was not found");
    }

    public void changeYearByName(String bookName, int changeYear) {
        for (Book book : books) {
            if (book != null && book.getBookName().equals(bookName)) {
                book.setYearOfPublish(changeYear);
                return;
            }
        }
    }
}
