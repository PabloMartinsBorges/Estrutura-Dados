package exercicio2;



public class Teste {

	public static void main(String args[])
	{
		ConjGenerico<Integer> c1, c2;
		
		c1 = new ConjGenerico<Integer>();
		c2 = new ConjGenerico<Integer>();

		c1.insere(1);
		c1.insere(3);
		c1.insere(5);
		c1.insere(2);
		c1.insere(4);

		System.out.println("Imprimindo c1");
		c1.imprime();

		System.out.println();
		
		c2.insere(1);
		c2.insere(3);
		c2.insere(5);
		c2.insere(2);
		c2.insere(4);
		c2.insere(9);

		System.out.println("Imprimindo c2");
		c2.imprime();
		System.out.println();
		
		System.out.println("E igual: " + c1.eIgual(c2)+ "\n");
		
		
		c2.remove(9);
		System.out.println("Elemento '9' removido do conjunto 2 \n");
		
		System.out.println("Imprimindo c1");
		c1.imprime();
		
		System.out.println("Imprimindo c2");
		c2.imprime();
		
		System.out.println("E igual:  " + c1.eIgual(c2)+ "\n");
		
		
		System.out.println("---------------------");
		System.out.println("Teste Com Strings");
		System.out.println();
		
		
		ConjGenerico<String> c3, c4;
		
		c3 = new ConjGenerico<String>();
		c4 = new ConjGenerico<String>();

		c3.insere("ab");
		c3.insere("bc");
		c3.insere("cd");
		c3.insere("be");
		
		System.out.println("Imprimindo c3");
		c3.imprime();
		
		c4.insere("ab");
		c4.insere("cd");
		c4.insere("bc");
		
		System.out.println("Imprimindo c4");
		c4.imprime();
		
		System.out.println("E igual: " + c3.eIgual(c4)+ "\n");
		
		System.out.println("Removendo 'be' de c3 \n");
		c3.remove("be");
		
		System.out.println("Imprimindo c3");
		c3.imprime();
		
		System.out.println("Imprimindo c4");
		c4.imprime();
		
		System.out.println("E igual: " + c3.eIgual(c4)+ "\n");
		
	}
}