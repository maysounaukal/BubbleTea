package Associatie;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.List;

import AbstractKlasse.BubbleTeaIngredient;
import AbstractKlasse.Order;

public class Ticket {
	private static int ticketNo = 0;
	private double price;
	private Order order;
	private List<BubbleTeaIngredient> orderList;
	private BubbleTeaIngredient[] orderArray;
	private LocalDateTime ticketTime;
	
	//private String id;
	


	public Ticket() {};
	
	public Ticket(double price) {this.price = price;
//	this.order = order;
	this.ticketTime = LocalDateTime.now();
	//ZoneOffset zone = ZoneOffset.of("Z");
	//this.id = ticketTime.getDayOfYear() + "_" + ticketTime.toEpochSecond(zone) + 
	ticketNo++;}

	public Ticket(Order order1) {
    this.order = order1;
    this.orderList = order.getIngredients();
    //als ik de ticket2 in main op die manier heb gebruikt
    calcPrice(order.getIngredients());
    //calcPrice(order1);
    this.ticketTime = LocalDateTime.now();
//	ZoneOffset zone = ZoneOffset.of("Z");
	//this.id = ticketTime.getDayOfYear() + "_" + ticketTime.toEpochSecond(zone) + 
	ticketNo++;
    
	}
  public Ticket(List<BubbleTeaIngredient> orderList) {
	  this.orderList = orderList;
	  calcPrice(orderList);
  }

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "Ticket [price=" + price + "]";
	}

	public static int getTicketNo() {
		// TODO Auto-generated method stub
		return ticketNo++;
	}
     
	public static void setTicketNo(int ticketNo) {
		Ticket.ticketNo = ticketNo;
	}
	

	public BubbleTeaIngredient[] getOrderArray() {
		return orderArray;
	}

	public void setOrderArray(BubbleTeaIngredient[] orderArray) {
		this.orderArray = orderArray;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(List<BubbleTeaIngredient> order) {
	
		this.orderList = order;
		calcPrice(order);
		
	}

	public List<BubbleTeaIngredient> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<BubbleTeaIngredient> orderList) {
		this.orderList = orderList;
	}
	
	public void setOrder(Order order) {

		this.order = order;

		//this.orderList = order.getOrderList();

	}
	

	private double calcPrice(List<BubbleTeaIngredient> order) {
		
		return price = order.stream().mapToDouble(e -> e.getPrice()).sum();
		
	}
	

}
