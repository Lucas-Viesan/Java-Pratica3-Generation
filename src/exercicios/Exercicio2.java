package exercicios;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n1, i; 
		int par = 0;
		int impar = 0;
		
		for(i = 0; i < 10; i++) {
			System.out.println("Digite um número: ");
			n1 = scan.nextInt();
			
			if(n1 % 2 == 0) {
				par = par + 1;
			} else {
				impar = impar + 1;
			}
			
		}

		System.out.println("Total de números pares: " + par);
		System.out.println("Total de números ímpares: " + impar);
	}

}
