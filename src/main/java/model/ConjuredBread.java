package model;

public class ConjuredBread extends StandartItem {

	public ConjuredBread(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
		// TODO Auto-generated constructor stub
	}
	
	public void update() {
		super.update();
		decreaseQuality(1);
	}
	
	
	

}
