package lesson9.hard;

import lesson9.min.Author;
import lesson9.min.Book;

public class HardMain {
    public static void main(String[] args) {
        Library library = new Library(10);

        Author dostoevsky = new Author("Fedor", "Dostoevsky");
        Author akunin = new Author("Boris", "Akunin");

        library.addBook(new Book("The Diamond Chariot", akunin, 2012));
        library.addBook(new Book("The Brothers Karamazov", dostoevsky, 2010));
        library.addBook(new Book("Crime and Punishment", dostoevsky, 2015));
        library.addBook(new Book("Notes from Underground", dostoevsky, 2018));
        library.addBook(new Book("The Turkish Gambit", akunin, 2000));

        library.printBookName("The Turkish Gambit");
        library.changeYearByName("The Turkish Gambit", 2022);
        library.printBookName("The Turkish Gambit");

    }
}
