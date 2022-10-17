import java.util.Scanner; 
import java.lang.Math;

public class New{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in); 
		Double pi = Math.PI;
		final int x = 3;
		final int y = 9;
		
		System.out.println(pi);
		System.out.println(Math.pow(x, 2));
		System.out.println(Math.sqrt(9));
		
		switch (x){
			case 3:{
				System.out.println("este es el primer caso");
				break;
			}
			default:{
				System.out.println("ERROR");
				break;
			}
		}
	}
}