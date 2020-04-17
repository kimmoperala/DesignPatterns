package adapter;

public class Queen implements Conversationalist {

	@Override
	public void greet() {
		System.out.println("Good afternoon. How do you do?");
	}
	@Override
	public void neckBow() {
		System.out.println("Queen does not bow in front of anyone!");
	}

}
