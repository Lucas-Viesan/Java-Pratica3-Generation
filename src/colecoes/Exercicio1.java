package colecoes;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collection;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList<String> cores = new ArrayList<>();
		
		String valCores;
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Digite uma cor: ");
			valCores = scan.next();
			
			cores.add(valCores);		
	 }
		for(String allColors : cores) {
			System.out.println("Lista de todas as cores: " + allColors);
		}
		
			cores.sort(null);
		for(String ordColors : cores) {
			System.out.println("Lista cores ordenada de forma crescente: " + ordColors);
		}
		
	}

}
