package Main;

import BubbleTea.Cinamon;
import BubbleTea.Strawberry;
import AbstractKlasse.BubbleTeaIngredient;
import BubbleTea.Bubble;


public class MainV2 {

	public static void main(String[] args) {

		
	Strawberry strawberry = new Strawberry(0.50);
	Cinamon cinamon = new Cinamon(0.75);
	Bubble test = new Bubble(Bubble.Type.LIME);
	
    System.out.println(strawberry);
    System.out.println(cinamon);
    System.out.println(test);
   System.out.println(strawberry.getPrice());
   System.out.println(strawberry.getClass().getName());
   

	}

}
