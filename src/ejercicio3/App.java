package ejercicio3;

import ejercicio2.Computer;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Computer> listaComputadoras = new ArrayList<>();
        ComputerStore computerStore1 = new ComputerStore(
                listaComputadoras,
                "TecnoStore",
                "xxxxxxx");
        System.out.println("===========================");
        System.out.println(computerStore1.getSizeListComputers());

        //ComputerStore computerStore2 = new ComputerStore()
        Computer computer1 = new Computer(
                "DELL",
                "XXXXX",
                8,
                299);
        Computer computer2 = new Computer(
                "HP",
                "MMMMMM",
                16,
                512);
        Computer computer3 = new Computer(
                "Lenovo",
                "LLLLLLL",
                8,
                1024);

        // agregando computadora a la tienda

        computerStore1.addComputer(computer1);
        computerStore1.addComputer(computer2);
        computerStore1.addComputer(computer3);
        System.out.println(computerStore1.getSizeListComputers());


        ArrayList<Integer> arraysIntegers = new ArrayList<>();

//        arraysIntegers.add(1);
//        arraysIntegers.add(39);
//        arraysIntegers.add(29);
//
//        int valor = arraysIntegers.get(0);

        //computerStore1.printInfoComputers();

        computerStore1.filterRam(12);
    }
}
