import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CDPlayerTest {

    CDPlayer cdPlayer;

    @Before
    public void before(){
        cdPlayer = new CDPlayer(5,"Sony","S2");
    }

    @Test
    public void canGetNumberOfTracks(){
        assertEquals(5, cdPlayer.getNumberOfTracks());
    }

    @Test
    public void canStartPaused(){
        assertEquals(false,cdPlayer.isPlaying());
    }

    @Test
    public void canPlay(){
        cdPlayer.play();
        assertEquals(true,cdPlayer.isPlaying());
    }

    @Test
    public void canStop(){
        cdPlayer.play();
        cdPlayer.stop();
        assertEquals(false,cdPlayer.isPlaying());
    }

    @Test
    public void canGetMake(){
        assertEquals("Sony",cdPlayer.getMake());
    }

    @Test
    public void canGetModel(){
        assertEquals("S2",cdPlayer.getModel());
    }


}