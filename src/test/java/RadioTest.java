import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RadioTest {

    private Radio radio;

    @Before
    public void before(){
        radio = new Radio();
    }

    @Test
    public void canTune(){
        assertEquals("Radio1", radio.tune());
    }



}