package tutorial;

public class Elliptical extends Equipment{
	private int strideLength;
	
	public Elliptical(int id, String model, int strideLength) {
		super(id, model);
		this.strideLength = strideLength;
	}
	public int getStrideLength() {
		return strideLength;
	}
}
