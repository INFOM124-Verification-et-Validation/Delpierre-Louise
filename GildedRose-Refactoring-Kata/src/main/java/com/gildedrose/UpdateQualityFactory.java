package com.gildedrose;

public class UpdateQualityFactory {
    static final String AGED = "Aged Brie";
    static final String BACKSTATGE = "Backstage passes to a TAFKAL80ETC concert";
    static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    static final String CONJURED = "Conjured";
    public static void updateQuality(Item [] items) {
        for (Item item : items)
            switch (item.name) {
            case AGED:
                AgedBrie agedBrie = new AgedBrie();
                agedBrie.updateQuality(items);
                break;
            case BACKSTATGE:
                Backstage backstage = new Backstage();
                backstage.updateQuality(items);
                break;
            case SULFURAS:
                Sulfuras sulfuras = new Sulfuras();
                sulfuras.updateQuality(items);
                break;
            case CONJURED:
                Conjured conjured = new Conjured();
                Conjured.updateQuality(items);
                break;
            default:

        }
}







