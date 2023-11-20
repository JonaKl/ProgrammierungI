package Vererbung.HerrDoktor;

public class Arzt extends Person{
    public Arzt(String name){
        super(name);
    }
    public void diagnoseStellen(){
        System.out.println("Sie haben eine Entzündung.");
    }
}
