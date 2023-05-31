
public class Main {

	public static void main(String[] args) {
		Conj c = new Conj();
		
		c.insere(2);
		c.insere(3);
		c.insere(4);

		System.out.println("Maior: " + c.retornaMaiorElem()+" Menor: "+ c.retornaMenorElem());
		
		c.insere(0);
		c.insere(5);
		c.insere(1);

		System.out.println("Maior: " + c.retornaMaiorElem()+" Menor: "+ c.retornaMenorElem());
		
		
	}

}
