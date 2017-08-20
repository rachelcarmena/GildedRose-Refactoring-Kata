package com.gildedrose;

public class GeneralItem extends Item {
    public static final String AGED_BRIE = "Aged Brie";
    public static final String BACKSTAGE_PASSES_TO_A_TAFKAL80_ETC_CONCERT = "Backstage passes to a TAFKAL80ETC concert";
    public static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";

    public GeneralItem(Item item) {
        super(item.name, item.sellIn, item.quality);
    }

    public static GeneralItem from(Item item) {
        return new GeneralItem(item);
    }

    public void updateItemQuality() {
        switch (name) {
            case AGED_BRIE:
                increaseQuality();
                if (sellIn < 0) {
                    increaseQuality();
                }
                break;
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
            case SULFURAS_HAND_OF_RAGNAROS:
                break;
            default:
                decreaseQuality();
                if (sellIn < 0) {
                    decreaseQuality();
                }
        }
    }

    public void updateItemSellIn() {
        if (!name.equals(SULFURAS_HAND_OF_RAGNAROS)) {
            sellIn -= 1;
        }
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
