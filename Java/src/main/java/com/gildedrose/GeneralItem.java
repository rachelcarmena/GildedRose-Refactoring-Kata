package com.gildedrose;

public class GeneralItem extends Item {
    public static final String AGED_BRIE = "Aged Brie";
    public static final String BACKSTAGE_PASSES_TO_A_TAFKAL80_ETC_CONCERT = "Backstage passes to a TAFKAL80ETC concert";
    public static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";

    public GeneralItem(Item item) {
        super(item.name, item.sellIn, item.quality);
    }

    public GeneralItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public static GeneralItem from(Item item) {
        if (item.name.equals(SULFURAS_HAND_OF_RAGNAROS))
            return new SulfurasItem(item);
        if (item.name.equals(AGED_BRIE))
            return new AgedBrieItem(item);
        return new GeneralItem(item);
    }

    public void updateItemQuality() {
        switch (name) {
            case BACKSTAGE_PASSES_TO_A_TAFKAL80_ETC_CONCERT:
                increaseQuality();
                if (sellIn < 10) {
                    increaseQuality();
                }
                if (sellIn < 5) {
                    increaseQuality();
                }
                if (sellIn < 0) {
                    quality = 0;
                }
                break;
            default:
                decreaseQuality();
                if (sellIn < 0) {
                    decreaseQuality();
                }
        }
    }

    public void updateItemSellIn() {
        sellIn -= 1;
    }

    public void decreaseQuality() {
        if (quality > 0) {
            quality -= 1;
        }
    }

    public void increaseQuality() {
        if (quality < 50) {
            quality += 1;
        }
    }
}
