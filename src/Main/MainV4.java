package Main;

import java.util.ArrayList;
import java.util.List;

import AbstractKlasse.Apple;
import AbstractKlasse.Bubble;
import AbstractKlasse.BubbleTeaIngredient;
import AbstractKlasse.Fruit;
import AbstractKlasse.Spice;
import AbstractKlasse.Strawberry;
import Interface.Boilable;

public class MainV4 {

	public static void main(String[] args) {
		Apple apple = new Apple();
		Bubble zureApple = new Bubble(Bubble.Type.SOURAPLLE);
		Strawberry strawberry = new Strawberry();
		List<BubbleTeaIngredient> list = new ArrayList<>();
		list.add(apple);
		list.add(zureApple);
		list.add(strawberry);
		System.out.println(list);
		
		list.stream().mapToDouble(a -> a.getPrice()).forEach(System.out::println);
		
		double count = list.stream().mapToDouble(a -> a.getPrice()).count();
		System.out.println("het aantal dingen" + count);
		  double sum = list.stream().mapToDouble(a -> a.getPrice()).sum();
		  
		  System.out.println("de som van prijzen"+ "   " + sum);
		  System.out.println("************");
		  //op andere manier
		  double sum1 = 0;
		  for(int i = 0 ; i< list.size();i++) {
			  sum1 += list.get(i).getPrice();
		  }
		  System.out.println(sum1);
		  System.out.println("de ingredienten die kunnen gekookt worden:");
		  
		  list.stream().filter(s -> s instanceof Fruit || s instanceof Spice).
		  forEach(System.out::println);
		  //op andere manier
		  System.out.println();
		  list.stream().filter(s -> s instanceof Boilable).forEach(System.out::println);
		  
		  System.out.println("(((((((())))))))");
		for(BubbleTeaIngredient b: list) {
			if(b instanceof Boilable) {
				((Boilable) b).Boil();
				System.out.println(b);
			}else {
				//System.out.println("er wordt niet gekookt");
			}
		}
		
		

	}

}
