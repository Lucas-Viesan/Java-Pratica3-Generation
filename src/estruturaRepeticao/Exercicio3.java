package estruturaRepeticao;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int idade, contador = 0, contador2 =0 ; 
		
		System.out.println("Digite uma idade: ");
		idade = scan.nextInt();	
		
		while(idade >= 0) {
			System.out.println("Digite uma idade: ");
			idade = scan.nextInt();	
				if(idade < 21 && !(idade < 0) ) {
					contador = contador + 1;
				} else if (idade > 50) {
					contador2 = contador2 + 1;
				} else {
					
				}
		}
		
		System.out.println("Total de pessoas menores de 21 anos: " + contador);
		System.out.println("Total de pessoas maiores de 50 anos: " + contador2);
	}

}
