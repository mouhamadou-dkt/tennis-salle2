
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

	@Test
	public void creerPartie_ReturnPartieCree() {
		// Given 
		
		// When
		String result =  Main.creationPartie("Partie cr��e");
		// Then 
		assertEquals("Partie cr��e", result);
	}
}
