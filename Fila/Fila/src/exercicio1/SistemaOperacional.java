package exercicio1;

//Essa classe funciona como a fila para receber os processo
//Ela herda tanto da fila base quanto da TesteFilaSimples do exemplo para garantir acesso aos metodos de menu
public class SistemaOperacional extends TesteFilaSimples{
	
	private Processo[] processos;
	
	
	public SistemaOperacional(int tam) {
		super(tam);
		this.processos = new Processo[tam];
	}
	

	
	//Overload do método de inserir da classe Fila
	public boolean insere(Processo elemento)
	{
	  int fim;
	  
	  if ( !cheia() ) {
	    fim = (ini + n) % tamanho;
	    elemento.insereId(fim);
	    this.processos[fim] = elemento;
	    n++;
	    return true;
	  } 
	  else
	    return false;
	}
	
	
	//Override do imprime do TesteFilaSimles para Imprimir tanto id quanto o nome do processo
	@Override
	public void imprime()
	{
		int i, j;
		
		if (vazia())
			System.out.println("Fila est� vazia.");
		else
			for (i = ini, j = 1; j <= n; j = j + 1, i = (i + 1) % tamanho)
				System.out.println("Id: " + processos[i].retornaId() + " " + processos[i].retornaNome());
	}
}
