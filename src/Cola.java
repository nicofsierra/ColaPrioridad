import java.util.Arrays;

public class Cola extends Monticulo {

	private int[] vector;
	private int tope;
	private int items;

	public Cola(int tope) {
		this.tope = tope;
		vector = new int[tope];
		items = 0;
	}

	@Override
	public void agregar(Integer elemento) {

		if (!estaLlena()) {
			// items = items++;
			vector[++items] = elemento;
			if (!estaVacia()) {
				int padre = 0;
				for (int i = items; i > 0; i--) {
					padre = (i / 2) - ((i / 1) % 1);
					if (vector[i] < vector[padre]) {
						int aux = vector[padre];
						vector[padre] = vector[i];
						vector[i] = aux;
					}
				}
			}
		} else {
			try {
				throw new Exception("La cola esta llena!");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public int sacar() {
		int out = 0;
		int intercambio = 0;
		int i = 1;
		
		if (!estaVacia()) {
			out = vector[1];

			vector[1] = vector[items];

			vector[items] = 0;

			items--;

			while (intercambio == 0) {

				int hijo_i = (2 * i);
				int hijo_d = (2 * i) + 1;

				if (tieneHijoI(i) || tieneHijoD(i)) {

					if (vector[hijo_i] < vector[hijo_d]) {
						if (vector[i] > vector[hijo_i]) {
							int aux = vector[hijo_i];
							vector[hijo_i] = vector[i];
							vector[i] = aux;
						} else {
							intercambio = 1;
						}
					}
					if (vector[i] >= vector[hijo_d]) {
						int aux = vector[hijo_d];
						vector[hijo_d] = vector[i];
						vector[i] = aux;
					} else {
						intercambio = 1;
					}
					
				} else intercambio = 1;
				
				i++;

			}

		} else

		{
			try {
				throw new Exception("La cola no tiene elementos!");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return out;
	}

	public boolean estaLlena() {
		return items == tope - 1;
	}

	public boolean estaVacia() {
		return items == 0;
	}

	public int[] getVector() {
		return vector;
	}

	public int getItems() {
		return items;
	}

	public boolean tieneHijoD(int pos) {
		return 2 * pos < items;
	}

	public boolean tieneHijoI(int pos) {
		return 2 * pos + 1 < items;
	}

	@Override
	public String toString() {
		return "Cola [vector=" + Arrays.toString(vector) + ", tope=" + tope + ", items=" + items + "]";
	}

}
