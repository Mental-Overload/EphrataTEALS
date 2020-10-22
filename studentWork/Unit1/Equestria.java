package studentWork.Unit1;

public class Equestria {
    public static void main (String [] args) {
    Dia();
    Mane();
    Neigh();
    Pony();
    Tour();
    Total();
    Short();
    }
   
   public static void Dia() {
    double diameter = 15.9;
    double circumference = roadTrip(diameter);
     System.out.println("cicumference is "+ circumference);
    }
    
    public static double roadTrip(double diameter) {
    double circumference = diameter * Math.PI;
    return circumference;
    }
  
   public static void Mane() {
   double X1 = 29;
   double Y1 = 16;
   double X2 = 34;
   double Y2 = 8;
   double trip = distance(X1,Y1,X2,Y2);
   System.out.println("distance1 is "+trip);
   }
   
   public static double distance(double X1, double Y1, double X2, double Y2) {
   double a = Math.pow((X2-X1), 2) + Math.pow((Y2-Y1), 2);
   double trip = Math.sqrt(a);
   return trip;
  }
  
   public static void Neigh() {
   double X1 = 6;
   double Y1 = 19;
   double X2 = 22;
   double Y2 = 7;
   double trip = distance(X1,Y1,X2,Y2);
   System.out.println("distance2 is "+ trip);
   }  
   
   public static void Pony() {
   double X1 = 25;
   double Y1 = 24;
   double X2 = 16;
   double Y2 = 14;
   double trip = distance(X1,Y1,X2,Y2);
   System.out.println("distance3 is "+ trip);
   }
      
   public static void Tour() {
   double X1 = 5;
   double Y1 = 5;
   double X2 = 19;
   double Y2 = 11;
   double X3 = 17;
   double Y3 = 19;
   double tourDistance = distance(X1,Y1,X2,Y2,X3,Y3);
   System.out.println("Tour distance is "+ tourDistance);
   }
  
   public static double distance(double X1, double Y1, double X2, double Y2, double X3, double Y3) {
   double a = Math.pow((X2-X1), 2) + Math.pow((Y2-Y1), 2);
   double c = Math.sqrt(a);
   double b = Math.pow((X3-X2), 2) + Math.pow((Y3-Y2), 2);
   double d = Math.sqrt(b);
   double tourDistance = c + d;
   return tourDistance;
  }

   public static void Total() {
   double X1 = 5;
   double Y1 = 5;
   double X2 = 19;
   double Y2 = 11;
   double X3 = 17;
   double Y3 = 19;
   double X4 = 30;
   double Y4 = 13;
   double totalDistance = totalTrip(X1,Y1,X2,Y2,X3,Y3,X4,Y4);
   System.out.println("Total distance is "+ totalDistance);
   }
  
   public static double totalTrip(double X1, double Y1, double X2, double Y2, double X3, double Y3, double X4, double Y4) {
   double a = Math.pow((X2-X1), 2) + Math.pow((Y2-Y1), 2);
   double e = Math.sqrt(a);
   double b = Math.pow((X3-X2), 2) + Math.pow((Y3-Y2), 2);
   double f = Math.sqrt(b);
   double c = Math.pow((X4-X3), 2) + Math.pow((Y4-Y3), 2);
   double g = Math.sqrt(c);
   double d = Math.pow((X1-X4), 2) + Math.pow((Y1-Y4), 2);
   double h = Math.sqrt(d);
   double totalDistance = e + f + g +h;
   return totalDistance;
}

   public static void Short() {
   double X1 = 5;
   double Y1 = 5;
   double X2 = 19;
   double Y2 = 11;
   double X3 = 17;
   double Y3 = 19;
   double shortDistance = shortestDistance(X1,Y1,X2,Y2,X3,Y3);
   System.out.println("The shortest distance is "+ shortDistance);
   }

   public static double shortestDistance(double X1, double Y1, double X2, double Y2, double X3, double Y3) {
   double a = Math.pow((X2-X1), 2) + Math.pow((Y2-Y1), 2);
   double c = Math.sqrt(a);
   double b = Math.pow((X3-X1), 2) + Math.pow((Y3-Y1), 2);
   double d = Math.sqrt(b);
   double shortDistance = Math.min(c, d);
   return shortDistance;
   }

}
