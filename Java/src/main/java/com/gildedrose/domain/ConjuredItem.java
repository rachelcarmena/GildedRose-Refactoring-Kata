package com.gildedrose.domain;

import com.gildedrose.Item;

import java.util.Optional;
import java.util.function.Function;

public class ConjuredItem extends GeneralItem {

    private static String CONJURED_MANA_CAKE = "Conjured Mana Cake";

    public ConjuredItem(Item item) {
        super(CONJURED_MANA_CAKE, item.sellIn, item.quality);
    }

    public static Function<Item, Optional<GeneralItem>> from() {
        return item -> {
            if (item.name.equals(CONJURED_MANA_CAKE))
                return Optional.of(new ConjuredItem(item));
            return Optional.empty();
        };
    }

    @Override
    protected void updateItemQuality() {
        super.updateItemQuality();
        super.updateItemQuality();
    }
}
