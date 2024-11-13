package com.gildedrose;

public class Backstage {
    public Backstage() {
    }
    public void updateQuality(Item[] items) {
        for (Item item : items) {
            if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (item.quality < 50) {
                    item.quality++;
                    if (item.sellIn < 11) {
                        if (item.quality < 50) {
                            item.quality++;
                        }
                    }
                    if (item.sellIn < 6) {
                        if (item.quality < 50) {
                            item.quality++;
                        }
                    }
                }
                item.sellIn--;
                if (item.sellIn < 0) {
                    item.quality = 0;
                }
            }
        }
    }
}
