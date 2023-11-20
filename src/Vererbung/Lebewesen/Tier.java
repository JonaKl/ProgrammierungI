package Vererbung.Lebewesen;

public class Tier extends Lebewesen{
    boolean kannFliegen;
    public Tier(int anzahlBeine, int alter, String name, boolean kannFliegen){
        super(anzahlBeine, alter, name);
        this.kannFliegen = kannFliegen;
    }

    public void fliegen(){
        System.out.println(kannFliegen?"Ich fliege":"Ich kann nicht fliegen");
    }

}
