package OO.Abschreibung;

public class Abschreibung {
    double anschaffungspreis = 0;
    int nutzungsdauer = 0;
    double abschreibungssatz = 0;


    public Abschreibung(double anschaffungspreis, int nutzungsdauer){
        this.anschaffungspreis = anschaffungspreis;
        this.nutzungsdauer = nutzungsdauer;
    }

    public Abschreibung(double anschaffungspreis, int nutzungsdauer, double abschreibungssatz){
        this.anschaffungspreis = anschaffungspreis;
        this.nutzungsdauer = nutzungsdauer;
        this.abschreibungssatz = abschreibungssatz;
    }

    public double getLineareAbschreibung(){
        if(nutzungsdauer>0){
            double abschreibungProJahr = this.anschaffungspreis/this.nutzungsdauer;
            for(int i = 0; i<nutzungsdauer; i++){
                System.out.println("Im " + (i+1) + ". Jahr beträgt die Abschreibung " + abschreibungProJahr + "€.");
            }
            return abschreibungProJahr;
        }
        //System.out.println("Die Nutzungsdauer muss größer als 0 sein, um eine lineare Abschreibung berechnen zu können.");
        //return 0;
        throw new ArithmeticException("Die Nutzungsdauer muss größer als 0 sein, um eine lineare Abschreibung berechnen zu können.");
    }

    public double getDegressiveAbschreibung(){
        if(abschreibungssatz>0 && nutzungsdauer>0) {
            double abschreibungsbetrag = this.anschaffungspreis;
            for(int i = 0; i<nutzungsdauer; i++){
                abschreibungsbetrag *= (1-this.abschreibungssatz);
                System.out.println("Im " + (i+1) + ". Jahr beträgt die Abschreibung " + abschreibungsbetrag + "€.");
            }
            return abschreibungsbetrag;
        }
        //System.out.println("Der Abschreibungssatz und der Restwert müssen größer als 0 sein, um eine degressive Abschreibung berechnen zu können.");
        //return 0;
        throw new ArithmeticException("Der Abschreibungssatz und der Restwert müssen größer als 0 sein, um eine degressive Abschreibung berechnen zu können.");
    }

    public double getAnschaffungspreis() {
        return anschaffungspreis;
    }

    public void setAnschaffungspreis(double anschaffungspreis) {
        this.anschaffungspreis = anschaffungspreis;
    }

    public int getNutzungsdauer() {
        return nutzungsdauer;
    }

    public void setNutzungsdauer(int nutzungsdauer) {
        this.nutzungsdauer = nutzungsdauer;
    }

    public double getAbschreibungssatz() {
        return abschreibungssatz;
    }

    public void setAbschreibungssatz(double abschreibungssatz) {
        this.abschreibungssatz = abschreibungssatz;
    }
}
