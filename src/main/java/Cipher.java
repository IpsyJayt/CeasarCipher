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
    public String codedText (String shiftDirection, int shiftKey){
        String[] splitInputText = inputText.split("");

        for (String letter : splitInputText){
            if (letter.contains(" ")){
                encryptedText+=" ";
            } else if(letter.matches("[^a-zA-Z]")){  //Using the Java Regex or Regular Expression to define a pattern for searching or manipulating strings.
                encryptedText += letter;
            }
            else {
                if(shiftDirection.equalsIgnoreCase("right")){
                    for (int i=0; i<alphaBets.length;i++){
                        if(letter.equalsIgnoreCase(alphaBets[i])){
                            if((i+shiftKey) >= alphaBets.length){
                                encryptedText += alphaBets[(i-26 + shiftKey)];
                            } else {
                                encryptedText+=alphaBets[(i+shiftKey)];
                            }
                        }
                    }
                }
            }



        }
        return null;
    }


}