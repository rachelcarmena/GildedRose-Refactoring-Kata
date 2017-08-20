package com.gildedrose;

import java.util.Optional;

public class ItemFactory {
    public static GeneralItem from(Item item) {
        Optional<GeneralItem> result = SulfurasItem.from().apply(item);
        if (result.isPresent())
            return result.get();
        if (item.name.equals(AgedBrieItem.AGED_BRIE))
            return new AgedBrieItem(item);
        if (item.name.equals(BackstageItem.BACKSTAGE_PASSES_TO_A_TAFKAL80_ETC_CONCERT))
            return new BackstageItem(item);
        return new GeneralItem(item);
    }
}
