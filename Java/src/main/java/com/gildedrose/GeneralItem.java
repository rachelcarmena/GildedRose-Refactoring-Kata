package com.gildedrose;

public class GeneralItem extends Item {
    public GeneralItem(Item item) {
        super(item.name, item.sellIn, item.quality);
    }

    public static GeneralItem from(Item item) {
        return new GeneralItem(item);
    }
}
