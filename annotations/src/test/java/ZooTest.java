import org.junit.Test;
import org.nyu.zoo.Coyote;
import org.nyu.zoo.Platypus;

@SuppressWarnings("all")
public class ZooTest {

    /**
     * Here the @Test annotation is brought to us by JUnit via Maven. It uses reflection to inspect and run the test
     * methods at runtime!
     */

    @Test
    public static void coyoteShouldBeBrown() {
        Coyote myCoyote = new Coyote();
        assert myCoyote.getColor().equals("brown");
    }

    @Test
    public static void platypusShouldCoo() {
        Platypus myPlatypus = new Platypus();
        assert myPlatypus.call().get().equals("coo-coo!");
    }

}
