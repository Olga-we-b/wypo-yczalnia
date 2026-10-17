package tutorial;

import java.util.ArrayList;

public class RentalSystem {
	
	private ArrayList<Equipment> equipmentList = new ArrayList<Equipment>();
	private ArrayList<Client> clientList = new ArrayList<Client>();
	
	public void addEquipment(Equipment equipment) {
		equipmentList.add(equipment);
	}
	
	public void addClient(Client client) {
		clientList.add(client);
	}
	
	public void showAvailableEquipment() {
		for (Equipment equipment:equipmentList) {
			if(equipment.isAvailable()) {
				System.out.println(equipment);
			}
		}
	}
	
	public Equipment findEquipmentById(int id) throws InvalidException {
		
		for (Equipment equipment:equipmentList) {
			if (equipment.getId() == id) {
				return equipment;
			}
			
		}
		throw new InvalidException("Equipment with this ID was not found");	
		
	}
	
	public Client findClientById(int id) throws InvalidException {
		for (Client client:clientList) {
			if (client.getId() == id) {
				return client;
			}
		}
		
		throw new InvalidException("Client with this ID was not found");
	}

	public void rentEquipment(int equipmentId, int clientId) throws InvalidException, EquipmentNotAvailableException {
		Equipment equipment = findEquipmentById(equipmentId);
		Client client = findClientById(clientId);
		equipment.rent(client);
		
	}
	
	public void returnEquipment(int equipmentId) throws InvalidException {
		
		Equipment equipment = findEquipmentById(equipmentId);
		equipment.returnEquipment();
		
	}
	
	
	
}
