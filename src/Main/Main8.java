package Main;

import java.util.ArrayList;
import java.util.List;

import AbstractKlasse.Apple;
import AbstractKlasse.BabbleTea;
import AbstractKlasse.Bubble;
import AbstractKlasse.BubbleTeaIngredient;
import AbstractKlasse.Cinamon;
import AbstractKlasse.Orange;
import AbstractKlasse.Strawberry;

public class Main8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<BubbleTeaIngredient> list = new ArrayList<>();
		
		
		Apple apple = new Apple();
		Bubble bubble = new Bubble(Bubble.Type.STRAWBERRY);
		list.add(bubble);
		list.add(apple);
		
		
		BabbleTea tea1 = new BabbleTea(list);
		BabbleTea tea2 = new BabbleTea();
		tea2.addIngredient(new Orange());

		tea2.addIngredient(new Cinamon());

		tea2.addIngredient(new Bubble(Bubble.Type.LIME));
		BabbleTea tea3 = new BabbleTea();
		tea3.addIngredient(new Strawberry());
		tea3.addIngredient(list);
	
		System.out.println(tea1.toString());

		System.out.println(tea2.toString());
		System.out.println(tea3.toString());
		
		
		

	}

}
