package vetor;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int vetorInteiros[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
        int n1;
        boolean encontrado = false; 
        
        System.out.println("Digite um número: ");
        n1 = scan.nextInt();
        
        

        for (int i = 0; i < vetorInteiros.length; i++) {
            if (n1 == vetorInteiros[i]) {
                System.out.println("O número " + n1 + " está localizado na posição " + i);
                encontrado = true; 
                break; 
            }
        }

        if (!encontrado) {
            System.out.println("O número " + n1 + " não foi encontrado!");
        }


	}

}
