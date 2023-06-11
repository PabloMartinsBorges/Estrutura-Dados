package exercicio4;


import exercicio1.Conj;

public class Teste {

	public static void main(String args[])
	{
		ConjGenerico<Integer> c1, c2, c3;
		
		c1 = new ConjGenerico();
		c2 = new ConjGenerico();

		c1.insere(1);
		c1.insere(3);
		c1.insere(5);
		c1.insere(2);
		c1.insere(4);

		System.out.println("Imprimindo c1");
		c1.imprime();

		c2.insere(1);
		c2.insere(3);
		c2.insere(2);
		c2.insere(4);

		System.out.println("Imprimindo c2");
		c2.imprime();
		

		System.out.println("É subconjunto: " + c2.eSubconjunto(c1));
		
		
		c2.insere(9);
		
		System.out.println("Imprimindo c2");
		c2.imprime();
		

		System.out.println("É subconjunto: " + c2.eSubconjunto(c1));

	}
}