package com.gildedrose;

public class Conjured {
    public Conjured() {
    }

    public static void updateQuality(Item[] items) {
        for (Item item : items) {
            if (item.name.equals("Conjured")) {
                if (item.quality > 0) {
                    item.quality -= 2;
                }
                item.sellIn--;
                if (item.sellIn < 0 && item.quality > 0) {
                    item.quality -= 2;
                }
            }
        }
    }
}
