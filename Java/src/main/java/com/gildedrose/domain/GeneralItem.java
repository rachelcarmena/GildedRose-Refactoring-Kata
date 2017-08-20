package com.gildedrose.domain;

import com.gildedrose.Item;

public class GeneralItem extends Item {

    public GeneralItem(Item item) {
        super(item.name, item.sellIn, item.quality);
    }

    public GeneralItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void updateItemQuality() {
        decreaseQuality();
        if (sellIn < 0) {
            decreaseQuality();
        }
    }

    public void updateItemSellIn() {
        sellIn -= 1;
    }

    private void decreaseQuality() {
        if (quality > 0) {
            quality -= 1;
        }
    }

    protected void increaseQuality() {
        if (quality < 50) {
            quality += 1;
        }
    }

    public static GeneralItem updateQuality(Item item) {
        GeneralItem generalItem = ItemFactory.from(item);
        generalItem.updateItemSellIn();
        generalItem.updateItemQuality();
        return generalItem;
    }
}
