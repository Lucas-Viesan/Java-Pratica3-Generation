package exercicios;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n1, n2, i;
		
		System.out.println("Digite um número: ");
		n1 = scan.nextInt();
		System.out.println("Digite outro número: ");
		n2 = scan.nextInt();
		
		if(n1 > n2) {
			System.out.println("Intervalo inválido");
		} else {
			for(i = n1; i <= n2; i++) {
			   if(i % 3 == 0 && i % 5 == 0) {
				   System.out.println(i + " é multiplo de 3 e 5");
			   }
			}
			
		}

	}
}
