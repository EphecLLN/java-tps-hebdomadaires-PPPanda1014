package tp4;
import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class CalculatriceTest {

	@Test
	public void testCarre() {
		Calculatrice calc = new Calculatrice();
		calc.carre();
		assertEquals(0, calc.valeurCourante, 0.0000001);
	}

}
