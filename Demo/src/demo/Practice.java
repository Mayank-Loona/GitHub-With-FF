package demo;

class Engine {
	// states
	String type;
	int cc;

	Engine() {
	}

	Engine(String type, int cc) {
		this.type = type;
		this.cc = cc;
	}

	public void displayOfEngine() {
		System.out.println("Type : " + type);
		System.out.println("CC : " + cc);
	}
}

class Car  {
	String brand;
	double price;
	Engine e = new Engine("Petrol", 500);

	Car(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}

	public void displayOfCar() {
		System.out.println("Type : " + brand);
		System.out.println("CC : " + price);

	}
}

public class Practice {

	public static void main(String[] args) {
		Car c = new Car("Honda", 10000);
		c.displayOfCar();
		c.e.displayOfEngine();

	}
}
