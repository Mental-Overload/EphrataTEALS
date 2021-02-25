package studentWork;

import java.util.Scanner;

public class codeTest {
    static Scanner console = new Scanner(System.in);
    static int min = Integer.MAX_VALUE;
    static int max = Integer.MIN_VALUE;
    static int num = 0;

    public static void main(String[] args) {
        do {
            System.out.print("Type a number (or -1 to stop): ");
            num = console.nextInt();
        } while (num != -1);
        

            if (min < num) {
                min = num;
            }
            if (num > max) {
            max = num;
            }
            
            System.out.println("maximum was : " + max);
            System.out.println("minimum was :" + min);

} 
}