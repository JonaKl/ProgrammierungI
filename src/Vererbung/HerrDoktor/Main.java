package Vererbung.HerrDoktor;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Herr Tonn");
        Patient patient = new Patient("Jooschua Tonn");
        Arzt arzt = new Arzt("Dr. Tonn");
        System.out.println(p.getName());
        System.out.println(patient.getName());
        System.out.println(arzt.getName());
        patient.ueberScherzenKlagen();
        arzt.diagnoseStellen();
    }
}
