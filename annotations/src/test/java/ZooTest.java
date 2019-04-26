import org.junit.Test;
import org.nyu.zoo.Coyote;
import org.nyu.zoo.Frog;
import org.nyu.zoo.Platypus;
import org.nyu.zoo.json.JsonSerializationException;
import org.nyu.zoo.json.ObjectToJsonConverter;

@SuppressWarnings("all")
public class ZooTest {

    /**
     * Here the @Test annotation is brought to us by JUnit via Maven. It uses reflection to inspect and run the test
     * methods at runtime!
     */

    @Test
    public void coyoteShouldBeBrown() {
        Coyote myCoyote = new Coyote();
        assert myCoyote.getColor().equals("brown");
    }

    @Test
    public void platypusShouldCoo() {
        Platypus myPlatypus = new Platypus();
        assert myPlatypus.call().get().equals("coo-coo!");
    }

    @Test
    public void serializeFrogToJson() throws JsonSerializationException {
        Frog myFrog = new Frog("green", "1", "4", "ribbit!");
        ObjectToJsonConverter converter = new ObjectToJsonConverter();
        String frogJson = converter.convertToJson(myFrog);
        System.out.println(frogJson);
    }

}
