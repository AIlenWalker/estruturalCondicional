package estruturalCondicional;

import java.util.Scanner;

public class exerciceOne {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		System.out.println("DIGITE UM N�MERO:");
		x = sc.nextInt();
		
		if (x < 0) {
			System.out.println("NEGATIVO");
		}
		else  {
			System.out.println("N�O NEGATIVO");
		}
		
		sc.close();
	}

}
