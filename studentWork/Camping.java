package studentWork;

import java.util.Arrays;

public class Camping {
    public static void main(String[] args) {
    
      // dogNames array here
      
      String[] dogNames = new String[3];
      dogNames[0]="Baby";
      dogNames[1]="Harlow";
      dogNames[2]="Hudson";


      
      // babyGrowls array here and call countBabyGrowls Method



       
      // harlowNaps array here and call increaseNap Method as well as minHarlowNaps and maxHarlowNaps Methods
      double[] harlowNaps = {1.5, .75, 2.25, .5, 3, .25};
      increasenap(harlowNaps);
      System.out.println(Arrays.toString(harlowNaps));

      
      // holdHudson array here and call sumHudsonHold Method
      
      System.out.println(Arrays.toString(dogNames));
      // Println statements here
      /* Should output
      Baby growled 43 times!
      Harlow napped Minimum: 0.5 Maximum: 3.25
      Hudson was held 6 times!
      */

      


    } //end of main method
    
    // countBabyGrowls static method here
    






    
    // increaseNap static method here
    
public static void increasenap(double[]harlowNaps) {
  for (int i = 0; i < harlowNaps.length; i++) {
    harlowNaps[i] += 0.25;
  }
}


    
    // minHarlowNaps static method here     
    public static double minHarlowNaps(double[]harlowNaps) {
      double napMin = 79.9;
      for(double x; harlowNaps){
        if(x < napMin) {
          napMin = x;
        }
      }
      return napMin;
    }






    
    // maxHarlowNaps static method here    
    public static double minHarlowNaps(double[]harlowNaps) {
      double napMax = 79.9;
      for(double x; harlowNaps){
        if(x < napMax) {
          napMax = x;
        }
      }
      return napMax;
    }



    
    
    // sumHudsonHold static method here  
    





    
}