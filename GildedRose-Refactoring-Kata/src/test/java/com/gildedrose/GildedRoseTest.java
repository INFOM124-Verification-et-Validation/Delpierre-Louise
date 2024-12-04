package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GildedRoseTest {

    @Test
    void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
    }
    @Test
    void testAgedBrie() {
        Item[] items = new Item[] { new Item("Aged Brie", 2, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertTrue(app.items[0].quality > 0);
        assertEquals(1, app.items[0].sellIn);
    }

    @Test
    void testSulfuras() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 5, 80) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        app.updateQuality();
        app.updateQuality();
        app.updateQuality();
        app.updateQuality();
        assertEquals(5, app.items[0].sellIn); // car c'est pas censé être vendu
        assertFalse(app.items[0].quality > 80);
        assertEquals(80, app.items[0].quality); // car la qualité ne change jamais et reste à 80
    }

    @Test
    void testBackstageCloseToDate() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 6,10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(5, app.items[0].sellIn);
        assertEquals(12, app.items[0].quality);
        app.updateQuality();
        assertEquals(15, app.items[0].quality);
    }

    // Test avec le SellIn qui est plus grand que 10
    @Test
    void testBackstage() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 20,11) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(19, app.items[0].sellIn);
        assertEquals(12, app.items[0].quality);
    }

    @Test
    void testBackstageDatePassed() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", -2,11) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
    }



}
