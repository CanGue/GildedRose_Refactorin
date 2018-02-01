package model;

public class ConjuredBread extends StandartItem {

	public ConjuredBread(String name, int sellIn, int quality) {
		super(sellIn, quality);

	}
	
	public void update() {
		super.update();
		decreaseQuality(1);
	}
	
	
	

}
