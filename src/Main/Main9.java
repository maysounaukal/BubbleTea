package Main;

import java.util.ArrayList;
import java.util.List;

import AbstractKlasse.BabbleTea;
import AbstractKlasse.Bubble;
import AbstractKlasse.BubbleTeaBar;
import AbstractKlasse.BubbleTeaIngredient;
import AbstractKlasse.BubbleTeaShortageException;
import AbstractKlasse.Cream;
import AbstractKlasse.Ginger;
import AbstractKlasse.Orange;
import AbstractKlasse.Strawberry;
import Associatie.Ticket;


public class Main9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		List<BubbleTeaIngredient> list = new ArrayList<>();
		
   BubbleTeaBar bar = new BubbleTeaBar();

 
   Orange orange1 = new Orange();
   Bubble babble = new Bubble(Bubble.Type.LIME);
 
   list.add(orange1);
   list.add(babble);
 BabbleTea tea1;
try {
	tea1 = bar.acceptOrder(list);
	System.out.println(tea1.toString());

} catch (BubbleTeaShortageException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	System.out.println("er is geen bubble");
}catch (NullPointerException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	System.out.println("er is geen bubble");
}
//om te zetten
  
   BabbleTea tea2 = new BabbleTea();
   tea2.addIngredient(new Ginger());
   tea2.addIngredient(new Bubble(Bubble.Type.STRAWBERRY));
   tea2.addIngredient(new Cream());
   
   //Ginger ginger = new Ginger();
 //  Bubble bubble1 = new Bubble(Bubble.Type.STRAWBERRY);
 //  Cream cream1 = new Cream();
 //  list.add(ginger);
  // list.add(bubble1);
  // list.add(cream1);
   BabbleTea tea3 = new BabbleTea();
   tea3.addIngredient(new Strawberry());
   tea3.addIngredient(new Bubble(Bubble.Type.STRAWBERRY));
  // Strawberry strawberry = new Strawberry();
  // Bubble bubble2 = new Bubble(Bubble.Type.STRAWBERRY);
 // list.add(strawberry);
 // list.add(bubble2);

  
   BabbleTea tea4 = new BabbleTea();
   tea4.addIngredient(new Strawberry());
   tea4.addIngredient(list);
   
 // System.out.println(tea1.toString());
   System.out.println(tea2.toString());
   System.out.println(tea3.toString());
   System.out.println(tea4.toString());
   
   
   
   
	}

}
