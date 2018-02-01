package model;

public class StandartItem extends Item {

	public StandartItem(int sellIn, int quality) {
		
		this.sellIn = sellIn;
		this.quality = quality;
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
