package tutorial;

public class Client {
	private int id;
	private String name;
	
	public Client(String name, int id){
		this.name = name;
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
    @Override
    public String toString() {
        return "Customer ID: " + id + ", name: " + name;
    }

}
