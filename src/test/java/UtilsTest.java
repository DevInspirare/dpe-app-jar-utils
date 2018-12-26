import org.junit.Assert;
import org.junit.Test;
import pe.com.devinspirare.dpeappjarutils.Utils;

/**
 *  Class UtilsTest for implementations test unit.
 *
 * @author Zeler Benji Villarreal Marcelo
 * @since  27-11-2018
 * @version 1.0.0
 *
 */
public class UtilsTest {

    @Test
    public void testFormatCode(){
        Long value = 5L;
        char charInit = 'E';
        short sizeCharacter = 5;
        Assert.assertEquals(Utils.formatCode(charInit, sizeCharacter, value),"E00005");
    }
}
