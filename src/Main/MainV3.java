package Main;

import AbstractKlasse.Apple;
import AbstractKlasse.Bubble;
import AbstractKlasse.Orange;
import AbstractKlasse.Strawberry;


public class MainV3 {

	public static void main(String[] args) {
		Apple apple = new Apple(0.75);
		Bubble zureApple = new Bubble(Bubble.Type.SOURAPLLE);
		Strawberry strawBerry = new Strawberry(1);
		Orange orange = new Orange(0.75);
		
		System.out.println(apple);
		System.out.println(strawBerry);
		System.out.println(orange);
		
		

	}

}
