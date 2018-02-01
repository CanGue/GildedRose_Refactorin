package com.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

import game.GildedRose;
import model.AgedBrie;
import model.BackstagePass;
import model.ConjuredBread;
import model.Item;
import model.StandartItem;
import model.SulfurasHand;

public class GildedRoseTest {

    @Test
    public void testBackstage() {
        Item[] items = new Item[] { new BackstagePass("Backstage passes to a TAFKAL80ETC concert", 22, 22) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(21, app.items[0].sellIn);
        assertEquals(23, app.items[0].quality);
    }

    @Test
    public void testSulfuras() {
        Item[] items = new Item[] { new SulfurasHand("Sulfuras, Hand of Ragnaros", 22, 22) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(22, app.items[0].sellIn);
        assertEquals(22, app.items[0].quality);
    }
    
    @Test
    public void testRandomItem() {
    	  Item[] items = new Item[] { new StandartItem("Random", 22, 22) };
          GildedRose app = new GildedRose(items);
          app.updateQuality();
          assertEquals(21, app.items[0].sellIn);
          assertEquals(21, app.items[0].quality);
    }
    
    @Test
    public void testQualityNeverMoreThan50() {
        Item[] items = new Item[] { new BackstagePass("Backstage passes to a TAFKAL80ETC concert", 50, 50) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(49, app.items[0].sellIn);
        assertEquals(50, app.items[0].quality);
    }
    
    @Test
    public void testBackstageDropsToZeroAfterConcert() {
        Item[] items = new Item[] { new BackstagePass("Backstage passes to a TAFKAL80ETC concert", 0, 50) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
    }
    
    @Test
    public void testBackstageIncreaseDoubleWhen10To6DaysToConcert() {
        Item[] items = new Item[] { new BackstagePass("Backstage passes to a TAFKAL80ETC concert", 10, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(9, app.items[0].sellIn);
        assertEquals(2, app.items[0].quality);
    }
    
    @Test
    public void testBackstageIncreaseTripleWhen5To1DaysToConcert() {
        Item[] items = new Item[] { new BackstagePass("Backstage passes to a TAFKAL80ETC concert", 5, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(4, app.items[0].sellIn);
        assertEquals(3, app.items[0].quality);
    }
    @Test
    public void testQualityDecreaseTwiceAsFastAferSellDate() {
    	  Item[] items = new Item[] { new StandartItem("Random", 0, 22) };
          GildedRose app = new GildedRose(items);
          app.updateQuality();
          assertEquals(-1, app.items[0].sellIn);
          assertEquals(20, app.items[0].quality);
    }
    
    
    @Test
    public void testQualityIsNeverNegativ() {
    	  Item[] items = new Item[] { new StandartItem("Random", 0, 0) };
          GildedRose app = new GildedRose(items);
          app.updateQuality();
          assertEquals(-1, app.items[0].sellIn);
          assertEquals(0, app.items[0].quality);
    }
    
    
    @Test 
    public void testAgedBrieQualityIncreasesAsItNearsSellInDate() {
    	
    	Item[] items = new Item[] { new AgedBrie("Aged Brie", 10, 22) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(9, app.items[0].sellIn);
        assertEquals(23, app.items[0].quality);
    }
    
    @Test 
    public void testConjuredBread() {
    	
    	Item[] items = new Item[] { new ConjuredBread("Conjoured Bread", 10, 22) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(9, app.items[0].sellIn);
        assertEquals(20, app.items[0].quality);
    }
    
    
}
