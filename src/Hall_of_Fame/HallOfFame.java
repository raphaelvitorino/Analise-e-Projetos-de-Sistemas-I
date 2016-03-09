package Hall_of_Fame;

import java.util.Collections;
import java.util.List;

public class HallOfFame {
	
	public List<Player> top10(List<Player> players) {
		if (players.isEmpty()) {
			System.out.println("Ninguém jogou ainda");
		}
		else {
			Collections.sort(players);
		}
		return players;
		
	}
	public List<Player> formatarLista(List<Player> players) {
		int tamanhoLista = players.size();
		for(int i = 9; i < tamanhoLista; i++) {
			players.remove(i);
			i++;
		}
		return players;
	}
}
