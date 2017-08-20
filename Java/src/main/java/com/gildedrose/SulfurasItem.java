package com.gildedrose;

public class SulfurasItem extends GeneralItem {
    public SulfurasItem(Item item) {
        super(SULFURAS_HAND_OF_RAGNAROS, item.sellIn, item.quality);
    }

    @Override
    public void updateItemQuality() {
        return;
    }

    @Override
    public void updateItemSellIn() {
        return;
    }
}
