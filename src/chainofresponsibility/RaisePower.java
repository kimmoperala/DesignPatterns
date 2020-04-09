package chainofresponsibility;

public abstract class RaisePower {
	private RaisePower successor;
	
	public void setSuccessor (RaisePower successor) {
		this.successor = successor;
	}
	
	public void processRequest(RaiseRequest request) {
		if (successor != null) {
			successor.processRequest(request);
		}
	}
}
