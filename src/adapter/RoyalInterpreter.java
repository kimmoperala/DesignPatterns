package adapter;

public class RoyalInterpreter implements Conversationalist {

	Finn finn;
	
	public RoyalInterpreter(Finn finn) {
		this.finn = finn;
	}
	@Override
	public void greet() {
		finn.morjestaMummoa();
	}
	@Override
	public void neckBow() {
		finn.katsoOnkoKengatLikaiset();
	}

}
