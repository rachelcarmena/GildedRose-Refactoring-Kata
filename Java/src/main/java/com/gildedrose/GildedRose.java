package com.gildedrose;

class GildedRose {

    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            GeneralItem item = GeneralItem.from(items[i]);
            item.updateItemSellIn();
            item.updateItemQuality();
            items[i] = item;
        }
    }
}