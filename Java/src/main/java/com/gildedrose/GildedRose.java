package com.gildedrose;

class GildedRose {

    public static final String AGED_BRIE = "Aged Brie";
    public static final String BACKSTAGE_PASSES_TO_A_TAFKAL80_ETC_CONCERT = "Backstage passes to a TAFKAL80ETC concert";
    public static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";

    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            GeneralItem item = GeneralItem.from(items[i]);
            updateItemSellIn(item);
            updateItemQuality(item);
            items[i] = item;
        }
    }

    public void updateItemQuality(GeneralItem item) {
        switch (item.name) {
            case AGED_BRIE:
                increaseQuality(item);
                if (item.sellIn < 0) {
                    increaseQuality(item);
                }
                break;
            case BACKSTAGE_PASSES_TO_A_TAFKAL80_ETC_CONCERT:
                increaseQuality(item);
                if (item.sellIn < 10) {
                    increaseQuality(item);
                }
                if (item.sellIn < 5) {
                    increaseQuality(item);
                }
                if (item.sellIn < 0) {
                    item.quality = 0;
                }
                break;
            case SULFURAS_HAND_OF_RAGNAROS:
                break;
            default:
                decreaseQuality(item);
                if (item.sellIn < 0) {
                    decreaseQuality(item);
                }
        }
    }

    public void updateItemSellIn(GeneralItem item) {
        if (!item.name.equals(SULFURAS_HAND_OF_RAGNAROS)) {
            item.sellIn -= 1;
        }
    }

    public void decreaseQuality(GeneralItem item) {
        if (item.quality > 0) {
            item.quality -= 1;
        }
    }

    public void increaseQuality(GeneralItem item) {
        if (item.quality < 50) {
            item.quality += 1;
        }
    }
}