package Associatie;

import java.util.ArrayList;
import java.util.List;


public class Register {
	private  double profit = 0;
	private List<Ticket> tickets = new ArrayList<>();

	public Register() {};



	public List<Ticket> getTickets() {
		return tickets;
	}



	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}

      public double getAantalTiket() {
		return tickets.stream().mapToInt(e -> e.getTicketNo()).count();
	}
      
	public double getProfit(){
		return  profit ;
	}
	@Override
	public String toString() {
		return "(tickets=" + tickets + ")";
	}

	public void setProfit(double profit) {
		this.profit = profit;
	}

	   public void addTickets(Ticket ticket1) {
	 tickets.add(ticket1);
	 profit += ticket1.getPrice();
		 }

	   
	  public double calculateTotaalPrice() {
		 profit += tickets.
			 stream().
				mapToDouble(p -> p.getPrice()).
				 sum();
	return profit;
	 }


}
