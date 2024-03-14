package ejercicio2;

public class App {
    public static void main(String[] args) {
        Computer computer1 = new Computer("HP", "X33", 8, 256);
        Computer computer2 = new Computer("Lenovo", "Thinkpad", 16, 1024);
        computer1.printInfo();
        System.out.println("==========================");
        computer2.printInfo();

        computer1.incrementRam(4);

        System.out.println("Computer 1 modificado");
        computer1.printInfo();
    }
}
