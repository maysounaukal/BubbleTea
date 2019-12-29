package Main;

import AbstractKlasse.BubbleTeaBar;
import Associatie.Ticket;

public class Main7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ticket ticket1 = new Ticket(3.0);
		Ticket ticket2 = new Ticket(2.5);
		Ticket ticket3 = new Ticket(4.5);
		BubbleTeaBar bar = new BubbleTeaBar();
		bar.acceptTicket(ticket1);
		bar.acceptTicket(ticket2);
		bar.acceptTicket(ticket3);
		System.out.println("de profit:");
		System.out.println(bar.getProfit());
		

	}

}
