package AbstractKlasse;

public class Apple extends Fruit{
	private double price = 0.75;

	public Apple(double price) {
		this.price = price;
	}

	public Apple() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	@Override
	public String toString() {
		return "Apple [price=" + price + "]";
	}

	@Override
	public void Boil() {
		// TODO Auto-generated method stub
		
	}


}
