package chainofresponsibility;

public class DepartmentManagerPower extends RaisePower {
	private final double ACCEPTABLE = 5.0;
	
	public void processRequest(RaiseRequest request) {
		if (request.getPercentage() < ACCEPTABLE) {
			System.out.println("Department manager approves " + request.getPercentage() + " percent salary raise");
		}
		else {
			super.processRequest(request);
		}
	}
}
