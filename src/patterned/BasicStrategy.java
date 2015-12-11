package patterned;

public class BasicStrategy implements Strategy {

	@Override
	public boolean highLow(int number) {
		if (number > 6) {
			return false;
		}
		if (number < 4) {
			return true;
		}
		return Math.random() > 0.5f;
	}

}
