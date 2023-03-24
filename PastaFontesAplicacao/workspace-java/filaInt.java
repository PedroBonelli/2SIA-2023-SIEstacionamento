package implementando_fila_circular;

public class filaInt {
	final int tamanhoFila = 3;
	int[] fila = new int[tamanhoFila];
	int ini, fim;
	int contElementos;
	
	public void init() {
		ini = 0;
		fim = 0;
	}
	
	public boolean isFull() {
		return contElementos == tamanhoFila ? true : false;
	}
	
	public boolean isEmpty() {
		return contElementos == 0 ? true : false;
	}
	
	public void enqueue(int elemento) {
		if(!isFull()) {
			if(fim==(tamanhoFila)) {
				fim = 0;
				fila[fim] = elemento;
				fim++;
			} else {
				fila[fim] = elemento;
				fim++;
			}
			contElementos++;
		} else {
			System.out.println("Não é possível completar o enqueue. A fila está cheia.");
		}
	}
	
	public int dequeue() {
		int elemento;
		
		if(!isEmpty()) {
			if(ini==(tamanhoFila)) {
				ini = 0;
				elemento = fila[ini];
				ini++;
				
			} else {
				elemento = fila[ini];
				ini++;
		
			}
			contElementos--;
			return elemento;
		} else {
			System.out.println("Não é possível completar o dequeue. A fila está vazia.");
			return 0;
		}
	}
	
	public int first() {
		return fila[ini];
	}
	
}
