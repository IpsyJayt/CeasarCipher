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
        assertEquals("bc",cipher.codedText("right", 1));
    }
    // test for encoding using a left shift key
    @Test
    public void codeTheText_shiftTextToTheLeftBy1_returnCodedText() {
        Cipher cipher = new Cipher("c");
        assertEquals("b",cipher.codedText("left", 1) );
    }
     // test for right shift key decryption
    @Test
    public void decodeTheText_decodeByARightShiftKeyOf1_returnDecodedText() {
        Cipher cipher= new Cipher("bc");
        assertEquals("ab", cipher.decodedText("right", 1));
    }

    @Test
    public void decodeTheText_decodeByALeftShiftKeyOf1_RuturnDecodedText () {
        Cipher cipher = new Cipher("b");
        assertEquals("c", cipher.decodedText("left",1));
    }
}