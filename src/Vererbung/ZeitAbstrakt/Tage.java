package Vererbung.ZeitAbstrakt;

public class Tage extends Zeit{
    private long tage;
    public Tage(long tage){
        this.tage = tage;
    }
    @Override
    long getMinuten() {
        return this.tage * 24 * 60;
    }
}
