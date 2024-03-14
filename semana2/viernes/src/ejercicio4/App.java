package ejercicio4;

public class App {
    public static void main(String[] args) {
        DVD dvd1 = new DVD(
                "The Lord of the Rings",
                1,
                false,
                "Peter Jackson",
                180);

        System.out.println(dvd1.getTitle());
    }
}
