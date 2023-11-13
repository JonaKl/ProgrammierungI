package OO.PersonStatic;

public class Person {
    private static int anzahlPersonen = 0;
    private String name;
    private int alter;
    private String wohnort;
    static final String art = "Mensch";

    public Person(String name, int alter, String wohnort) {
        this.name = name;
        this.alter = alter;
        this.wohnort = wohnort;
        anzahlPersonen++;
    }

    public static void printAnzahlPersonen(){
        System.out.println("Es gibt " + anzahlPersonen + " Personen.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public String getWohnort() {
        return wohnort;
    }

    public void setWohnort(String wohnort) {
        this.wohnort = wohnort;
    }

    @Override
    public String toString(){
        return "Art: " + Person.art + ", Name: " + this.name + ", Alter: " + this.alter + ", Wohnort: " + this.wohnort;
    }
}
