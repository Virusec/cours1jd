package lesson9.min;

public class MinMain {
    public static void main(String[] args) {
        Author dostoevsky = new Author("Fedor", "Dostoevsky");
        Author akunin = new Author("Boris", "Akunin");
        Book idiot = new Book("The Idiot", dostoevsky, 2019);
        Book game = new Book("The Game", akunin, 2016);
        System.out.println(idiot);
        System.out.println(game);
        idiot.setYearOfPublish(2022);
        System.out.println(idiot);
    }
}