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
            //right Shift
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
                //left shift
                else {
                    for (int i = alphaBets.length-1; i >=0 ; i--) {
                        if (letter.equalsIgnoreCase(alphaBets[i])){
                            if ((i-shiftKey)<0){
                                encryptedText += alphaBets[(i+26-shiftKey)];
                            }
                            else {
                                encryptedText += alphaBets[(i-shiftKey)];
                            }
                        }
                    }
                }
            }
        }
        return encryptedText;
    }
    public String decodedText (String shiftDirection, int shiftKey){
        String[] splitInputText = inputText.split("");
        for (String letter: splitInputText){
            if(letter.contains(" ")){
                decryptedText+= " ";
            } else if (letter.matches("[^a-zA-Z]")){
                decryptedText += letter;
            }
            else {
                if(shiftDirection.equalsIgnoreCase("right")){
                    //right shift key decryption
                    for (int i = 0; i <alphaBets.length ; i++) {
                        if(letter.equalsIgnoreCase(alphaBets[i])){
                            if ((i+shiftKey) >= alphaBets.length){
                                decryptedText += alphaBets[(i-26-shiftKey)];
                            } else {
                                decryptedText += alphaBets[(i-shiftKey)];
                            }
                        }
                    }
                } else {
                    //left key decryption
                    for (int i = alphaBets.length-1; i >=0 ; i--) {
                        if (letter.equalsIgnoreCase(alphaBets[i])){
                            if ((i+shiftKey) > alphaBets.length-1){
                                decryptedText += alphaBets[(i-26+shiftKey)];
                            } else {
                                decryptedText += alphaBets[i+shiftKey];
                            }
                        }

                    }
                }
            }
        }
        return decryptedText;
    }
}