package com.gildedrose;

public class AgedBrieItem extends GeneralItem {
    public AgedBrieItem(Item item) {
        super(AGED_BRIE, item.sellIn, item.quality);
    }

    @Override
    public void updateItemQuality() {
        increaseQuality();
        if (sellIn < 0) {
            increaseQuality();
        }
    }
}
