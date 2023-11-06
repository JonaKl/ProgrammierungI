package OO.DOG;

public class Dog {
    private String breed;
    private int size;
    private int age;
    private String color;
    private String name;

    public Dog(String name, String breed, int size, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.size = size;
        this.age = age;
        this.color = color;
    }
    public Dog(String breed, int size, int age, String color) {
        this.name = "The dog";
        this.breed = breed;
        this.size = size;
        this.age = age;
        this.color = color;
    }
    public void eat(){
        System.out.println(name +" is eating.");
    }

    public void sleep(){
        System.out.println(name + " is sleeping.");
    }

    public void sit(){
        System.out.println(name + " is sitting.");
    }

    public void run(){
        System.out.println(name + " is running.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return name + " is a " + breed + " and is " + size + " cm tall, " + age + " years old and has the color " + color + ".";
    }
}
