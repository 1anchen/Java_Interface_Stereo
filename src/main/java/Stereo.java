public class Stereo {
    private Radio radio;
    private CDPlayer cdPlayer;
    private Cassette cassette;
    private int volume;

    public Stereo(){
        this.radio = new Radio("Phillips","P1");
        this.cdPlayer = new CDPlayer(5,"Sony","S1");
        this.cassette= new Cassette("Sony","S2");
        this.volume = 5;
    }

    public void increaseVolume(){
        if(volume < 11) {
            volume++;
        }
    }

    public void decreaseVolume(){
        if(volume > 0) {
            volume--;
        }
    }

    public int getVolume() {
        return volume;
    }

    public String tuneRadio() {
        return radio.tune();
    }
}
