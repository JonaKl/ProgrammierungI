package Vererbung.HerrDoktor;

public class Patient extends Person{

    public Patient(String name){
        super(name);
    }
    public void ueberScherzenKlagen(){
        System.out.println("Mir tut der Arm weh.");
    }


}
