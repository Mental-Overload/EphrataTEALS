package studentWork.newGame;
import java.util.Scanner;
public class gameCode {
    private static final Scanner console = new Scanner(System.in);
    private String Name;
    private boolean notSure;
    public String getName(){
        return Name;
    }
    public void setName(String newName){
        Name = newName;
    }
    
    public boolean unSure(){
    System.out.println(" is a strange name.");
    return notSure;
    }

    public boolean Mascot() {
        
        System.out.println("what Is our school mascot?");
        String b = console.nextLine();
        if (b.toLowerCase().contains("tiger")){
            System.out.println("Good, next riddle.");
            System.out.println("What runs around the whole yard without moving?");
    String c = console.nextLine();
    if (c.toLowerCase().contains("fence")){
        System.out.println("Good, next riddle.");
        System.out.println("What goes on four feet in the morning, two feet at noon, and three feet in the evening? ");
        String d = console.nextLine();
        if (d.toLowerCase().contains("man")){
            System.out.println("You, have sucsefully passed the third riddle");
            return true;
        } else{
            System.out.println("You have failed");
            return false;
        }
        
    } else{
        System.out.println("You have failed");
        return false;
    }
        } else{
            System.out.println("You have failed");
           return false;
       }

    }
        
        
        
}
