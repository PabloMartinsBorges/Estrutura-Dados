package exercicio6;
import java.util.Scanner;

public class Main
{
	public static void main(String args[])
	{
		
		Scanner scanner = new Scanner(System.in);
		int escolha;
		int n;
			
				
		
		do
		{
			escolha = menu();
			
			switch(escolha) {
			case 0:
				//N�o faz nada
				break;
			case 1:
				System.out.println("Insira um numero inteiro positivo que será convertido para binário");
				n = scanner.nextInt();
				Fila fila = new Fila(n);
				fila.representaBinario(n);
				break;
			  
			}
			
		}while(escolha != 0);
	
		scanner.close();
	}



public static int menu()
{
	Scanner scanner = new Scanner(System.in);
	int escolha;

	System.out.println("--------------------------");
	System.out.println("Selecione a opcao:");
	System.out.println("1. Insere o numero para conversão.");
	System.out.println("0. Fim.");
	System.out.print("Opcao: ");
	escolha = scanner.nextInt();

	
	return escolha;
}

}
