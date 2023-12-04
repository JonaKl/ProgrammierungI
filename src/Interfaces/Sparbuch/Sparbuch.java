package Interfaces.Sparbuch;

public class Sparbuch implements Anzeigbar{
    double kapital;
    String kontonummer;
    double zinssatz;

    public Sparbuch(double kapital, String kontonummer, double zinssatz) {
        this.kapital = kapital;
        this.kontonummer = kontonummer;
        setZinssatz(zinssatz);
    }
    public void zeige(){
        System.out.println(this);
    }
    public void einzahlen(int betrag){
        this.kapital+=betrag;
        System.out.println("Auf dem Konto ist nun ein Kapital von " + this.kapital + "€.");
    }

    public void hebeAb(int betrag){
        this.kapital-=betrag;
        System.out.println("Auf dem Konto ist nun ein Kapital von " + this.kapital + "€.");
    }

    public void berechneErtrag(int laufzeit){
        double neuesKapital = this.kapital;
        for(int i = 0; i<laufzeit; i++){
            neuesKapital *= this.zinssatz;
        }
        this.kapital=neuesKapital;
        System.out.println("Das Kapital beträgt nach " + laufzeit + " Jahren " + neuesKapital + "€.");
    }

    public void verzinse(){
        this.kapital *= (zinssatz+1);
        System.out.println("Nach einem Jahr beträgt das Kapital " + this.kapital + "€.");
    }

    public double getKapital() {
        return kapital;
    }

    public void setKapital(int kapital) {
        this.kapital = kapital;
    }

    public String getKontonummer() {
        return kontonummer;
    }

    public void setKontonummer(String kontonummer) {
        this.kontonummer = kontonummer;
    }

    public double getZinssatz() {
        return zinssatz;
    }

    public void setZinssatz(double zinssatz) {
        if (zinssatz<0) {
            throw new IllegalArgumentException("Der Zinssatz kann nicht negativ sein.");
        }
        this.zinssatz = zinssatz;
    }

    @Override
    public String toString() {
        return "Das Sparbuch mit der Kontonummer " + kontonummer + " hat ein Kapital von " + kapital + " und einen Zinssatz von " + zinssatz*100 + "%.";
    }
}
