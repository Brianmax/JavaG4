package repaso;

public class Dog {
    private String breed;
    private int age;
    private String color;
    public Dog(String breed, int age, String color) {
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    public Dog() {

    }

    public void saludar() {
        System.out.println("Hola soy el perro de raza " + breed);
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }

    public int getAge(){
        return age;
    }

    public void setBreed(String newBreed)
    {
        breed = newBreed;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
}