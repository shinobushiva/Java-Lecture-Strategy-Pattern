package patterned;

public class HighLowTest {

	public static void main(String[] args) {
		HighLowGameMaster master = new HighLowGameMaster();

		randomStrategyTest(master);
		basicStrategyTest(master);

	}

	private static void basicStrategyTest(HighLowGameMaster master) {

		Player p = new Player();
		Strategy s1 = new BasicStrategy();
		p.strategy = s1;

		// ゲームを100回試行
		for (int i = 0; i < 10000; i++) {
			master.init();
			master.play(p);
		}

		System.out.println("Basic->" + p);

	}

	private static void randomStrategyTest(HighLowGameMaster master) {

		Player p = new Player();
		Strategy s1 = new RandomStrategy();
		p.strategy = s1;

		// ゲームを100回試行
		for (int i = 0; i < 10000; i++) {
			master.init();
			master.play(p);
		}

		System.out.println("Random->" + p);

	}

}
