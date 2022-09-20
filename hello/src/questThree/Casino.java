package questThree;

import java.util.Stack;

public class Casino {

	public static void main(String[] args) {
		Stack<Card> stack = new Stack<Card>();
		stack.push(new Card("Ace of Spades"));
		stack.push(new Card("King of Diamonds"));
		stack.push(new Card("Queen of Hearts"));
		
		System.out.println(stack.pop().value);
		System.out.println(stack.peek().value);
		System.out.println(stack.pop().value);
		System.out.println(stack.peek().value);
	}

}

class Card {
	String value;
	public Card(String value) {
		this.value = value;
	}
}