import java.util.Scanner;
public class Quadratic {
	public static void main (String[] args){
	Scanner in= new Scanner(System.in);
	System.out.print("Type 3 numbers:");
	int a = in.nextInt();
	int b = in.nextInt();
	int c = in.nextInt();
	
	if (a == 0 || Math.pow(b,2) -4*a*c <0){
		System.out.println("Error");
	}else{
		System.out.println((-1*b + Math.sqrt(Math.pow(b,2)- 4*a*c))/(2*a) +" "+ (-1*b - Math.sqrt(Math.pow(b,2)- 4*a*c)) /(2*a));
	}
}
}
