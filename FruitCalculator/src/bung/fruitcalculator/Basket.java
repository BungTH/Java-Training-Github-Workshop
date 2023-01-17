package bung.fruitcalculator;

import java.util.ArrayList;

public class Basket {
	
	ArrayList<Banana> arrayBanana;
	ArrayList<Orange> arrayOrange;
	
	public Basket() {
		arrayBanana = new ArrayList<Banana>();
		arrayOrange = new ArrayList<Orange>();
	}
	
	public void addBanana(Banana oneBanana) {
		arrayBanana.add(oneBanana);
	}
	
	public void addOrange(Orange oneOrange) {
		arrayOrange.add(oneOrange);
	}
	
	public double sumWeight() {
		double totalWeight = 0;

		for(int i = 0;i < arrayBanana.size();i++) {
			Banana tmpBanana = arrayBanana.get(i);
			totalWeight = totalWeight + tmpBanana.getWeight();
		}
		for(int i = 0;i < arrayOrange.size();i++) {
			Orange tmpOrange = arrayOrange.get(i);
			totalWeight = totalWeight + tmpOrange.getWeight();
			
		}
		
		return totalWeight;
	}
	
}
