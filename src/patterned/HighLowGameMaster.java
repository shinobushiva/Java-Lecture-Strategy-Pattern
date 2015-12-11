package patterned;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HighLowGameMaster {
	private List<Integer> numList;

	public HighLowGameMaster() {
		init();
	}

	public void init() {

		Integer[] numbers = new Integer[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		numList = Arrays.asList(numbers);
		Collections.shuffle(numList);
	}

	public void play(Player p) {
		int previousNum = -1;

		for (Integer num : numList) {
			// ひとつ目の数字は予想できないので格納して次へ
			if (previousNum == -1) {
				previousNum = num;
				continue;
			}

			boolean hl = p.highLow(previousNum);
			if ((hl && num > previousNum) || (!hl && num < previousNum)) {
				// プレイヤーの勝ち
				p.numWin++;
			} else {
				// プレイヤーの負け
				p.numLose++;
			}
		}
	}

	public static void main(String[] args) {

	}
}
