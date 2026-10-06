import java.util.Scanner;
public class Fermat{
	public static void main (String[] args) {
		System.out.println("Type 4 numbers");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int n = in.nextInt();
	if(n >= 2 && Math.pow(a,n) + Math.pow(b,n) == Math.pow(c,n)){
		System.out.print("Holy smokes, Fermat was wrong!");
	} else {
		System.out.print("No, that doesn’t work.");
	}
}
}
		
