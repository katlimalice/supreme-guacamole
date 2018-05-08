package pucrs.s2b.exemplo03;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest {

	@Test
	public void testFiveAndFiveGivesExame() {
		String expected = "Em exame";
		String actual = Medias.calcular(5.0, 5.0);	
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSevenAndSevenGivesAprovado() {
		String expected = "Aprovado";
		String actual = Medias.calcular(7.0, 7.0);	
		assertEquals(expected, actual);
	}
	
	@Test
	public void testTenAndFourGivesAprovado() {
		String expected = "Aprovado";
		String actual = Medias.calcular(10.0, 4.0);	
		assertEquals(expected, actual);
		
	}
		
		@Test
		public void testThreeAndThreeGivesReprovado() {
			String expected = "Reprovado";
			String actual = Medias.calcular(3.0, 3.0);	
			assertEquals(expected, actual);
	}
		@Test
		public void testThree99AndThree99GivesReprovado() {
			String expected = "Reprovado";
			String actual = Medias.calcular(3.99, 3.99);	
			assertEquals(expected, actual);
	}
		@Test
		public void testThree99AndFour01GivesExame() {
			String expected = "Em exame";
			String actual = Medias.calcular(3.99, 4.01);	
			assertEquals(expected, actual);
	}
		
		
		
}
