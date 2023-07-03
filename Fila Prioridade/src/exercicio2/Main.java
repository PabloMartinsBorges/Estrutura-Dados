package exercicio2;

public class Main
{
	public static void main(String args[])
	{
		int tamanho = 6;
		int vetor[] = new int[]{10, 6, 3, 1, 5, 7};
		
		HeapBinariaMaxima heapMaxima = new HeapBinariaMaxima(tamanho, vetor);
		
		System.out.print("Vetor Maximo: ");
		
		heapMaxima.imprimeTamanho();
		
		HeapBinariaMinima heap = new HeapBinariaMinima(heapMaxima);
		
		System.out.print("Vetor Minimo: ");
		heap.imprime();
		
		
	}
}