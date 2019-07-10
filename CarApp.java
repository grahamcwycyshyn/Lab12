import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("How many cars are you entering?");
		int size = input.nextInt();
		ArrayList<Car> cars = new ArrayList<>();
		String make;
		String model;
		int year;
		Double price;

		for (int i = 0; i < size; i++) {
			System.out.println("Enter Car #" + (i + 1) + " Make:");
			make = input.next();
			System.out.println("Enter Car #" + (i + 1) + " Model:");
			model = input.next();
			System.out.println("Enter Car #" + (i + 1) + " Year:");
			year = input.nextInt();
			System.out.println("Enter Car #" + (i + 1) + " Price:");
			price = input.nextDouble();
			cars.add(new Car(make, model, year, price));
		}

		for (int i = 0; i < size; i++) {
			System.out.printf("%-20s %-20s %-20s %-20s\n", (i + 1) + ". " + 
			cars.get(i).getMake(), cars.get(i).getModel(), cars.get(i).getYear(), 
			"$" + cars.get(i).getPrice());
		}

		input.close();
	}
}