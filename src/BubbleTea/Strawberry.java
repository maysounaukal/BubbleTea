package BubbleTea;

public class Strawberry extends Fruit{

	public Strawberry(double price) {
		super(price);
	}

	@Override
	public String toString() {
		return "Strawberry [getPrice()=" + getPrice() +"]";
	}
	
}
