package game;

import java.util.Arrays;

import model.Item;

public class GildedRose {
  
	public Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        
    	Arrays.asList(items).forEach(Item::update);
    }
}