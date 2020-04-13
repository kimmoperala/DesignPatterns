package proxy;

public class RealImage implements Image {
	private final String filename;

	public RealImage(String filename) {
		this.filename = filename;
		loadImageFromDisk();
	}
	public void loadImageFromDisk() {
        System.out.println("Loading   " + filename);
	}
	
	@Override
	public void displayImage() {
        System.out.println("Displaying " + filename);
	}

	@Override
	public void showData() {
	}

}
