package exercicio4;

import java.util.Scanner;

import exercicio2.Fila;

public class Main
{
	public static void main(String args[])
	{
		TesteFilaSimples filaSTeste = new TesteFilaSimples(5);
		FilaDupla filaD = new FilaDupla(5);
		Scanner scanner = new Scanner(System.in);
		int escolha, item;

		
		do
		{
			escolha = filaSTeste.menu();
			
			switch(escolha) {
			case 0:
				//N�o faz nada
				break;
			case 1:
				System.out.println("Entre com item para adicionar na fila 1: ");
				item = scanner.nextInt();
				
				if ( ! filaSTeste.insere(item) )
					System.out.println("Fila de Processos cheia.");
				break;
				
			case 2:
				System.out.println("Entre com item para adicionar na fila 2: ");
				item = scanner.nextInt();
				
				if ( ! .insere(elemento) )
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
	
//---------------------------------------------------------------------------------------
		
		do
		{
			escolha = Menu();

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
				Imprime(filaD);
				break;
			}

		}while(escolha != 0);
		
		

		scanner.close();
	}
	
	
	
/*
	
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
	
	
	public static void PreencherFila(Fila f) {
		int escolha, item;
		
		Scanner scanner = new Scanner(System.in);
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
				if ( ! f.insere(item) )
					System.out.println("Fila cheia.");
				break;
			case 2:
				item = f.remove();
				if (item != Integer.MIN_VALUE)
					System.out.println("Item " + item + " removido.");
				else
					System.out.println("Fila vazia.");
				break;
			case 3:
				System.out.println("Conte�do da fila:");
				Imprime(f);
				break;        
			}
			
		}while(escolha != 0);
	
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
	}*/
}