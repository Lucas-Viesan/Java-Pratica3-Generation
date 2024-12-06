package colecoes;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Set<Integer> valoresInteiros = new HashSet<>();
		
		valoresInteiros.add(5);
		valoresInteiros.add(6);
		valoresInteiros.add(2);
		valoresInteiros.add(32);
		valoresInteiros.add(51);
		valoresInteiros.add(15);
		valoresInteiros.add(2);
		valoresInteiros.add(9);
		valoresInteiros.add(11);
		valoresInteiros.add(23);
		
		System.out.println("Digite um número inteiro para verificar se está no Set:");
        int n1 = scan.nextInt();

        
        if (valoresInteiros.contains(n1)) {
            System.out.println("Número " + n1 + " Encontrado!");
        } else {
            System.out.println("O número " + n1 + " não foi encontrado!");
        }

	}

}
