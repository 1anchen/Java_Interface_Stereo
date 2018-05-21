public class Cassette extends Component{

    private boolean playing;

    public Cassette(String make, String model){
        super(make,model);
        this.playing = false;
    }

    public boolean isPlaying() {
        return this.playing;
    }

    public void play(){
        this.playing =true;

    }

    public void stop(){
        this.playing =false;

    }
}
