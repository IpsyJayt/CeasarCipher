import java.util.Scanner;

public class App{
    public static void main (String[] args) {
        Scanner userInput = new Scanner(System.in);
        boolean selectionsLoop = true;

        System.out.println("Welcome to CAESAR CIPHER APPLICATION");
        while(selectionsLoop){
            System.out.println("..................................................");
            System.out.println("Select what you'd like to do(Enter the number of your option): \n" + "1:Encode message \n" + "2:Decrypt message \n" + "3:Exit");
            int userSelection = userInput.nextInt();
            userInput.nextLine(); //THE INPUT TO BE USED BY nextInt();

            //ENCODE PATH

            if (userSelection == 1){
                System.out.println("Enter the message you'd like to encode:");
                String userMessage = userInput.nextLine();
                System.out.println("Pick the Encoding direction: Right or Left");
                String userDirection = ""
            }

        }
    }
}