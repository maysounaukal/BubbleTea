package AbstractKlasse;

public class Stock {
private int appleAmount = 2;
private int strawberryAmount = 2;
private int orangeAmount = 2;
private int cinamonAmount = 2;
private int gingerAmount = 2;
private int creamAmount = 5;
private int bubbleAmount = 5;
 public Stock() {};
 public Stock(int appleAmount, int strawberryAmount, int orangeAmount, int cinamonAmount, int gingerAmount,
		 int creamAmount, int bubbleAmount) {
	 this.appleAmount = appleAmount;
	 this.strawberryAmount = strawberryAmount;
	 this.orangeAmount = orangeAmount;
	 this.cinamonAmount = cinamonAmount;
	 this.gingerAmount = gingerAmount;
	 this.creamAmount = creamAmount;
	 this.bubbleAmount = bubbleAmount;
 }
public int getAppleAmount() {
	return appleAmount;
}
public void setAppleAmount(int appleAmount) {
	this.appleAmount = appleAmount;
}
public int getStrawberryAmount() {
	return strawberryAmount;
}
public void setStrawberryAmount(int strawberryAmount) {
	this.strawberryAmount = strawberryAmount;
}
public int getOrangeAmount() {
	return orangeAmount;
}
public void setOrangeAmount(int orangeAmount) {
	this.orangeAmount = orangeAmount;
}
public int getCinamonAmount() {
	return cinamonAmount;
}
public void setCinamonAmount(int cinamonAmount) {
	this.cinamonAmount = cinamonAmount;
}
public int getGingerAmount() {
	return gingerAmount;
}
public void setGingerAmount(int gingerAmount) {
	this.gingerAmount = gingerAmount;
}
public int getCreamAmount() {
	return creamAmount;
}
public void setCreamAmount(int creamAmount) {
	this.creamAmount = creamAmount;
}
public int getBubbleAmount() {
	return bubbleAmount;
}
public void setBubbleAmount(int bubbleAmount) {
	this.bubbleAmount = bubbleAmount;
}
 
}
