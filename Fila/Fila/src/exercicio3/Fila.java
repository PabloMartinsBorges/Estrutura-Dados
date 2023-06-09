package exercicio3;

public class Fila
{
	/* Atributos protected para serem usados na subclasse. */
	protected int tamanho;	/* Tamanho do vetor */
	protected int[] vetor;	/* Vetor de elementos */
	protected int ini;	/* Posicao do proximo elemento a ser retirado */
	protected int n;	/* Numero de elementos na fila */
	protected PilhaGenerica[] vetorPilha;
	protected Fila[] vetorFila;
	
	public Fila(int tam)
	{
		tamanho = tam;
		vetorPilha = new PilhaGenerica[tamanho];
		ini = 0;
		n = 0;
	}
	
	
	
	public boolean vazia()
	{
		return (n == 0);
	}
	
	public boolean cheia()
	{
		return (n == tamanho);
	}
	
	//Retiramos o elemento do in�cio da fila
	public int remove()
	{
		int elemento = Integer.MIN_VALUE;
		
		if (!this.vazia())
		{
			elemento = vetor[ini];
			ini = (ini + 1) % tamanho;
			n--;
		} 

		return elemento;
	}
	
	//Inserimos o elemento no final da fila
	public boolean insere(PilhaGenerica elemento)
	{
	  int fim;
	  
	  if ( !cheia() ) {
	    fim = (ini + n) % tamanho;
	    vetorPilha[fim] = elemento;
	    n++;
	    return true;
	  } 
	  else
	    return false;
	}
}