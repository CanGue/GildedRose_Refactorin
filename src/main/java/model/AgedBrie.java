package model;

public class AgedBrie extends Item {

	public AgedBrie(String name, int sellIn, int quality) {
		super("Aged Brie", sellIn, quality);

	}

	public void update() {		
		super.update();
		if (this.quality < 50) {
			this.increaseQuality(1);

			
		}
		if (sellIn < 0) {
			if (quality < 50) {
				increaseQuality(1);
			}
		}				
	}

}
