package vetor;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vetorInteiros[] = new int[10]; 
        int soma = 0; 

      
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < vetorInteiros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetorInteiros[i] = scanner.nextInt();
            soma += vetorInteiros[i]; 
        }

        
        System.out.println("\nElementos nos índices ímpares:");
        for (int num : vetorInteiros) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }

       
        System.out.println("\nElementos que são números pares:");
        for (int num : vetorInteiros) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }

        
        float media = (float) soma / vetorInteiros.length; 
        System.out.println("\nSoma de todos os elementos: " + soma);
        System.out.println("Média de todos os elementos: " + media);

    }
}

