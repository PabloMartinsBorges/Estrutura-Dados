package exercicio6;

import java.util.Scanner;


public class Fila
{
	/* Atributos protected para serem usados na subclasse. */
	protected int tamanho;	/* Tamanho do vetor */
	protected String[] vetor;	/* Vetor de elementos */
	protected int ini;	/* Posicao do proximo elemento a ser retirado */
	protected int n;	/* Numero de elementos na fila */
	
	public Fila(int tam)
	{
		tamanho = tam;
		vetor = new String[tamanho];
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
	public String remove()
	{
		String elemento = "String Vazia";
		
		if (!this.vazia())
		{
			elemento = vetor[ini];
			ini = (ini + 1) % tamanho;
			n--;
		} 

		return elemento;
	}
	
	//Inserimos o elemento no final da fila
	public boolean insere(String elemento)
	{
	  int fim;
	  
	  if ( !cheia() ) {
	    fim = (ini + n) % tamanho;
	    vetor[fim] = elemento;
	    n++;
	    return true;
	  } 
	  else
	    return false;
	}
	
	
	public void representaBinario(int n) {
		
	/*	if(this.cheia()) {
			for(int i = 0; i < this.tamanho; i++) {
				this.remove();
			}
		}
		else {*/
			for(int i = 1; i < n+1; i++) {
			
				System.out.println(Integer.toBinaryString(i));
				this.insere(Integer.toBinaryString(i));
			}
		//}
		
	}
	
	
	
	public void imprime()
	{
		
		if (this.vazia())
			System.out.println("Fila est� vazia.");
		else {
			System.out.print("Fila mista: ");
			for (int i =0; i < this.tamanho-1; i++)
				System.out.print(this.vetor[i]+", ");
		}
	}



}