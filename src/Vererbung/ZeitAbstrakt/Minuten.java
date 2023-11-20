package Vererbung.ZeitAbstrakt;

public class Minuten extends Zeit{
    private long minuten;

    public Minuten(long minuten){
        this.minuten = minuten;
    }

    @Override
    public long getMinuten(){
        return this.minuten;
    }
}
