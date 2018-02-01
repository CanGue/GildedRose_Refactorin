package model;

public class StandartItem extends Item {

	public StandartItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
		// TODO Auto-generated constructor stub
	}

	
	public void update() {
		
		super.update();
		
		if (this.sellIn < 0 && this.quality > 0) {
			this.decreaseQuality(1);
		}
		if (this.quality > 0) {
			this.decreaseQuality(1);
		}
		
		
	}
}
