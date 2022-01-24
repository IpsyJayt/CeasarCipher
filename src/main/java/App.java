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

        }
    }
}