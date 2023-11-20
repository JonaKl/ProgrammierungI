package Vererbung.ZeitAbstrakt;

public class Stunden extends Zeit{
    private long stunden;

    public Stunden(long stunden){
        this.stunden = stunden;
    }

    @Override
    public long getMinuten(){
        return this.stunden * 60;
    }
}
