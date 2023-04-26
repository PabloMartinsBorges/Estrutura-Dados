package exercicio2;
import java.util.Scanner;

public class Main
{
	public static void main(String args[])
	{
		
		Fila f1 = new Fila(4);
		Fila f2 = new Fila(4);
		
		Fila filaMista = new Fila(6);
		Scanner scanner = new Scanner(System.in);
		int escolha, elemento;
		
		do
		{
			escolha = Menu();
			
			switch(escolha) {
			case 0:
				//N�o faz nada
				break;
			case 1:
				System.out.println("Entre com item para adicionar na fila 1: ");
				elemento = scanner.nextInt();
				
				if ( ! f1.insere(elemento) )
					System.out.println("Fila de Processos cheia.");
				break;
				
			case 2:
				System.out.println("Entre com item para adicionar na fila 2: ");
				elemento = scanner.nextInt();
				
				if ( ! f2.insere(elemento) )
					System.out.println("Fila cheia.");
				break;
				
			case 3:
				System.out.println("Conte�do da Fila:");
				filaMista.combinaFilas(f1, f2);
				
				Imprime(filaMista);
				break;
			}
			
		}while(escolha != 0);
		
	
		scanner.close();
	}
	
	//Para facilitar a inserção de dados implementei os menus e impressão de fila como metodos estaticos
	// além de deixar o codigo da main sucinto
	public static int Menu()
	{
		Scanner scanner = new Scanner(System.in);
		int escolha;

		System.out.println("--------------------------");
		System.out.println("Selecione a opcao:");
		System.out.println("1. Insere um item na Fila 1.");
		System.out.println("2. Insere um item na Fila 2.");
		System.out.println("3. Imprime a fila mista.");
		System.out.println("0. Fim.");
		System.out.print("Opcao: ");
		escolha = scanner.nextInt();
	
		
		return escolha;
	}
	
	public static void Imprime(Fila f)
	{
		
		if (f.vazia())
			System.out.println("Fila est� vazia.");
		else {
			System.out.print("Fila mista: ");
			for (int i =0; i < f.tamanho-1; i++)
				System.out.print(f.vetor[i]+", ");
		}
	}
}
