package AbstractKlasse;

public class Strawberry extends Fruit{
	private double price = 0.50;
	public Strawberry(double price) {this.price = price;};
	

	public Strawberry() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return price ;
	}


	@Override
	public String toString() {
		return "Strawberry [price=" + price + "]";
	}


	@Override
	public void Boil() {
		// TODO Auto-generated method stub
		
	}

}
