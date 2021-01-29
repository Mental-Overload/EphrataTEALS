package sampleCode.Random;
import java.util.Random;
/** 
 * Lab from 01/27: Using the Random class in Java to simulate spells.
 */
public class RandomLab {
    static Random rand = new Random();

    public static void main(String[] args) {
        int randomValue = rand.nextInt(6) + 1;
        System.out.print("you hav done " + randomValue + " points of");
        damageType();

    }

    public static void damageType()  {
int randomValue = rand.nextInt(8) + 1;
if (randomValue == 1) {
    System.out.print(" acid damage.");
} else if (randomValue == 2) {
    System.out.print(" cold damage.");
} else if (randomValue == 3) {
    System.out.print(" fire damage.");
} else if (randomValue == 4) {
    System.out.print(" force damage.");
} else if (randomValue == 5) {
    System.out.print(" lighting damage.");
} else if (randomValue == 6){
    System.out.print(" poison damage.");
} else if (randomValue == 7) {
    System.out.print(" psycic damage.");
} else if (randomValue == 8) {
    System.out.print(" thunder damage.");
}
    }

}




// 1. Choose a spell from the list provided. Spell chosen: Chaos Bolt
        // 2. For your spell, calculate the damage range. For example, for a spell
        // that does 1d6 fire damage, the damage range is 1 to 6
        // Damage range: ______ to _______

        // 3. Use Random to calculate the damage for one casting of the spell.
        // Print out the damage dealt.

        // 4. Player's choice! Expand your program - be as creative as you'd like
        // and/or choose one of the following:
        //      a. Implement the "Advanced" feature for your chosen spell
        //      b. Add print statements to tell a story featuring your spell
        //      c. In D&D, you roll a d20 to see if your spell hits its target.
        //         If you roll a 10 or higher, your spell hits! If not, it
        //         misses and no damage is dealt.
        //      d. Cast your spell multiple times (loop)
        //      e. Incorporate user interaction
    
