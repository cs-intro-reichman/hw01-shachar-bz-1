public class LinearEq {
public static void main(String[] args) {
//  return the value of X in the equation  𝑎 ⋅ 𝑥 + 𝑏 = C

 double a = Double.parseDouble(args[0]);
 double b = Double.parseDouble(args[1]);
 double c = Double.parseDouble(args[2]);

// compute answer
 double answer = c-b;
 answer = answer/a;
 System.out.println( " the value of x is  " + answer);
 }
}

