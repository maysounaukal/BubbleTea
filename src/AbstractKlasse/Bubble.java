package AbstractKlasse;

public class Bubble extends BubbleTeaIngredient{
private Type taste;
private double price = 0.50;

public enum Type{SOURAPLLE,SWEETAPPLE,LIME,STRAWBERRY,BLUEBERRY;}

public Bubble(Type souraplle) {
	this.taste = souraplle;
}

public Bubble() {
	// TODO Auto-generated constructor stub
}

@Override
public double getPrice() {
	// TODO Auto-generated method stub
	return price;
}

@Override
public String toString() {
	return "Bubble [taste=" + taste + ", price=" + price + "]";
}

}
