public class CDPlayer extends Component {

    private int numberOfTracks;
    private int currentTrack;
    private boolean playing;

    public CDPlayer(int numberOfTracks, String make, String model){
         super(make, model);
         this.numberOfTracks = numberOfTracks;
         this.playing = false;
    }


    public int getNumberOfTracks() {
        return this.numberOfTracks;
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
