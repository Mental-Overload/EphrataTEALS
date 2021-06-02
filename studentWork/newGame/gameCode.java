package studentWork.newGame;
public class gameCode {
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
}
