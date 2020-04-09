package chainofresponsibility;

public class ForemanPower extends RaisePower {
	private final double ACCEPTABLE = 2.0;

	public void processRequest(RaiseRequest request) {
		if (request.getPercentage() < ACCEPTABLE) {
			System.out.println("Foreman approves " + request.getPercentage() + " percent salary raise");
		}
		else {
			super.processRequest(request);
		}
	}
}
