package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GildedRoseTest {

    @Test
    void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
    }
    @Test
    void neverNegative () {
        Item[] items = new Item [] {
            new Item("item1", 10 , 5 ),
            new Item("item2", 5, 0),
            new Item("item3", 0, 3),
            new Item("item4", -1, 1)
        };
        GildedRose app = new GildedRose(items);
        for (int i = 0; i < 20; i++) {
            app.updateQuality();
            for (Item item : items) {
                assertTrue(item.quality >= 0, "Quality should never be negative");
            }
        }
    }
    @Test
    void cinquainQuality() {
        Item[] items = new Item [] {
            new Item("item1", 10 , 11 ),
            new Item("item2", 5, 0),
            new Item("item3", 0, 43),
            new Item("item4", -1, 50)
        };
        GildedRose app = new GildedRose(items);
        for (int i = 0; i < 20; i++) {
            app.updateQuality();
            for (Item item : items) {
                assertTrue(item.quality <= 50, "Quality should never be more than 50");
            }
        }
    }
    @Test
    void nameSulQuality(){
        Item[] items = new Item [] {
            new Item("sulfuras", 15, 11),
            new Item("sulfuras", 10, 0),
            new Item("sulfuras", 0, 43),
            new Item("sulfuras", -1, 50)
        };
        GildedRose app = new GildedRose(items);
        for (int i = 0; i < 20; i++) {
            app.updateQuality();
            for (Item item : items) {
                assertTrue(item.quality == 80, "Quality of Sulfuras should never change");
            }
        }
    }

}



