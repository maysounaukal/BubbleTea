package Main;


import AbstractKlasse.BubbleTeaBar;
import Associatie.Ticket;


public class MainV5 {

	public static void main(String[] args) {
		BubbleTeaBar bar = new BubbleTeaBar();
	//	Register kassa = new Register();
		bar.acceptTicket(new Ticket(4.20));
		bar.acceptTicket(new Ticket(4.20));
		bar.acceptTicket(new Ticket(4.20));
		bar.acceptTicket(new Ticket(4.20));
		bar.acceptTicket(new Ticket(4.20));
		
		
		System.out.println(bar);
		
		System.out.println(bar.getProfit());
		
		
		
		

	}

}
