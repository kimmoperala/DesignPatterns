package chainofresponsibility;

public class ExecutivePower extends RaisePower {
	private final double ACCEPTABLE = 100.0;
	
	public void processRequest(RaiseRequest request) {
		if (request.getPercentage() < ACCEPTABLE) {
			System.out.println("Chief executive officer approves " + request.getPercentage() + " percent salary raise");
		}
		else {
			System.out.println("CEO ei voi tuplata palkkaasi");
		}
	}
	
}
