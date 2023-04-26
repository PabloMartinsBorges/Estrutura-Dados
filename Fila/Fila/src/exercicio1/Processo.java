package exercicio1;

public class Processo {

	private int id;
	private String nome;
	
	
	public Processo(String nome) {
		this.id = 0;
		this.nome = nome;
	}
	
	public String retornaNome() {
		return this.nome;
	}
	
	public int retornaId() {
		return this.id;
	}
	
	public void insereNome(String nome) {
		this.nome = nome;
	}
	public void insereId(int id) {
		this.id = id;
	}
	
	
}
