package AbstractKlasse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import Associatie.Register;
import Associatie.Ticket;
import Interface.Boilable;

public class BubbleTeaBar {
private Register register = new Register();
private int ordertotal = 0;
List<BubbleTeaIngredient> bubbleTeaIngredients = new ArrayList<>();
public Stock stock;
private double profit = 0;
private MenuCard menu;
private TeaFactory teaMaker;

public BubbleTeaBar() { 
};


public void acceptTicket(Ticket ticketln) {
	// makeBubbleTea(ticketln.getOrder());
	 register.addTickets(ticketln);
	

  System.out.println(ticketln);
  System.out.println(ticketln.getPrice());
}
private void makeBubbleTea(Order order) {
	// TODO Auto-generated method stub
	
	ordertotal++;
	 makeBubbleTea(order);
	
	}


 public BabbleTea makeBubbleTea(List<BubbleTeaIngredient> order)  throws BubbleTeaShortageException, NullPointerException{
	 if(stock.getAppleAmount() <= 0) {
		 throw new BubbleTeaShortageException("er is geen meer Apple");
	 } if(stock.getBubbleAmount() <= 0) {
		 throw new BubbleTeaShortageException ("er is geen meer bubbles");
	 }if(stock.getCinamonAmount() <= 0) {
		 throw new BubbleTeaShortageException ("er is geen meer cinamon");
	 }if(stock.getCreamAmount() <= 0) {
		 throw new BubbleTeaShortageException ("er is geen meer cream");
	 }if(stock.getGingerAmount() <= 0) {
		 throw new BubbleTeaShortageException ("er is geen meer ginger");
	 }if(stock.getOrangeAmount() <= 0) {
		 throw new BubbleTeaShortageException ("er is geen meer orange");
	 }if(stock.getStrawberryAmount() <= 0) {
		 throw new BubbleTeaShortageException ("er is geen meer strawberry");
	 }
	 
	 for(BubbleTeaIngredient o:bubbleTeaIngredients) {
		 if(o instanceof Boilable) {
			 ((Boilable) o).Boil();
		 }else {
			 System.out.println("Voeg" + "   " + o + "   " + "aan de cap");
		 }
	 }
	 
	return new BabbleTea(order);
	 
 }




public double getProfit() {
	// TODO Auto-generated method stub
	return register.calculateTotaalPrice();
}


@Override
public String toString() {
	return "BubbleTeaBar [register=" + register + "]";
}


public BabbleTea acceptOrder(BubbleTeaIngredient[] bubbleTeaIngredients) throws BubbleTeaShortageException, NullPointerException {
	// TODO Auto-generated method stub
	makeOrder(bubbleTeaIngredients);
	ordertotal++;
	return new BabbleTea(bubbleTeaIngredients);
}

//die verbind met( BabbleTea acceptOrder(BubbleTeaIngredient[] bubbleTeaIngredients)
private BabbleTea makeOrder(BubbleTeaIngredient[] bubbleTeaIngredients2) throws BubbleTeaShortageException, NullPointerException {
	
	// TODO Auto-generated method stub
	 if(stock.getAppleAmount() <= 0) {
		 throw new BubbleTeaShortageException("er is geen meer Apple");
	 } if(stock.getBubbleAmount() <= 0) {
		 throw new BubbleTeaShortageException ("er is geen meer bubbles");
	 }if(stock.getCinamonAmount() <= 0) {
		 throw new BubbleTeaShortageException ("er is geen meer cinamon");
	 }if(stock.getCreamAmount() <= 0) {
		 throw new BubbleTeaShortageException ("er is geen meer cream");
	 }if(stock.getGingerAmount() <= 0) {
		 throw new BubbleTeaShortageException ("er is geen meer ginger");
	 }if(stock.getOrangeAmount() <= 0) {
		 throw new BubbleTeaShortageException ("er is geen meer orange");
	 }if(stock.getStrawberryAmount() <= 0) {
		 throw new BubbleTeaShortageException ("er is geen meer strawberry");
	 }
	for(BubbleTeaIngredient mix: bubbleTeaIngredients) {
		if(mix instanceof Boilable) {
			((Boilable) mix).Boil();
		}else {
			System.out.println("added" + "   " + mix+ "  " + "to the cup");
		}
	}
	return new BabbleTea(bubbleTeaIngredients2);
}


public BabbleTea acceptOrder(List<BubbleTeaIngredient> list) throws BubbleTeaShortageException, NullPointerException {
	// TODO Auto-generated method stub
	
	makeBubbleTea(list);
	return new BabbleTea(list);
}
private double calcOrder(BubbleTeaIngredient[] bubbleTeaIngredients) {

	return Stream.of(bubbleTeaIngredients).mapToDouble(order -> order.getPrice()).sum();

}




public void setProfit(double profit) {

	this.profit = profit;

}



public Register getRegister() {

	return register;

}


}
