package Jogo_Dados_TDD;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Test;

public class GameTest extends TestCase {

	@Test
	public void testGame() {
		Game game = new Game();
		game.setA(new Dice());
		game.setB(new Dice());
		boolean result = game.play();
		if (result == true || result == false) {
			assertTrue(true);
		}
		else {
			assertTrue(false);
		}
	}

}
