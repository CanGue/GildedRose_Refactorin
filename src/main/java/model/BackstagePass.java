package model;

public class BackstagePass extends Item {

	public BackstagePass(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	public void update() {
		super.update();

		if (this.quality < 50) {
			this.increaseQuality(1);

			
		}
		if (this.sellIn < 0) {
			setQualityToZero();
		} else {
			if (this.quality < 50) {
				if (this.sellIn < 11) {
					increaseQuality(1);
				}
				if (this.sellIn < 6 && this.quality < 50) {
					increaseQuality(1);
				}
			}

		}

	}

	public void setQualityToZero() {
		this.quality = 0;
	}
}
