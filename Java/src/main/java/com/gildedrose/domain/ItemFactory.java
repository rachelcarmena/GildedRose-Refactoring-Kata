package com.gildedrose.domain;

import com.gildedrose.Item;

import java.util.ArrayList;
import java.util.Optional;
import java.util.function.Function;

public class ItemFactory {

    private static ArrayList<Function> converters = new ArrayList<>();

    static {
        converters = new ArrayList<>();
        converters.add(SulfurasItem.from());
        converters.add(AgedBrieItem.from());
        converters.add(BackstageItem.from());
        converters.add(ConjuredItem.from());
    }

    public static GeneralItem from(Item item) {
        for (Function<Item, Optional<GeneralItem>> converter: converters) {
            Optional<GeneralItem> result = converter.apply(item);
            if (result.isPresent())
                return result.get();
        }
        return new GeneralItem(item);
    }
}
