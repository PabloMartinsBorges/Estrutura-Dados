package exercicio1;
import java.util.Scanner;

public class Main
{
	public static void main(String args[])
	{
		
		SistemaOperacional so = new SistemaOperacional(5);
		Scanner scanner = new Scanner(System.in);
		int escolha;
		String nome;
		
		do
		{
			escolha = so.menu();
			
			switch(escolha) {
			case 0:
				//N�o faz nada
				break;
			case 1:
				System.out.println("Entre com o nome do processo para adicionar: ");
				nome = scanner.nextLine();
				
				Processo p = new Processo(nome);
				if ( ! so.insere(p) )
					System.out.println("Fila de Processos cheia.");
				break;
			case 2:
				int elemento = so.remove();
				if (elemento != Integer.MIN_VALUE)
					System.out.println("Processo de Id " + elemento + " removido.");
				else
					System.out.println("Fila de Processos está vazia.");
				break;
			case 3:
				System.out.println("Conte�do da Fila de Processos:");
				so.imprime();
				break;        
			}
			
		}while(escolha != 0);
	
		scanner.close();
	}
}
