package com.gildedrose;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.annotation.Resource;

@RunWith(JUnitParamsRunner.class)
public class GildedRoseTest {

    @Test
    public void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
    }

    @Test
    @Parameters({"1, 9, 19", "2, 8, 18", "3, 7, 17", "4, 6, 16", "5, 5, 15", "6, 4, 14", "7, 3, 13", "8, 2, 12", "9, 1, 11", "10, 0, 10", "11, -1, 8", "12, -2, 6", "13, -3, 4", "14, -4, 2", "15, -5, 0", "16, -6, 0", "17, -7, 0", "18, -8, 0", "19, -9, 0", "20, -10, 0", "21, -11, 0", "22, -12, 0", "23, -13, 0", "24, -14, 0", "25, -15, 0", "26, -16, 0", "27, -17, 0", "28, -18, 0", "29, -19, 0", "30, -20, 0"})
    public void item_changes_for_5_Dexterity_Vest(int days, int sellIn, int quality) {
        Item item = new Item("+5 Dexterity Vest", 10, 20);
        GildedRose gildedRose = new GildedRose(new Item[]{item});
        update(gildedRose, days);

        assertThat(gildedRose.items[0].sellIn, is(sellIn));
        assertThat(gildedRose.items[0].quality, is(quality));
    }

    @Test
    @Parameters({"1, 1, 1", "2, 0, 2", "3, -1, 4", "4, -2, 6", "5, -3, 8", "6, -4, 10", "7, -5, 12", "8, -6, 14", "9, -7, 16", "10, -8, 18", "11, -9, 20", "12, -10, 22", "13, -11, 24", "14, -12, 26", "15, -13, 28", "16, -14, 30", "17, -15, 32", "18, -16, 34", "19, -17, 36", "20, -18, 38", "21, -19, 40", "22, -20, 42", "23, -21, 44", "24, -22, 46", "25, -23, 48", "26, -24, 50", "27, -25, 50", "28, -26, 50", "29, -27, 50", "30, -28, 50"})
    public void item_changes_for_Aged_Brie(int days, int sellIn, int quality) {
        Item item = new Item("Aged Brie", 2, 0);
        GildedRose gildedRose = new GildedRose(new Item[]{item});
        update(gildedRose, days);

        assertThat(gildedRose.items[0].sellIn, is(sellIn));
        assertThat(gildedRose.items[0].quality, is(quality));
    }

    @Test
    @Parameters({"1, 4, 6", "2, 3, 5", "3, 2, 4", "4, 1, 3", "5, 0, 2", "6, -1, 0", "7, -2, 0", "8, -3, 0", "9, -4, 0", "10, -5, 0", "11, -6, 0", "12, -7, 0", "13, -8, 0", "14, -9, 0", "15, -10, 0", "16, -11, 0", "17, -12, 0", "18, -13, 0", "19, -14, 0", "20, -15, 0", "21, -16, 0", "22, -17, 0", "23, -18, 0", "24, -19, 0", "25, -20, 0", "26, -21, 0", "27, -22, 0", "28, -23, 0", "29, -24, 0", "30, -25, 0"})
    public void item_changes_for_Elixir_of_the_Mongoose(int days, int sellIn, int quality) {
        Item item = new Item("Elixir of the Mongoose", 5, 7);
        GildedRose gildedRose = new GildedRose(new Item[]{item});
        update(gildedRose, days);

        assertThat(gildedRose.items[0].sellIn, is(sellIn));
        assertThat(gildedRose.items[0].quality, is(quality));
    }
    @Test
    @Parameters({"1, 0, 80", "2, 0, 80", "3, 0, 80", "4, 0, 80", "5, 0, 80", "6, 0, 80", "7, 0, 80", "8, 0, 80", "9, 0, 80", "10, 0, 80", "11, 0, 80", "12, 0, 80", "13, 0, 80", "14, 0, 80", "15, 0, 80", "16, 0, 80", "17, 0, 80", "18, 0, 80", "19, 0, 80", "20, 0, 80", "21, 0, 80", "22, 0, 80", "23, 0, 80", "24, 0, 80", "25, 0, 80", "26, 0, 80", "27, 0, 80", "28, 0, 80", "29, 0, 80", "30, 0, 80"})
    public void item_changes_for_Sulfuras__Hand_of_Ragnaros_2(int days, int sellIn, int quality) {
        Item item = new Item("Sulfuras, Hand of Ragnaros", 0, 80);
        GildedRose gildedRose = new GildedRose(new Item[]{item});
        update(gildedRose, days);

        assertThat(gildedRose.items[0].sellIn, is(sellIn));
        assertThat(gildedRose.items[0].quality, is(quality));
    }
    @Test
    @Parameters({"1, -1, 80", "2, -1, 80", "3, -1, 80", "4, -1, 80", "5, -1, 80", "6, -1, 80", "7, -1, 80", "8, -1, 80", "9, -1, 80", "10, -1, 80", "11, -1, 80", "12, -1, 80", "13, -1, 80", "14, -1, 80", "15, -1, 80", "16, -1, 80", "17, -1, 80", "18, -1, 80", "19, -1, 80", "20, -1, 80", "21, -1, 80", "22, -1, 80", "23, -1, 80", "24, -1, 80", "25, -1, 80", "26, -1, 80", "27, -1, 80", "28, -1, 80", "29, -1, 80", "30, -1, 80"})
    public void item_changes_for_Sulfuras__Hand_of_Ragnaros_3(int days, int sellIn, int quality) {
        Item item = new Item("Sulfuras, Hand of Ragnaros", -1, 80);
        GildedRose gildedRose = new GildedRose(new Item[]{item});
        update(gildedRose, days);

        assertThat(gildedRose.items[0].sellIn, is(sellIn));
        assertThat(gildedRose.items[0].quality, is(quality));
    }
    @Test
    @Parameters({"1, 14, 21", "2, 13, 22", "3, 12, 23", "4, 11, 24", "5, 10, 25", "6, 9, 27", "7, 8, 29", "8, 7, 31", "9, 6, 33", "10, 5, 35", "11, 4, 38", "12, 3, 41", "13, 2, 44", "14, 1, 47", "15, 0, 50", "16, -1, 0", "17, -2, 0", "18, -3, 0", "19, -4, 0", "20, -5, 0", "21, -6, 0", "22, -7, 0", "23, -8, 0", "24, -9, 0", "25, -10, 0", "26, -11, 0", "27, -12, 0", "28, -13, 0", "29, -14, 0", "30, -15, 0"})
    public void item_changes_for_Backstage_passes_to_a_TAFKAL80ETC_concert(int days, int sellIn, int quality) {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20);
        GildedRose gildedRose = new GildedRose(new Item[]{item});
        update(gildedRose, days);

        assertThat(gildedRose.items[0].sellIn, is(sellIn));
        assertThat(gildedRose.items[0].quality, is(quality));
    }
    @Test
    @Parameters({"1, 9, 50", "2, 8, 50", "3, 7, 50", "4, 6, 50", "5, 5, 50", "6, 4, 50", "7, 3, 50", "8, 2, 50", "9, 1, 50", "10, 0, 50", "11, -1, 0", "12, -2, 0", "13, -3, 0", "14, -4, 0", "15, -5, 0", "16, -6, 0", "17, -7, 0", "18, -8, 0", "19, -9, 0", "20, -10, 0", "21, -11, 0", "22, -12, 0", "23, -13, 0", "24, -14, 0", "25, -15, 0", "26, -16, 0", "27, -17, 0", "28, -18, 0", "29, -19, 0", "30, -20, 0"})
    public void item_changes_for_Backstage_passes_to_a_TAFKAL80ETC_concert_2(int days, int sellIn, int quality) {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49);
        GildedRose gildedRose = new GildedRose(new Item[]{item});
        update(gildedRose, days);

        assertThat(gildedRose.items[0].sellIn, is(sellIn));
        assertThat(gildedRose.items[0].quality, is(quality));
    }
    @Test
    @Parameters({"1, 4, 50", "2, 3, 50", "3, 2, 50", "4, 1, 50", "5, 0, 50", "6, -1, 0", "7, -2, 0", "8, -3, 0", "9, -4, 0", "10, -5, 0", "11, -6, 0", "12, -7, 0", "13, -8, 0", "14, -9, 0", "15, -10, 0", "16, -11, 0", "17, -12, 0", "18, -13, 0", "19, -14, 0", "20, -15, 0", "21, -16, 0", "22, -17, 0", "23, -18, 0", "24, -19, 0", "25, -20, 0", "26, -21, 0", "27, -22, 0", "28, -23, 0", "29, -24, 0", "30, -25, 0"})
    public void item_changes_for_Backstage_passes_to_a_TAFKAL80ETC_concert_3(int days, int sellIn, int quality) {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49);
        GildedRose gildedRose = new GildedRose(new Item[]{item});
        update(gildedRose, days);

        assertThat(gildedRose.items[0].sellIn, is(sellIn));
        assertThat(gildedRose.items[0].quality, is(quality));
    }

    @Ignore
    @Test
    @Parameters({"1, 2, 14", "2, 1, 12", "3, 0, 10", "4, -1, 6", "5, -2, 2", "6, -3, 0", "7, -4, 0", "8, -5, 0", "9, -6, 0", "10, -7, 0", "11, -8, 0", "12, -9, 0", "13, -10, 0", "14, -11, 0", "15, -12, 0", "16, -13, 0", "17, -14, 0", "18, -15, 0", "19, -16, 0", "20, -17, 0", "21, -18, 0", "22, -19, 0", "23, -20, 0", "24, -21, 0", "25, -22, 0", "26, -23, 0", "27, -24, 0", "28, -25, 0", "29, -26, 0", "30, -27, 0"})
    public void item_changes_for_Conjured_Mana_Cake(int days, int sellIn, int quality) {
        Item item = new Item("Conjured Mana Cake", 3, 16);
        GildedRose gildedRose = new GildedRose(new Item[]{item});
        update(gildedRose, days);

        assertThat(gildedRose.items[0].sellIn, is(sellIn));
        assertThat(gildedRose.items[0].quality, is(quality));
    }

    private void update(GildedRose gildedRose, int days) {
        for(int i=0; i<days; i++) {
            gildedRose.updateQuality();
        }
    }
}
