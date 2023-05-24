import java.util.Scanner;
// Class
class Car {

	private String brand;
	private String model;
	private int year;

	public Car(String brand, String model, int year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setYear(int year ) {
		this.year = year;
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}

	public void displayInfo() {
		System.out.println("Brand: " + brand + "\t\t| Model: " + model + "\t\t| Year: " + year );
	}
}


public  class Task2 {
	public static void main (String[] args) {

		Car car1 = new Car("BMW", "M3     ", 2022);
		Car car2 = new Car("Ford", "Mustang", 2022);

		Scanner in = new Scanner(System.in);

		Car car3 = new Car("Audi", "A3   ", 2021);

		System.out.println("\nAvailable Model of Audi is " + car3.getModel());

		System.out.println("\nEnter the new model of Audi.");
		String model = in.nextLine();
		car3.setModel(model);

		System.out.println("\nThe details of cars are.");
		System.out.println("Car Brand \t\t| Car Model \t\t\t| Year");
		car1.displayInfo();
		car2.displayInfo();
		car3.displayInfo();

		System.out.println("\nI want to Buy " + car1.getBrand() + " model " + car1.getModel());
	}
}