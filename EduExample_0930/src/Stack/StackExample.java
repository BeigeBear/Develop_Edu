package Stack;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<>();
		
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(20));
		coinBox.push(new Coin(300));
		coinBox.push(new Coin(40));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(60));
		coinBox.push(new Coin(700));

		while(!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
					}
	}

}
