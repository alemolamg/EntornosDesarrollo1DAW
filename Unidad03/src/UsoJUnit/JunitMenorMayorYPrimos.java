package UsoJUnit;

import UsoJUnit.MenorMayor_Primo;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JunitMenorMayorYPrimos {

	@Test
	void testMayorMenor() {
//		fail("Not yet implemented");
		int vectorEspe[] = {7,11,13};
		
		assertArrayEquals(vectorEspe, MenorMayor_Primo.menorMayor(13,11,7));
	}
	
	@Test
	void testPrimos() {
		int numero = 15;
		int vectorEspe[] = {7,11,13};
		int vector[] = MenorMayor_Primo.primos(numero);
		assertEquals(vectorEspe, vector);
	}

}
