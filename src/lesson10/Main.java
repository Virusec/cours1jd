package lesson10;

public class Main {
    public static void main(String[] args) {
        System.out.println("Author:");
        Author dostoevsky = new Author("Fedor", "Dostoevsky");
        Author dostoevsky2 = new Author("Fedor", "Dostoevsky");
        Author akunin = new Author("Boris", "Akunin");

        System.out.println(dostoevsky.equals(dostoevsky2));
        System.out.println(dostoevsky.hashCode() == dostoevsky2.hashCode());
        System.out.println(dostoevsky.equals(akunin));
        System.out.println(dostoevsky.hashCode() == akunin.hashCode());
        System.out.println(dostoevsky);
        System.out.println(akunin);

        System.out.println("*************************************************************");

        System.out.println("Book:");

        Book theDiamondChariot = new Book("The Diamond Chariot", akunin, 2012);
        Book theDiamondChariot2 = new Book("The Diamond Chariot", akunin, 2012);
        Book theBrothersKaramazov = new Book("The Brothers Karamazov", dostoevsky, 2010);

        System.out.println(theDiamondChariot.equals(theDiamondChariot2));
        System.out.println(theDiamondChariot.hashCode() == theDiamondChariot2.hashCode());
        System.out.println(theDiamondChariot.equals(theBrothersKaramazov));
        System.out.println(theDiamondChariot.hashCode() == theBrothersKaramazov.hashCode());
        System.out.println(theBrothersKaramazov);
        System.out.println(theDiamondChariot);

        System.out.println("*************************************************************");

        Library library = new Library(2);
        library.addBook(theBrothersKaramazov);
        library.addBook(theDiamondChariot);
        System.out.println(library);
    }
}
