package AbstractKlasse;

public enum MenuCard {CreamyGreen(new BubbleTeaIngredient[] {new Apple(), new Bubble(Bubble.Type.SOURAPLLE), new Cream()}),
	RedDream(new BubbleTeaIngredient[] { new Strawberry(), new Bubble(Bubble.Type.STRAWBERRY)}),
	GingerSpice(new BubbleTeaIngredient[] { new Ginger(), new Bubble(Bubble.Type.LIME)});
	private BubbleTeaIngredient[] ingredients;
   MenuCard(BubbleTeaIngredient[] ingredients) {
		this.ingredients = ingredients;
	}
public void setIngredients(BubbleTeaIngredient[] ingredients) {
	this.ingredients = ingredients;
}
public BubbleTeaIngredient[] getIngredients() {
	// TODO Auto-generated method stub
	return ingredients;
}

	
}
