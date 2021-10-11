import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Cola cola = new Cola(7);
		//Integer entradaTeclado;
		char continuar;

		// armo una cola de prioridades inicial
		cola.agregar(8);
		cola.agregar(3);
		cola.agregar(4);
		cola.agregar(9);
		cola.agregar(7);
		cola.agregar(1);
		
		System.out.println(cola.toString());

		/*
		 * cola.agregar(5); cola.agregar(3); cola.agregar(2); cola.agregar(6);
		 

		System.out.println(cola.toString());*/

		Scanner entradaEscaner = new Scanner(System.in); // Creación de un objeto Scanner

		/*while (!cola.estaLlena()) {
			System.out.print("Ingrese valor de la Cola de prioridades: ");
			entradaTeclado = entradaEscaner.nextInt();

			cola.agregar(entradaTeclado);

			System.out.println(cola.toString());
		}*/
		
		while (!cola.estaVacia()) {
			System.out.print("Sacar valor de la Cola de prioridades?(S/n) ");
			continuar =  entradaEscaner.next().charAt(0);
			if( continuar == 's') {
				cola.sacar();
			}
			System.out.println(cola.toString());
		}
		
		
		entradaEscaner.close();

	}

}
