package com.gildedrose;

import java.util.Optional;
import java.util.function.Function;

public class AgedBrieItem extends GeneralItem {
    private static final String AGED_BRIE = "Aged Brie";

    public AgedBrieItem(Item item) {
        super(AGED_BRIE, item.sellIn, item.quality);
    }

    @Override
    public void updateItemQuality() {
        increaseQuality();
        if (sellIn < 0) {
            increaseQuality();
        }
    }

    public static Function<Item, Optional<GeneralItem>> from() {
        return item -> {
            if (item.name.equals(AGED_BRIE))
                return Optional.of(new AgedBrieItem(item));
            return Optional.empty();
        };
    }
}
