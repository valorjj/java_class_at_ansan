package Day15;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Day15_5 {

	public static void main(String[] args) {

		Stack<Coin> coinbox = new Stack<>();

		coinbox.push(new Coin(100));
		coinbox.push(new Coin(200));
		coinbox.push(new Coin(300));
		coinbox.push(new Coin(400));

		System.out.println(coinbox);

		System.out.println(coinbox.pop());

		while (!coinbox.isEmpty()) {
			System.out.println(coinbox.pop());
		}

		Queue<Coin> coinbox2 = new LinkedList<>();

		coinbox2.offer(new Coin(50));
		coinbox2.offer(new Coin(100));
		coinbox2.offer(new Coin(500));
		coinbox2.offer(new Coin(500));
		coinbox2.offer(new Coin(500));

		System.out.println(coinbox2);
		System.out.println(coinbox2.poll());

	}

}
