package colecoes;

import java.util.Scanner;
import java.util.Iterator;
import java.util.Stack;

public class ExercicioPilha {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Stack<String> pilha = new Stack<String>();
		
		String nome; 
		
		Integer opcoes;
		

		do {
			
			System.out.println("***************************************");
			System.out.println("1 - Adicionar Livro a pilha");
			System.out.println("2 - Lista todos os Livros");
			System.out.println("3 - Retirar Livro a pilha");
			System.out.println("0 - Sair");
			System.out.println("***************************************");
			
			System.out.println("Entre com a opção desejada: ");
			opcoes = scan.nextInt(); 
			
			switch(opcoes) {
			case 1: 
				System.out.println("Digite o nome: ");
				nome = scan.next();
				pilha.push(nome);
				Iterator<String> livrosNome = pilha.iterator();
				while(livrosNome.hasNext()){
					   System.out.println(livrosNome.next());
					   }
				System.out.println("Livro Adicionado!");
				break;
				
			case 2:
				if(pilha.isEmpty()) {
				System.out.println("A pilha está vazia!");
				} else {
				Iterator<String> livrosPilha = pilha.iterator();
				while(livrosPilha.hasNext()){
					   System.out.println(livrosPilha.next());
				}
				
			}
			break;
			
			case 3: 
				if(pilha.isEmpty()) {
					System.out.println("A pilha está vazia!");
				} else {
					pilha.pop();
					Iterator<String> livros = pilha.iterator();
					while(livros.hasNext()){
						   System.out.println(livros.next());
						}
				}
				break;
			}

		}while(opcoes != 0); 
			System.out.println("Programa Finalizado!");
		

	}

}
