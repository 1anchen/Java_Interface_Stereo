

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CassetteTest {

    Cassette cassette;

    @Before
    public void before(){
        cassette = new Cassette("Sony","S1");
    }



    @Test
    public void canStartPaused(){
        assertEquals(false,cassette.isPlaying());
    }

    @Test
    public void canPlay(){
        cassette.play();
        assertEquals(true,cassette.isPlaying());
    }

    @Test
    public void canStop(){
        cassette.play();
        cassette.stop();
        assertEquals(false,cassette.isPlaying());
    }
    @Test
    public void canGetMake(){
        assertEquals("Sony",cassette.getMake());
    }

    @Test
    public void canGetModel(){
        assertEquals("S1",cassette.getModel());
    }


}