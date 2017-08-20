package com.gildedrose;

public class SulfurasItem extends GeneralItem {
    public static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";

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
