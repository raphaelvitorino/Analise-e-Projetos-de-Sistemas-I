package Jogo_Dados_TDD;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Test;

public class DiceTest extends TestCase {

	@Test
	public void testRoll() {
		Dice dice = new Dice();
		int result = dice.roll(dice);
		
		if(result <= 6 && result >= 1) {
			assertTrue(true);
		}
		else {
			assertTrue(false);
		}
	}

}
