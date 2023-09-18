/*README SECTION:
 * The program determines the vehicle insurance premium according to the vehicle type. 
 * Nested switch-case statements are employed to handle the further classification of vehicles.
 * 
 * VEHICLE INSURANCE
 * Premium depends on vehicle type
 * Car. truck, bus, motorcycle
 * 3 types of motorcycle: Low, medium, high engine power
 * Use nested switch - case approach
 * 
 * While developing this project, 
 * I watched the videos of the "Begin Code Fast" YouTube channel.
 * Video Link 
 * https://www.youtube.com/watch?v=Bqdx-GCwudI&list=PLtQo0sxRN7JKKla3_GAF05dySjyy3nINa
 */
package VehicleInsurancePackage;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		int premium = 0, vehicleType, motorcycleType;
		System.out.println("Enter your vehicle type as integer");
		System.out.println("Types: Car = 1, Truck = 2, Bus = 3, Motorcycle = 4");
		Scanner keyboardScanner = new Scanner(System.in);
		vehicleType = keyboardScanner.nextInt();
		
		switch (vehicleType) {
		case 1: {
			premium = 200;
			break;
		}
		case 2: {
			premium = 300;
			break;
		}
		case 3: {
			premium = 400;
			break;
		}
		case 4: {
			System.out.println("Enter your motorcycle type as integer:");
			System.out.println("Low Power = 1, Medium Power = 2, High Power = 3");
			motorcycleType = keyboardScanner.nextInt();
			switch (motorcycleType) {
			case 1: {
				premium = 300;
				break;
			}
			case 2: {
				premium = 400;
				break;
			}
			case 3: {
				premium = 500;
				break;
			}
			default:
				System.out.println("Unknown motorcycle type");
			}
			
			break;//end of the first swtich's case 4
		}
		default:
			System.out.println("Unknown vehicle type");
		}
		
		keyboardScanner.close();
		System.out.println("The premium is: " + premium);
		
	}//end of the main method

}//end of the Driver Class
