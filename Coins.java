public class Coins {
public static void main(String[] args) {
//  return the remainder of a number in quarters and a cents

 int num1 = Integer.parseInt(args[0]);
 
 int quarter = num1/25;
 int cent = num1%25;
 
 System.out.println( "Use " + quarter + " quarters and " + cent + " cents ");
 }
}

