package model;

public abstract class Item {

	public String name;

	public int sellIn;

	public int quality;

	public Item(String name, int sellIn, int quality) {
		this.name = name;
		this.sellIn = sellIn;
		this.quality = quality;
	}

	public void increaseQuality(int increaseBy) {
		this.quality += increaseBy;
	}

	public void decreaseQuality(int decreaseBy) {
		this.quality -= decreaseBy;
	}

	public void setQualityToZero() {
		this.quality = 0;
	}

	public void decreaseSellIn(int decreaseBy) {
		this.sellIn -= decreaseBy;
	}

	public void update() {
	
		this.decreaseSellIn(1);

	
	}

	@Override
	public String toString() {
		return this.name + ", " + this.sellIn + ", " + this.quality;
	}
}
