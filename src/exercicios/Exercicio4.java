package exercicios;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n1, soma = 0;
		
		do {
			System.out.println("Digite um número: ");
			n1 = scan.nextInt();
			if(n1 >= 0) {
				soma = n1 + soma;	
			}
				
		}while(n1 != 0);
        
		System.out.println("A soma dos números positivos é: " + soma);
	}

}
