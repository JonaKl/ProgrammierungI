package Vererbung.Lebewesen;

public class Mensch extends Lebewesen{
    private boolean fleischEsser;
    public Mensch(int alter, String name, boolean fleischEsser){
        super(2, alter, name);
        this.fleischEsser = fleischEsser;
    }
    public void vorstellen(){
        System.out.println("Hallo, ich bin " + super.getName());
    }
    public void fleischEssen(){
        if(fleischEsser){
            System.out.println("Mjam, lecker Fleisch");
        }else{
            System.out.println("Ich esse kein Fleisch");
        }
    }

    @Override
    public String toString() {
        return super.toString() + " Ich bin ein Mensch und" + (fleischEsser ? " ich esse Fleisch." : " ich esse kein Fleisch.");
    }
}
