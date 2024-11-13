package com.gildedrose;

public class Sulfuras {
    public Sulfuras() {
    }

    public void updateQuality(Item[] items) {
        for (Item item : items) {
            if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
                item.quality = 80;
            }
        }
    }
}
