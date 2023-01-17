package bung.fruitcalculator;

public class Main {
	
	public static void main(String[] args) {
		
		Basket thisBasket = new Basket();
		
		Banana firstBanana = new Banana();
		Banana secondBanana = new Banana();
		Banana thirdBanana = new Banana();
		
		Orange firstOrange = new Orange();
		Orange secondOrange = new Orange();
		
		firstBanana.setWeight(0.5);
		secondBanana.setWeight(0.45);
		thirdBanana.setWeight(0.35);
		
		firstOrange.setWeight(0.4);
		secondOrange.setWeight(0.6);
		
		thisBasket.addBanana(firstBanana);
		thisBasket.addBanana(secondBanana);
		thisBasket.addBanana(thirdBanana);
		
		thisBasket.addOrange(firstOrange);
		thisBasket.addOrange(secondOrange);
		
		System.out.println("Total weight of this basket is " + thisBasket.sumWeight());
	}
	
}
