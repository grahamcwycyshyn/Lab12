import java.util.ArrayList;
import java.util.Scanner;

public class CarApp2 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int car;

		ArrayList<Car> cars = new ArrayList<>();

		cars.add(new UsedCar("Honda", "Civic", 2009, 4999.99, 60000));
		cars.add(new UsedCar("Ford", "Flex", 2013, 9999.99, 30000));
		cars.add(new UsedCar("Chevy", "Malibu", 2011, 7499.99, 100000));
		cars.add(new UsedCar("Jeep", "Patriot", 2005, 3999.99, 40000));
		cars.add(new Car("Pontiac", "Aztec", 2019, 49999.99));
		cars.add(new Car("Ferrari", "Daytona", 2019, 1999.99));
		cars.add(new Car("Lamborghini", "Aventador", 2020, 5.00));
		cars.add(new Car("Go", "Cart", 2019, 999999.99));


		do {
			System.out.printf("%-20s %-20s %-20s %-20s\n", "   Make", "Model", "Year", "Price");
			System.out.println();
			for(int i = 0; i <= cars.size(); i++) {
				if(i < cars.size()) {
					System.out.printf("%-20s %-20s %-20s %-20s\n", (i + 1) + ". " + 
					cars.get(i).getMake(), cars.get(i).getModel(), 
					cars.get(i).getYear(), "$" + cars.get(i).getPrice());
				} else {
					System.out.println((i + 1) + ". Quit");
				}
			}
			
			System.out.println("Which car would you like to buy?");
			
			car =  scan.nextInt();
			
			if(car > 0 && car <= cars.size()) {
				System.out.printf("%-20s %-20s %-20s %-20s\n", car + ". " + 
				cars.get(car - 1).getMake(), cars.get(car - 1).getModel(), 
				cars.get(car - 1).getYear(), "$" + cars.get(car - 1).getPrice());
				System.out.println("Would you like to buy this car? (y/n)");
				char choice = scan.next().charAt(0);
				if(choice == 'y' || choice == 'Y') {
					cars.remove(car - 1);
					System.out.println("Excellent choice!");
				}
			} else if(car != cars.size() + 1){
				System.out.println("Please enter a valid option");
			}

		} while(car != (cars.size() + 1));
		scan.close();
	}
}
