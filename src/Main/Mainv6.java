package Main;

import java.util.ArrayList;
import java.util.List;

import AbstractKlasse.Apple;
import AbstractKlasse.Bubble;
import AbstractKlasse.BubbleTeaBar;
import AbstractKlasse.BubbleTeaIngredient;
import AbstractKlasse.Cinamon;
import AbstractKlasse.Cream;
import AbstractKlasse.Ginger;
import AbstractKlasse.Order;
import Associatie.Ticket;

public class Mainv6 {

	public static void main(String[] args) {
		List<BubbleTeaIngredient> test = new ArrayList<>();
		Apple apple = new Apple();
		Bubble bubble = new Bubble(Bubble.Type.STRAWBERRY);
		test.add(apple);
		test.add(bubble);
	Order order1 = new Order(test);
	
	Ticket ticket1 = new Ticket(order1);
	BubbleTeaBar bar = new BubbleTeaBar();
     bar.acceptTicket(ticket1);
     System.out.println(bar.getProfit());
	 Order order2 = new Order();
    Ticket ticket2 = new Ticket(new Order(new ArrayList<BubbleTeaIngredient>(){
	{add(new Cinamon());add(new Bubble(Bubble.Type.SWEETAPPLE));add(new Cream());}
	}
    ));
     bar.acceptTicket(ticket2);
     
     Ginger ginger = new Ginger();
     Bubble bubble2 = new Bubble(Bubble.Type.LIME);
     test.add(ginger);
     test.add(bubble2);
	Order order3 = new Order(test);
	Ticket ticket3 = new Ticket(order3);
	bar.acceptTicket(ticket3);
	System.out.println("de profit");
	System.out.println(bar.getProfit());
	
	
		

	}

}
