package exercicio3;


import exercicio1.Conj;

public class Teste {

	public static void main(String args[])
	{
		ConjGenerico<Integer> c1, c2, c3;
		
		c1 = new ConjGenerico<Integer>();
		c2 = new ConjGenerico<Integer>();
		c3 = new ConjGenerico<Integer>();

		c1.insere(1);
		c1.insere(3);
		c1.insere(5);
		c1.insere(2);
		c1.insere(5);
		c1.insere(7);
		c1.insere(8);

		System.out.println("Imprimindo c1");
		c1.imprime();

		c2.insere(2);
		c2.insere(3);
		c2.insere(5);
		c2.insere(7);
		
		c2.imprime();
		//Caso Verdadeiro
		try {
		c3.atribui(c2.complementar(c1));
		}catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		
		c3.imprime();

		//Caso adicionando o 1
				c2.insere(1);
				
				try {
					c3.atribui(c2.complementar(c1));
					}catch(RuntimeException e) {
						System.out.println(e.getMessage());
					}
					
					
					c3.imprime();
		
		//Caso Falso
		c2.insere(9);
		
		try {
			c3.atribui(c2.complementar(c1));
			}catch(RuntimeException e) {
				System.out.println(e.getMessage());
			}
			
			
			c3.imprime();
	}
}