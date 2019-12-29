package Main;

import Associatie.Register;
import Associatie.Ticket;

public class MainiV1 {

	public static void main(String[] args) {
		Register register = new Register();
		Ticket ticket1 = new Ticket(3);
		Ticket ticket2 = new Ticket(4.5);
		Ticket ticket3 = new Ticket(7);
		Ticket ticket4 = new Ticket(2);
		
      register.addTickets(ticket1);
      register.addTickets(ticket2);
      register.addTickets(ticket3);
      register.addTickets(ticket4);
      
      
      System.out.println(register);
      
      System.out.println("de profit is");
      
       System.out.println(register.getProfit());
      System.out.println(register.calculateTotaalPrice());
       //op andere manier als ik een nieuwe methode aanmaak
      
      System.out.println("het aanatal tickets is " + register.getAantalTiket());
		

	}

}
