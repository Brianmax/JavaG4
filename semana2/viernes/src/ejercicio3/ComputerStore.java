package ejercicio3;
import ejercicio2.Computer;

import java.util.ArrayList;
public class ComputerStore {
    private ArrayList<Computer> arrayComputers;
    private String name;
    private String address;

    public ComputerStore(ArrayList<Computer> arrayComputers, String name, String address)
    {
        this.arrayComputers = arrayComputers;
        this.name = name;
        this.address = address;
    }
    public void printInfo()
    {
        System.out.println("Name: " + name);
        System.out.println("Address" + address);
    }

    public void addComputer(Computer computerAdd)
    {
        arrayComputers.add(computerAdd);
    }
    public int getSizeListComputers()
    {
        return arrayComputers.size();
    }
    public void printInfoComputers()
    {
        System.out.println("Computadoras disponibles");
        for (int i = 0; i < arrayComputers.size(); i++) {
            Computer tmpComputer = arrayComputers.get(i);
            tmpComputer.printInfo();
            System.out.println("============================");
        }
    }
    public void filterRam(int minRam)
    {
        System.out.println("Resultado filtro");
        for (int i = 0; i < arrayComputers.size(); i++) {
            Computer tmpComputer = arrayComputers.get(i);
            if(tmpComputer.getRam()>=minRam)
            {
                tmpComputer.printInfo();
            }
        }
    }

    public ArrayList<Computer> getArrayComputers() {
        return arrayComputers;
    }

    public void setArrayComputers(ArrayList<Computer> arrayComputers) {
        this.arrayComputers = arrayComputers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}
