public class Cipher {
    private String inputText;
    private String encryptedText;
    private String decryptedText;

    private String[] alphaBets = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};


    public Cipher (String inputText){
        this.inputText = inputText;
        this.encryptedText = "";
        this.decryptedText = "";
    }
    public String getInputText (){
        return inputText;
    }
}