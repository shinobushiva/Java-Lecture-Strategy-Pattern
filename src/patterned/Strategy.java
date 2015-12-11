package patterned;

public interface Strategy {
	/**
	 * 次の数字がHighと予想する場合 - true, Lowと予想する場合 - false
	 * 
	 * @param number
	 *            前回の数字
	 * @return
	 */
	public boolean highLow(int number);

}
