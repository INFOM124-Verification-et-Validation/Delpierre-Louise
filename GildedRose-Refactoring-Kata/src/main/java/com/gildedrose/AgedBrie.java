package com.gildedrose;

public class AgedBrie {
    public AgedBrie() {
    }

    public void updateQuality(Item[] items) {
        for (Item item : items) {
            if (item.name.equals("Aged Brie")) {
                if (item.quality < 50) {
                    item.quality++;
                }
                item.sellIn--;
                if (item.sellIn < 0 && item.quality < 50) {
                    item.quality++;
                }
            }
        }
    }
}

