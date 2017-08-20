package com.gildedrose;

import java.util.Optional;

public class ItemFactory {
    public static GeneralItem from(Item item) {
        Optional<GeneralItem> result = SulfurasItem.from().apply(item);
        if (result.isPresent())
            return result.get();

        result = AgedBrieItem.from().apply(item);
        if (result.isPresent())
            return result.get();

        result = BackstageItem.from().apply(item);
        if (result.isPresent())
            return result.get();

        return new GeneralItem(item);
    }
}
