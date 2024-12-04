package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        // Faire appel à la Factory UpdateQualityFactory
        UpdateQualityFactory factory = new UpdateQualityFactory();
        factory.updateQuality(items);

//            if (!item.name.equals(AGED)
//                    && !item.name.equals(BACKSTATGE)) {
//                if (item.quality > 0 && !item.name.equals(SULFURAS)) {
//                        item.quality = item.quality - 1;
//                }
//            } else {
//                if (item.quality < 50) {
//                    item.quality = item.quality + 1;
//
//                    if (item.name.equals(BACKSTATGE)) {
//                        if (item.sellIn < 11 && item.quality < 50) {
//
//                                item.quality = item.quality + 1;
//
//                        }
//
//                        if (item.sellIn < 6 && item.quality < 50) {
//
//                                item.quality = item.quality + 1;
//
//                        }
//                    }
//                }
//            }
//
//            if (!item.name.equals(SULFURAS)) {
//                item.sellIn = item.sellIn - 1;
//            }
//
//            if (item.sellIn < 0) {
//                if (!item.name.equals(AGED)) {
//                    if (!item.name.equals(BACKSTATGE)) {
//                        if (item.quality > 0 && !item.name.equals(SULFURAS)) {
//                            item.quality = item.quality - 1;
//
//                        }
//                    } else {
//                        item.quality = 0;
//                    }
//                } else {
//                    if (item.quality < 50) {
//                        item.quality = item.quality + 1;
//                    }
//                }
//            }

    }
}
