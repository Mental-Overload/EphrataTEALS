package studentWork.newGame;

import java.util.Scanner;

public class gameClient {

    private static final Scanner console = new Scanner(System.in);

    public static void main(String[] args) {// follow the prompts.//
    gameCode obj = new gameCode();
    riddles rid = new riddles();
        //replace placeholder with your name//
        obj.setName("Macy");
        System.out.print( obj.getName());
        System.out.println(obj.unSure());
        rid.Mascot();
        System.out.println("Thank you for playing the demo");
    
        console.close(); 
    }


}