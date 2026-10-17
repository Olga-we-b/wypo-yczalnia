package tutorial;

public class Treadmill extends Equipment{
	
	private int maxSpeed;
	public Treadmill(int id, String model, int maxSpeed) {
		super(id, model);
		this.maxSpeed = maxSpeed;
	}
	
	public int maxSpeed() {
		return maxSpeed;
	}

}
