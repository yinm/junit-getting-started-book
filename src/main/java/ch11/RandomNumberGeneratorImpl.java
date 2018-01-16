package ch11;

import java.util.Random;

public class RandomNumberGeneratorImpl implements RandomNumberGenerator {
	private final Random rand = new Random();

	@Override
	public int nextInt() {
		return rand.nextInt();
	}
}
