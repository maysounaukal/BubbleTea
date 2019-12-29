package AbstractKlasse;

public class Orange extends Fruit{
	private double price = 0.50;

	public Orange(double price) {
		this.price = price;
	}

	public Orange() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	@Override
	public String toString() {
		return "Orange [price=" + price + "]";
	}

	@Override
	public void Boil() {
		// TODO Auto-generated method stub
		
	}
	

}
