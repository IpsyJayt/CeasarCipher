import org.junit.*;
import static org.junit.Assert.*;

public class CipherTest {
    //test if the instant of cipher property instantiates the cipher class

    @Test
    public void createCipher_instanceOfCipherClass_returnsCipher() {
        Cipher cipher = new Cipher ( "works");
        assertEquals(true,  cipher instanceof Cipher);
    }
//testing the getter methods for getInputText
    @Test
    public void getInputText_returnTheInputtedText_returnsTheInput() {
        Cipher cipher = new Cipher("works");
        assertEquals("works", cipher.getInputText());
    }
    //test for encrypting the InputText with a shift key of 1 to the right

    @Test
    public void codeTheText_shiftTextToTheRightBy1_returnsCodedMessage() {
        Cipher cipher = new Cipher("ab");
        assertEquals("bc",cipher.codedText(right, 1));
    }
}