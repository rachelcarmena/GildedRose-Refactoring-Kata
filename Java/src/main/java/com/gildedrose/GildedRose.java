package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            Item item = items[i];
            updateItemSellIn(item);
            updateItemQuality(item);
            items[i] = item;
        }
    }

    private void updateItemQuality(Item item) {
        if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            increaseQuality(item);
            if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (item.sellIn < 10) {
                    increaseQuality(item);
                }

                if (item.sellIn < 5) {
                    increaseQuality(item);
                }
            }
        } else {
            if (item.name.equals("Aged Brie")) {
                increaseQuality(item);
            } else {
                if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
                } else {
                    decreaseQuality(item);
                }
            }
        }

        if (item.sellIn < 0) {
            if (item.name.equals("Aged Brie")) {
                increaseQuality(item);
            } else {
                if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                    item.quality = 0;
                } else {
                    if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
                        return;
                    }
                    decreaseQuality(item);
                }
            }
        }
    }

    private void updateItemSellIn(Item item) {
        if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
            item.sellIn -= 1;
        }
    }

    private void decreaseQuality(Item item) {
        if (item.quality > 0) {
            item.quality -= 1;
        }
    }

    private void increaseQuality(Item item) {
        if (item.quality < 50) {
            item.quality += 1;
        }
    }
}