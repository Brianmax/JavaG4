package repaso;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Dog myDog1 = new Dog("Labrador", 3, "Blanco");
        Dog myDog2 = new Dog("Pastor Aleman", 4, "Cafe");

        Dog myDog3 = new Dog();
        List<Dog> listaDog =  new ArrayList<>();
//      myDog1.breed = "Labrador";
//      myDog2.breed = "Pastor Aleman";

//        System.out.println(myDog1.breed);
//        System.out.println(myDog2.breed);

        myDog1.saludar();
        myDog2.saludar();
    }
}
