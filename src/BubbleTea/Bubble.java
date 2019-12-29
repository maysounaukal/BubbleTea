package BubbleTea;

 public class Bubble extends BubbleTeaIngredient{
public Bubble(Type lime) {
		// TODO Auto-generated constructor stub
	this.taste = lime;
	}


private Type taste;


 public enum Type {SOURAPLLE,SWEETAPPLE,LIME,STRAWBERRY,BLUEBERRY;}


@Override
public String toString() {
	return "Bubble [taste=" + taste + "]";
}
 
}
