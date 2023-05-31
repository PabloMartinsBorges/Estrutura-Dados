package exercicio1;

public class Teste {

	public static void main(String args[])
	{
		Conj c1= new Conj();
		
		c1.insere(1);
		c1.insere(3);
		c1.insere(5);
		c1.insere(2);
		c1.insere(4);

		System.out.println("Imprimindo c1");
		c1.imprime();
		
		System.out.println("Maior: " + c1.retornaMaiorElem()+" Menor: "+ c1.retornaMenorElem());
			
		c1.insere(7);
		c1.insere(6);
		
		System.out.println("Imprimindo c1");
		c1.imprime();
		
		System.out.println("Maior: " + c1.retornaMaiorElem()+" Menor: "+ c1.retornaMenorElem());
		
	}
}