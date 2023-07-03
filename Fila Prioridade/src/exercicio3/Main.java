package exercicio3;

public class Main
{
	public static void main(String args[])
	{
		int tamanho = 6;
		int vetor[] = new int[]{10, 6, 3, 1, 5, 7};
		
		HeapBinariaMinima heapMinima = new HeapBinariaMinima(tamanho, vetor);
		
		System.out.print("Vetor Minimo: ");
		
		heapMinima.imprime();
		
		HeapBinariaMaxima heap = new HeapBinariaMaxima(heapMinima);
		
		System.out.print("Vetor Maximo: ");
		
		heap.imprime();
		
		
	}
}