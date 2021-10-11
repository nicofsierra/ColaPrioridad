import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class sacarTest {

	Cola cola;

	@Before
	public void setup() {
		cola = new Cola(8);
	}

	@After
	public void teardown() {
		cola = null;
	}

	@Test//(expected = NullPointerException.class)
	public void testSacarColaVacia() {
		
		
		assertEquals(0,cola.sacar());
		
	}
	
	@Test
	public void testSacarPrimero() {
		cola.agregar(5);
		assertEquals(5,cola.sacar());
	}

}
