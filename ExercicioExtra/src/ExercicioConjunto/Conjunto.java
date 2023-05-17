package ExercicioConjunto;

public class Conjunto {
	
	private boolean[] vetor;

	
	
	public Conjunto(int n) {
		this.vetor = new boolean[n];
	}
	
	public void tornarVazio() {
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = false;
		}
		System.out.println("O conjunto se tornou vazio");
	}
	
	public boolean verificaPertinencia(int x) {
		if(vetor[x] == true) 
			return true;
		else return false;
	}
	
	public void adicionaElem(int y) {
		if(vetor[y]==true)
			System.out.println("O numero já faz parte do conjunto");
		else
			vetor[y] = true;
	}
	
	public void removeElem(int y) {
		if(vetor[y]==false)
			System.out.println("O numero não faz parte do conjunto");
		else
			vetor[y] = false;
	}
	
	
	public void verificaMenorElem() {
		for(int i = 0; i < vetor.length; i++) {
			
			if(vetor[i] == true) {
				System.out.println("O menor elemento é "+ i);
				break;
			}
		}
		
	}
	
	public boolean verificaMaiorElem() {
		
			for(int i = vetor.length-1; i >= 0 ; i--) {
			
				if(vetor[i] == true) {
					System.out.println("O maior elemento é "+ i);
					return true;
				}
			}
			
			return false;
	}
	
	
	public boolean estaVazio() {//Testar Vazio
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] == true) {
				System.out.println("O conjunto não está vazio");
				return false;
			}
		}
		System.out.println("O conjunto está vazio");
		return true;
	}
	
	
	public void fazUniao(Conjunto a, Conjunto b) {
		for(int i = 0; i < this.vetor.length; i++ ) {			
			if(a.vetor[i] == true || b.vetor[i] == true) 
				this.vetor[i] = true;
		}
		
	}

	public boolean fazIntersecao(Conjunto a, Conjunto b) {
		for(int i = 0; i < this.vetor.length; i++ ) {			
			if(a.vetor[i] == true && b.vetor[i] == true) 
				this.vetor[i] = true;
		}
		if(this.estaVazio()) {
			System.out.println("Não há intersecções");
			return false;	
		}else return true;
	}
}
