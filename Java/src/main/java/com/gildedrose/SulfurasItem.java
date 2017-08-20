package com.gildedrose;

import java.util.Optional;
import java.util.function.Function;

public class SulfurasItem extends GeneralItem {
    private static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";

    public SulfurasItem(Item item) {
        super(SULFURAS_HAND_OF_RAGNAROS, item.sellIn, item.quality);
    }

    @Override
    public void updateItemQuality() {
        return;
    }

    @Override
    public void updateItemSellIn() {
        return;
    }

    public static Function<Item, Optional<GeneralItem>> from() {
        return item -> {
            if (item.name.equals(SULFURAS_HAND_OF_RAGNAROS))
                return Optional.of(new SulfurasItem(item));
            return Optional.empty();
        };
    }
}
