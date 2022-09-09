package lesson9.mid;

import lesson9.min.Author;
import lesson9.min.Book;

public class MidMain {


    public static void main(String[] args) {
        Author dostoevsky = new Author("Fedor", "Dostoevsky");
        Author akunin = new Author("Boris", "Akunin");

        Book[] books = new Book[10];
        books[0] = new Book("The Idiot", dostoevsky, 2019);
        books[1] = new Book("The Game", akunin, 2016);

        addBook(books, new Book("The Diamond Chariot", akunin, 2012));
        addBook(books, new Book("The Brothers Karamazov", dostoevsky, 2010));
        addBook(books, new Book("Crime and Punishment", dostoevsky, 2015));
        addBook(books, new Book("Notes from Underground", dostoevsky, 2018));
        addBook(books, new Book("The Turkish Gambit", akunin, 2000));

        for (Book book : books) {
            if (book != null) {
                printBook(book);
            }
        }
    }

    public static void addBook(Book[] books, Book newBook) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = newBook;
                return;
            }
        }
    }

    public static void printBook(Book book) {
        System.out.println(String.join(": ", book.getAuthor().getFirstName() + " " + book.getAuthor().getLastName(), book.getBookName(), String.valueOf(book.getYearOfPublish())));
    }
}