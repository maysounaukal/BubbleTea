package AbstractKlasse;

import java.text.Collator;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BabbleTea {
private List<BubbleTeaIngredient> ingredients = new ArrayList<>();
public BabbleTea() {};
public BabbleTea(List<BubbleTeaIngredient> ingredients) {
	this.ingredients = ingredients;
}
public BabbleTea(BubbleTeaIngredient[] bubbleTeaIngredients) {
	//this.ingredients = Stream.of(bubbleTeaIngredients).collect(Collectors.toList());
	this.ingredients = Stream.of(bubbleTeaIngredients).collect(Collectors.toCollection(ArrayList::new));
	//als wij de elementen van Arrays in ArrayList willen toevoegen 
}

public void addIngredient(BubbleTeaIngredient ingrs) {
	this.ingredients.add(ingrs);
}

public void addIngredient(List<BubbleTeaIngredient> ingredien) {
	ingredients.addAll(ingredien);//omdat alle elementen van Array en ArrayList hier worden toegevoegd
}
public List<BubbleTeaIngredient> getIngredients() {
	return ingredients;
}
public void setIngredients(List<BubbleTeaIngredient> ingredients) {
	this.ingredients = ingredients;
}

public void drink() {
	System.out.println("drink BabbleTea with" + "  " + ingredients + " " + "Ingredients");
	ingredients.clear();
}
@Override
public String toString() {
	return "BabbleTea [ingredients=" + ingredients + "]";
}



}
