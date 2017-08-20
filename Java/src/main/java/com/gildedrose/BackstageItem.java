package com.gildedrose;

import java.util.Optional;
import java.util.function.Function;

public class BackstageItem extends GeneralItem {
    private static final String BACKSTAGE_PASSES_TO_A_TAFKAL80_ETC_CONCERT = "Backstage passes to a TAFKAL80ETC concert";

    public BackstageItem(Item item) {
        super(BACKSTAGE_PASSES_TO_A_TAFKAL80_ETC_CONCERT, item.sellIn, item.quality);
    }

    @Override
    public void updateItemQuality() {
        increaseQuality();
        if (sellIn < 10) {
            increaseQuality();
        }
        if (sellIn < 5) {
            increaseQuality();
        }
        if (sellIn < 0) {
            quality = 0;
        }
    }

    @Override
    public void updateItemSellIn() {
        super.updateItemSellIn();
    }

    public static Function<Item, Optional<GeneralItem>> from() {
        return item -> {
            if (item.name.equals(BACKSTAGE_PASSES_TO_A_TAFKAL80_ETC_CONCERT))
                return Optional.of(new BackstageItem(item));
            return Optional.empty();
        };
    }
}
