package app;

public class Main {

    public static void main(String[] args) {
        Facade facade = new Facade();

        facade.watchMovie(5, 25, "the Shining");

        System.out.println("2 hours later");

        facade.endMovie();
    }
}
