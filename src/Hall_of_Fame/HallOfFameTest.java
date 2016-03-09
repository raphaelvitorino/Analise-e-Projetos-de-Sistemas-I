package Hall_of_Fame;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Test;

public class HallOfFameTest extends TestCase {

	@Test
	public void testEmptyHallOfFame(){
		HallOfFame hall = new HallOfFame();
		List<Player> players = new ArrayList<>();
		boolean jogou = !players.isEmpty();	
		assertEquals(true, jogou);
	}
	@Test
	public void testMoreThan10Players() {
		HallOfFame hall = new HallOfFame();
		List<Player> players = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			Player player = new Player("teste" + i, 1 + i);
			players.add(player);
		}
		players = hall.top10(players);
		players = hall.formatarLista(players);
		assertEquals(players.size(), 10);

	}

}
