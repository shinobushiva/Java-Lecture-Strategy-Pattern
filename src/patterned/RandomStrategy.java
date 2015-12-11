package patterned;

public class RandomStrategy implements Strategy {

	@Override
	public boolean highLow(int number) {

		return Math.random() > 0.5f;
	}

}
