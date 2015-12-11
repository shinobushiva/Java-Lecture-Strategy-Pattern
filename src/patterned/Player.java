package patterned;

public class Player {
	public int numWin;
	public int numLose;

	public Strategy strategy;

	@Override
	public String toString() {
		return "Win:" + numWin + ", Lose:" + numLose;
	}

	public boolean highLow(int num) {
		return strategy.highLow(num);
	}

}