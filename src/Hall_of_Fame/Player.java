package Hall_of_Fame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Player implements Comparable<Player> {
	private String name;
	private int point;

	public Player(String name, int point) {
		this.name = name;
		this.point = point;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	@Override
	public int compareTo(Player otherPlayer) {
		if (this.point < otherPlayer.point) {
			return -1;
		} else if (this.point > otherPlayer.point) {
			return 1;
		} else {
			return 0;
		}
	}

}
