package studentWork.Unit2;

import java.util.Scanner;

public class PokemonBattle {

    public static final Scanner console = new Scanner(System.in);
    private static String choosen;
    private static double Level;
    private static double Attack;
    private static double Defence;
    private static double Base;
    private static double HP;
    private static double postAttackHP;
    
    
    public static void main(String[] args) {
        battleStart();
        Damage();
        statsTable();
        console.close();
    }

    public static void battleStart() {
        System.out.println("Another trainer is issuing a challenge!");
        System.out.println("Zebstrika appeared.");
        System.out.print("Which Pokemon do you choose? ");
        choosen = console.nextLine();
        System.out.println("You choose " + choosen + "!");
        System.out.println("It’s a Pokemon battle between " + choosen + " and Zebstrika! Go!");
    }

    public static void Damage() {
        System.out.println("Zebstrika used Thunderbolt!");
        System.out.println("Trainer, what are your " +choosen + "'s stats?");
        System.out.print("Level:");
        Level = console.nextDouble();
        System.out.print("Attack:");
        Attack  = console.nextDouble();
        System.out.print("Defense:");
        Defence = console.nextDouble();
        System.out.print("Base:");
        Base = console.nextDouble();
        System.out.print("HP:");
        HP = console.nextDouble();
       double Modifier = .5 + (Math.random()*1);
       double Experience = (2 * Level + 10) / 250;
       double Power = (Attack / Defence) * Base + 2;
       double Damage	= (Experience + Power) * Modifier;
       double DamageTaken = Math.floor(Damage);
       postAttackHP = HP-DamageTaken;
       System.out.println(choosen +  " sustained " + DamageTaken + " points damage.");
       System.out.println("HP, after damage, are now " + postAttackHP);
    }

    public static void statsTable() {
        System.out.println("Name      " + choosen);
        System.out.println("Level     " + Level);
        System.out.println("------------------------------ ");
        System.out.println("HP        " + postAttackHP);
        System.out.println("ATTACK    " + Attack);
        System.out.println("DEFENSE   " + Defence); 
        System.out.println("------------------------------- ");
        System.out.println("Moves learned: Scratch, Wave, MissingNo, Wirlwind.");
    }
    
}