package com.gildedrose;

public class BackstageItem extends GeneralItem {
    public BackstageItem(Item item) {
        super(BACKSTAGE_PASSES_TO_A_TAFKAL80_ETC_CONCERT, item.sellIn, item.quality);
    }

    @Override
    public void updateItemQuality() {
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
    }

    @Override
    public void updateItemSellIn() {
        super.updateItemSellIn();
    }
}
