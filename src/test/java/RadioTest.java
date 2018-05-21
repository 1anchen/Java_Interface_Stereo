import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RadioTest {

    private Radio radio;

    @Before
    public void before(){
        radio = new Radio("Phillips","P1");
    }

    @Test
    public void canTune(){
        assertEquals("Radio1", radio.tune());
    }

    @Test
    public void canGetMake(){
        assertEquals("Phillips",radio.getMake());
    }

    @Test
    public void canGetModel(){
        assertEquals("P1",radio.getModel());
    }
}



