package Vererbung.ZeitAbstrakt;

public class StundenMinuten extends Zeit{
    private long stunden;
    private long minuten;

    public StundenMinuten(long stunden, long minuten){
        this.stunden = stunden;
        this.minuten = minuten;
    }
    public StundenMinuten(long stunden){
        this.stunden = stunden;
        this.minuten = 0;
    }

    @Override
    public long getMinuten(){
        return this.stunden * 60 + this.minuten;
    }
}
