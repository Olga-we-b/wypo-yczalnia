package tutorial;

public class ExerciseBike extends Equipment{
	private int resistanceLevels;
	
	public ExerciseBike(int id, String model, int resistanceLevels){
		super(id, model);
		this.resistanceLevels = resistanceLevels;
		
	}
	
	public int getResistanceLevels() {
		return resistanceLevels;
	}

}
