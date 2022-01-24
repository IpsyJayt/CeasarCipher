import org.junit.*;
import static org.junit.Assert.*;

public class CipherTest {
    //test if the instant of cipher property instantiates the cipher class

    @Test
    public void createCipher_instanceOfCipherClass_returnsCipher() {
        Cipher cipher = new Cipher ( "works");
        assertEquals(true,  cipher instanceof Cipher);
    }
}