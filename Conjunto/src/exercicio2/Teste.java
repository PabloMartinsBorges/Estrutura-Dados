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

		c2.insere(1);
		c2.insere(3);
		c2.insere(5);
		c2.insere(2);
		c2.insere(4);
		c2.insere(9);

		System.out.println("Imprimindo c2");
		c2.imprime();
		
		System.out.println("E igual: " + c1.eIgual(c2));
		
		c2.remove(9);
		System.out.println("Elemento '9' removido do conjunto 2");
		
		c1.imprime();
		c2.imprime();
		System.out.println("E igual:  " + c1.eIgual(c2));

		
	}
}