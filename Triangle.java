public class Triangle {
public static void main(String[] args) {
//  get the length of 3 lines and check if they can make a Triangle

 int line1 = Integer.parseInt(args[0]);
 int line2 = Integer.parseInt(args[1]);
 int line3 = Integer.parseInt(args[2]);

 boolean isTriangle = true;

 if (line1 + line2 < line3){
	 isTriangle = false;
}
 else if (line1 + line3 < line2){
	isTriangle = false;
}
 else if (line2 + line3 < line1){
	isTriangle = false;
}

 System.out.println(line1 + ", " + line2 + ", " + line3 + ": " + isTriangle);

 }
}
