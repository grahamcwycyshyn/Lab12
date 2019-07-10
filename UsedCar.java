
public class UsedCar extends Car {

	private double mileage;

	public UsedCar(String make, String model, int year, double price, double mileage) {
		super(make, model, year, price);
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return "UsedCar [[make=" + make + ", " + ", model=" + model + ", year=" + year + ", price=" + price + "mileage="
				+ mileage + "]";
	}

}
