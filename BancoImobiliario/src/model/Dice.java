package model;

import java.util.Random;

public class Dice {

    public int lancaDado() {
		Random random = new Random();
		int value = random.nextInt(6) + 1;
		return value;
	}
}
