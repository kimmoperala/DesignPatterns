package adapter;

public class ReceptionEvent {

	public static void main(String[] args) {
		System.out.println("Matti on saapunut tapaamaan kuningatarta. James auttaa etiketin kanssa.\nEnsin kumarrus ja sitten tervehdys.");
		Finn matti = new Finn();
		Conversationalist elizabethII = new Queen();
		Conversationalist james = new RoyalInterpreter(matti);
		elizabethII.neckBow();
		james.neckBow();
		james.greet();
		elizabethII.greet();
		
	}

}
