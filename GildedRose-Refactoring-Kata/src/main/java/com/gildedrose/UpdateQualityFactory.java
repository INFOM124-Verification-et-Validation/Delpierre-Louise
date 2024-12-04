package com.gildedrose;

public class UpdateQualityFactory {
    static final String AGED = "Aged Brie";
    static final String BACKSTATGE = "Backstage passes to a TAFKAL80ETC concert";
    static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    static final String CONJURED = "Conjured";

    public void updateQuality(Item[] items) {
        for (Item item : items) {
            switch (item.name) {
                case AGED:
                    AgedUpdate udpateAged = new AgedUpdate();
                    udpateAged.updateQuality(item);
                    break;
                case BACKSTATGE:
                    BackstageUpdate udpateBackstage = new BackstageUpdate();
                    udpateBackstage.updateQuality(item);
                    break;
                case SULFURAS:
                    SulfurasUpdate updateSulfuras = new SulfurasUpdate();
                    updateSulfuras.updateQuality(item);
                    break;
                case CONJURED:
                    ConjuredUpdate updateConjured = new ConjuredUpdate();
                    updateConjured.updateQuality(item);
                    break;
                default:
                    DefaultUpdate updateDefault = new DefaultUpdate();
                    updateDefault.updateQuality(item);
                    break;
            }

        }
    }
}
