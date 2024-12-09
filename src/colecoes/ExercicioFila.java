package colecoes;
import java.util.Scanner;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExercicioFila {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Queue<String> fila = new LinkedList<String>();
		
		String nome;
		
		Integer opcoes;
		

		
		do {
			
			System.out.println("***************************************");
			System.out.println("1 - Adicionar Cliente a Fila");
			System.out.println("2 - Lista todos os Clientes");
			System.out.println("3 - Retirar Cliente a Fila");
			System.out.println("0 - Sair");
			System.out.println("***************************************");
			
			System.out.println("Entre com a opção desejada: ");
			opcoes = scan.nextInt(); 
			
			switch(opcoes) {
			case 1: 
				System.out.println("Digite o nome: ");
				nome = scan.next();
				fila.add(nome);
				Iterator<String> clientesNome = fila.iterator();
				while(clientesNome.hasNext()){
					   System.out.println(clientesNome.next());
					   }
				System.out.println("Cliente Adicionado!");
				break;
			case 2:
				if(fila.isEmpty()) {
					System.out.println("A fila está vazia!");
				} else {
					Iterator<String> clientesFila = fila.iterator();
					while(clientesFila.hasNext()){
						   System.out.println(clientesFila.next());
						}
				}
				break;
			
			case 3: 
				if(fila.isEmpty()) {
					System.out.println("A fila está vazia!");
				} else {
					fila.remove();
					Iterator<String> clientes = fila.iterator();
					while(clientes.hasNext()){
						   System.out.println(clientes.next());
						}
				}
				break;
			}
			
			
			
		}while(opcoes != 0); 
			System.out.println("Programa Finalizado!");
		
	

	}

}
