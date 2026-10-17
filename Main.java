package tutorial;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		RentalSystem rentalSystem = new RentalSystem();
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("Wybierz opcję: ");
			System.out.println("\n--- WYPOŻYCZALNIA SPRZĘTU ---");
			System.out.println("1. Dodaj sprzęt");
			System.out.println("2. Dodaj klienta");
			System.out.println("3. Wyświetl dostępny sprzęt");
			System.out.println("4. Wypożycz sprzęt");
			System.out.println("5. Zwróć sprzęt");
			System.out.println("0. Zakończ");
			
			choice = sc.nextInt();
			
			switch (choice) {

			case 1:
			    System.out.println("Wybierz typ sprzętu:");
			    System.out.println("1. Bieżnia");
			    System.out.println("2. Rower treningowy");
			    System.out.println("3. Orbitrek");
			    int equipmentType = sc.nextInt();

			    System.out.println("Podaj id sprzętu");
			    int equipmentId = sc.nextInt();

			    System.out.println("Podaj model");
			    String model = sc.next();

			    switch (equipmentType) {
			        case 1:
			            System.out.println("Podaj maksymalną prędkość");
			            int maxSpeed = sc.nextInt();
			            rentalSystem.addEquipment(
			                    new Treadmill(equipmentId, model, maxSpeed)
			            );
			            break;

			        case 2:
			            System.out.println("Podaj liczbę poziomów oporu");
			            int resistanceLevels = sc.nextInt();
			            rentalSystem.addEquipment(
			                    new ExerciseBike(equipmentId, model, resistanceLevels)
			            );
			            break;

			        case 3:
			            System.out.println("Podaj długość kroku");
			            int strideLength = sc.nextInt();
			            rentalSystem.addEquipment(
			                    new Elliptical(equipmentId, model, strideLength)
			            );
			            break;

			        default:
			            System.out.println("Nieprawidłowy typ sprzętu");
			    }
			    break;
			case 2:
				System.out.println("Podaj id klienta");
				int clientId = sc.nextInt();
				sc.nextLine();
				System.out.println("Podaj imię klienta");
				String clientName = sc.nextLine();
				
				Client client = new Client (clientName, clientId);
				rentalSystem.addClient(client);
				break;			
				
			case 3:
				rentalSystem.showAvailableEquipment();
				break;
			case 4:
				System.out.println("Podaj id sprzętu");
				int rentEquipmentId = sc.nextInt();
				System.out.println("Podaj id klienta: ");
				int rentClientId = sc.nextInt();
				
			    try {
			        rentalSystem.rentEquipment(rentEquipmentId, rentClientId);
			        System.out.println("Sprzęt został wypożyczony");
			    } catch (InvalidException | EquipmentNotAvailableException e) {
			        System.out.println("Błąd: " + e.getMessage());
			    }
			    break;
			    
			case 5:
			    System.out.println("Podaj id zwracanego sprzętu");
			    int returnEquipmentId = sc.nextInt();

			    try {
			        rentalSystem.returnEquipment(returnEquipmentId);
			        System.out.println("Sprzęt został zwrócony");
			    } catch (InvalidException e) {
			        System.out.println("Błąd: " + e.getMessage());
			    }
			    break;
			case 0:
				System.out.println("Koniec programu");
				break;
			default:
				System.out.println("Nieprawidłowa opcja");
				
			}
			
		}while (choice != 0);
		
		
		
		
		
	}

		
}


