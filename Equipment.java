package tutorial;

public class Equipment {
	private int id;
	private String model;
	private boolean available = true;
	private Client rentBy;
	
	public Equipment(int id, String model){
		this.id = id;
		this.model = model;
		
		}
	public void rent(Client rentBy) throws EquipmentNotAvailableException {
		if (available) {
			available = false;
			this.rentBy = rentBy;
			
		} else {
			throw new EquipmentNotAvailableException("The item is not available") ;
		}
		
	}
	
	public void returnEquipment() {
	    available = true;
	    rentBy = null;
	}
	
	public int getId() {
		return id;
	}
	
	public boolean isAvailable() {
		return available;
	}
	
	public String getModel() {
		return model;
	}
	@Override
	
	public String toString() {
		return "Equipment Id: " + id +" model: " + model + " availbility: " +  available;
	}
}
