package exercicio4;

import java.util.Scanner;


public class Main
{
	public static void main(String args[])
	{
		Fila filaS = new Fila(5);
		FilaDupla filaD = new FilaDupla(5);
		Scanner scanner = new Scanner(System.in);
		int escolha, item;

		
		do
		{
			escolha = Menu();
			
			switch(escolha) {
			case 0:
				//N�o faz nada
				break;
			case 1:
				System.out.println("Entre com o item para adicionar: ");
				item = scanner.nextInt();
				if ( ! filaS.insere(item) )
					System.out.println("Fila cheia.");
				break;
			case 2:
				item = filaS.remove();
				if (item != Integer.MIN_VALUE)
					System.out.println("Item " + item + " removido.");
				else
					System.out.println("Fila vazia.");
				break;      
			}
			
		}while(escolha != 0);
		

	
//---------------------------------------------------------------------------------------
				
		filaD  = Fila.retornaFilaDupla(filaS);
			
//---------------------------------------------------------------------------------------
		
		
		do
		{
			escolha = menuFilaDupla();

			switch(escolha) {
			case 0:
				//N�o faz nada
				break;
			case 1:
				System.out.println("Entre com o item para adicionar no fim da fila: ");
				item = scanner.nextInt();
				if ( ! filaD.insere(item) )
					System.out.println("Fila cheia.");
				break;
			case 2:
				item = filaD.remove();
				if (item != Integer.MIN_VALUE)
					System.out.println("Item " + item + " removido.");
				else
					System.out.println("Fila vazia.");
				break;
			case 3:
				System.out.println("Entre com o item para adicionar no in�cio da fila: ");
				item = scanner.nextInt();
				if ( ! filaD.insereInicio(item) )
					System.out.println("Fila cheia.");
				break;
			case 4:
				item = filaD.removeFim();
				if (item != Integer.MIN_VALUE)
					System.out.println("Item " + item + " removido.");
				else
					System.out.println("Fila vazia.");
				break;
			case 5:
				System.out.println("Conte�do da fila:");
				filaD.imprime();
				break;
			}

		}while(escolha != 0);
		
		

		scanner.close();
	}
	
	
	

	
	public static int Menu()
	{
		Scanner scanner = new Scanner(System.in);
		int escolha;

		System.out.println("--------------------------");
		System.out.println("Selecione a opcao:");
		System.out.println("1. Insere um item na Fila.");
		System.out.println("2. Remove o item do inicio.");
		System.out.println("0. Fim.");
		System.out.print("Opcao: ");
		escolha = scanner.nextInt();
	
		
		return escolha;
	}

	public static int menuFilaDupla()
	{
		Scanner scanner = new Scanner(System.in);
		int escolha;
		
		System.out.println("--------------------------");
		System.out.println("Selecione a opcao:");
		System.out.println("1. Insere elemento no fim da fila.");
		System.out.println("2. Remove elemento do in�cio da fila.");
		System.out.println("3. Insere elemento no in�cio da fila.");
		System.out.println("4. Remove elemento do fim da fila.");  
		System.out.println("5. Imprime elementos a partir do in�cio da fila.");
		System.out.println("0. Fim.");
		System.out.println("Opcao: ");
		escolha = scanner.nextInt();
		
		return escolha;
	}	
	
	
	

}