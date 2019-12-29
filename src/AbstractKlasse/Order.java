package AbstractKlasse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import AbstractKlasse.Bubble.Type;

public class Order{
private static int OrderNo = 0;
private List<BubbleTeaIngredient> ingredients = new ArrayList<>();
{
	OrderNo++;
}

public Order(List<BubbleTeaIngredient> ingredients) {
	this.ingredients = ingredients;
	
}

public Order() {
	// TODO Auto-generated constructor stub
}


public void aadListBubbleTeaIngredients(BubbleTeaIngredient ing) {
	ingredients.add(ing);
	
}

public List<BubbleTeaIngredient> getIngredients() {
	return ingredients;
}

public void setIngredients(List<BubbleTeaIngredient> ingredients) {
	this.ingredients = ingredients;
}









}
