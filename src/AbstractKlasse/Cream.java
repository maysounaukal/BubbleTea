package AbstractKlasse;

public class Cream extends BubbleTeaIngredient{
	private double price = 1;

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	@Override
	public String toString() {
		return "Cream [price=" + price + "]";
	}
	

}
