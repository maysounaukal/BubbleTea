package Main;

import java.util.ArrayList;
import java.util.List;

import AbstractKlasse.Apple;
import AbstractKlasse.BabbleTea;
import AbstractKlasse.Bubble;
import AbstractKlasse.BubbleTeaBar;
import AbstractKlasse.BubbleTeaIngredient;
import AbstractKlasse.BubbleTeaShortageException;
import AbstractKlasse.Cinamon;
import AbstractKlasse.Cream;
import AbstractKlasse.Ginger;
import AbstractKlasse.Orange;
import AbstractKlasse.Strawberry;

public class Main10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<BubbleTeaIngredient> list = new ArrayList<>();
       BubbleTeaBar bar = new BubbleTeaBar();
      
	Orange orange = new Orange();
	   Bubble bubble1 = new Bubble(Bubble.Type.LIME);
	   list.add(orange);
	   list.add(bubble1);
   
	BabbleTea tea1 = null;
	try {
		tea1 = bar.acceptOrder(list);
		System.out.println(tea1.toString());
	
	} catch (BubbleTeaShortageException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("er is geen bubble");
	}catch(NullPointerException e1) {
		System.out.println("er is geen bubble");
	}
	
   
	BabbleTea tea2 = new BabbleTea();
    tea2.addIngredient(new Ginger());
      tea2.addIngredient(new Cream());
    
      BabbleTea tea3 = new BabbleTea();
      tea3.addIngredient(new Strawberry());
      tea3.addIngredient(new Bubble(Bubble.Type.SWEETAPPLE));
      
      BabbleTea tea4 = new BabbleTea();
      tea4.addIngredient(new Apple());
      tea4.addIngredient(new Bubble(Bubble.Type.BLUEBERRY));
      tea4.addIngredient(new Cream());
    
   BabbleTea tea5 = new BabbleTea();
   tea5.addIngredient(new Cinamon());
   tea5.addIngredient(new Bubble(Bubble.Type.SOURAPLLE));
     
   BabbleTea tea6 = new BabbleTea();
   tea6.addIngredient(new Bubble(Bubble.Type.SOURAPLLE));
   tea6.addIngredient(new Bubble(Bubble.Type.STRAWBERRY));
   tea6.addIngredient(new Bubble(Bubble.Type.LIME));
   tea6.addIngredient(new Orange());

// System.out.println(tea1.toString());
   System.out.println(tea2.toString());
   System.out.println(tea3.toString());
   System.out.println(tea4.toString());
   System.out.println(tea5.toString());
   System.out.println(tea6.toString());
   
   BabbleTea tea7 = new BabbleTea();
   tea7.addIngredient(new Orange());
   tea7.addIngredient(new Apple());
   
   System.out.println(tea7.toString());
 
       
      
       
       
       
       
	}

}
