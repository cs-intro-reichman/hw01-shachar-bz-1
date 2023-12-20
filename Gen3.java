public class Gen3 {
public static void main(String[] args) {
// print three random numbers between a and b and return the lowest 

 int min = Integer.parseInt(args[0]);
 int max = Integer.parseInt(args[1]);

//first random between range

 double random = Math.random();
 int num1 = (int) (random * (max-min)) + min;
 System.out.println(num1);

//second random between range
 random = Math.random();
 int num2 = (int) (random * (max-min)) + min;
 System.out.println(num2);

//third random between range
 random = Math.random();
 int num3 = (int) (random * (max-min)) + min;
 System.out.println(num3);

//return the lowest number between three option
 int lowest = Math.min(num1, num2);
 lowest = Math.min(lowest, num3);

 System.out.println("The minimal generated number was " + lowest);

}
}
