package com.gildedrose;

public class ItemFactory {
    public static GeneralItem from(Item item) {
        if (item.name.equals(SulfurasItem.SULFURAS_HAND_OF_RAGNAROS))
            return new SulfurasItem(item);
        if (item.name.equals(AgedBrieItem.AGED_BRIE))
            return new AgedBrieItem(item);
        if (item.name.equals(BackstageItem.BACKSTAGE_PASSES_TO_A_TAFKAL80_ETC_CONCERT))
            return new BackstageItem(item);
        return new GeneralItem(item);
    }
}
