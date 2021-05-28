package studentWork.newGame;

import java.util.Scanner;

public class gameClient {

    private static final Scanner console = new Scanner(System.in);

    public static void main(String[] args) {// follow the prompts.//
    gameCode obj = new gameCode();
        //replace placeholder with your name//
        obj.setName("placeholder");
        System.out.print( obj.getName());
        System.out.println(obj.unSure());
        obj.Mascot();
        System.out.println("Thank you for playing the demo");
    
        console.close(); 
    }


}