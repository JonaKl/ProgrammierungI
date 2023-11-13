package OO.PersonStatic;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Max Mustermann", 20, "Musterstadt");
        Person person2 = new Person("Joschua Tonn", 19, "Horrem");
        System.out.println(person1);
        System.out.println(person2);
        Person.printAnzahlPersonen();
        Person person3 = new Person("Paul Achenbach", 19, "Buxtehude");
        System.out.println(person3);
        Person.printAnzahlPersonen();
    }
}
