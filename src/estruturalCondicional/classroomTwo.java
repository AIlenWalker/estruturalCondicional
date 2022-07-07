package estruturalCondicional;

import java.util.Locale;
import java.util.Scanner;

public class classroomTwo {

	public static void main(String[] args) {
	    Locale.setDefault(Locale.US);   
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o preço: ");
		double preco;
		preco = sc.nextDouble();
		
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		
	    System.out.println("Desconto: " + desconto); 
	    
	    sc.close();

	}

}
