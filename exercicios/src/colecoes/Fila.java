package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		// Offer e Add -> Adicionam elementos na fila
		// Diferen�a � o comportamento ocorre quando a fila est� cheia
		
		fila.add("Ana"); // Retorna False
		fila.offer("Bia");  //Lan�a uma excess�o
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		//Peek e Element -> obter o pr�ximo elemento da fila (sem remover)
		//Diferen�a � o comportamento ocorre quando a lista est� vazia 
		System.out.println(fila.peek());  //Retorna Null
		System.out.println(fila.peek());
		System.out.println(fila.element()); // Lan�a uma exce��o
		System.out.println(fila.element());
		

		
		//Poll e Remove -> obter o pr�ximo elemento da fila e remove!
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());	// Retorna False
		System.out.println(fila.remove());  // Lan�a uma excess�o
		 
		//fila.size();
		//fila.clear();
		//fila.isEmpty();
		//fila.contains(...);
		
		
	}

}
