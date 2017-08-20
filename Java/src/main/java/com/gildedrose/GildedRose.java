package com.gildedrose;

import com.gildedrose.domain.GeneralItem;

class GildedRose {

    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            items[i] = GeneralItem.updateQuality(items[i]);
        }
    }

}