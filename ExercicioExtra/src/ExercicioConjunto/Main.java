package ExercicioConjunto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tam = 20;
		
		Conjunto c = new Conjunto(tam);
		
		if(c.estaVazio()) {
			System.out.println("Nada por aqui");
		}
		else System.out.println("tudo por aqui");
			
		c.adicionaElem(0);
		c.adicionaElem(10);
		c.verificaMenorElem();
		c.verificaMaiorElem();
	}

}
