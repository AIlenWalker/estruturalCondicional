package estruturalCondicional;

import java.util.Scanner;

public class exerciceTwo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();

		if (X % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}

		sc.close();

	}

}
