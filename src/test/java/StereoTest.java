import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StereoTest {

    Stereo stereo;


    @Before
    public void before(){
        this.stereo= new Stereo();
    }

    @Test
    public void canIncreaseVolume(){
        stereo.increaseVolume();
        Assert.assertEquals(6,stereo.getVolume());
    }

    @Test
    public void canDecreaseVolume(){
        stereo.decreaseVolume();
        Assert.assertEquals(4,stereo.getVolume());
    }

    @Test
    public void canTuneRadio(){
        Assert.assertEquals("Radio1",stereo.tuneRadio());
    }

}
