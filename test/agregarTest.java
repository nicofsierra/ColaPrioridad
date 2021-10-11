import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class agregarTest {
	
	Cola cola;
	
	@Before
	public void setup() {
		cola = new Cola(8);
	}
	
	@After
	public void teardown() {
		cola = null;
	}
	
	@Test
	public void colaLLenaTest() {
		cola.agregar(9);
		cola.agregar(8);
		cola.agregar(7);
		cola.agregar(6);
		cola.agregar(5);
		cola.agregar(4);
		cola.agregar(3);
		// cola llena despues de agrear 7 elementos
		assertTrue(cola.estaLlena());
	}
	
	@Test
	public void agregarPrimeroTest() {
		cola.agregar(5);
		int [] vector = cola.getVector();
		// cola no vacia
		assertFalse(cola.estaVacia());
		// primer valor del vector == 5
		assertEquals(5,vector[1],0);	
	}
	
	@Test
	public void agregarUltimoMenorTest() {
		cola.agregar(9);
		cola.agregar(8);
		cola.agregar(7);
		cola.agregar(6);
		cola.agregar(5);
		cola.agregar(4);
		cola.agregar(3);
		int [] vector = cola.getVector();
		assertEquals(3,vector[1]);
	}
	
	@Test
	public void agregarUltimoMayorTest() {
		cola.agregar(8);
		cola.agregar(7);
		cola.agregar(6);
		cola.agregar(5);
		cola.agregar(4);
		cola.agregar(3);
		cola.agregar(9);
		int [] vector = cola.getVector();
		int item = cola.getItems();
		assertEquals(9,vector[item]);
	}
	
	@Test
	public void agregarMedioMenorTest() {
		
		
		
	}
	
	@Test
	public void agregarMedioMayorTest() {
		
		
		
	}

}
