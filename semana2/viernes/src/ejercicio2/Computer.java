package ejercicio2;

public class Computer {
    private String brand;
    private String model;
    private int ram;
    private int storage;
    public Computer(String brand, String model, int ram, int storage)
    {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.storage = storage;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }
    public void printInfo()
    {
        System.out.println("Info computer");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Ram: " + ram);
        System.out.println("Storage: " + storage);
    }

    public void incrementRam(int ramIncrement)
    {
        ram += ramIncrement;
        // ram = ram + ramIncrement
    }
}
