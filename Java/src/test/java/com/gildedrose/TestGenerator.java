package com.gildedrose;

public class TestGenerator {

    public static void main(String[] args) {
        Item[] items = new Item[] {
                new Item("+5 Dexterity Vest", 10, 20),
                new Item("Aged Brie", 2, 0),
                new Item("Elixir of the Mongoose", 5, 7),
                new Item("Sulfuras, Hand of Ragnaros", 0, 80),
                new Item("Sulfuras, Hand of Ragnaros", -1, 80),
                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
                new Item("Conjured Mana Cake", 3, 6) };

        int days = 30;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        for (Item item : items)
            generateTestCode(item, days);
    }

    private static void generateTestCode(Item item, int days) {
        GildedRose app = new GildedRose(new Item[]{item});

        System.out.println("@Test");
        System.out.print("@Parameters({");
        String initialCreation = String.format("\tItem item = new Item(\"%s\", %d, %d);", item.name, item.sellIn, item.quality);
        for (int i = 1; i < days; i++) {
            app.updateQuality();
            System.out.printf("\"%d, %d, %d\", ", i, item.sellIn, item.quality);
        }
        app.updateQuality();
        System.out.printf("\"%d, %d, %d\"}", days, item.sellIn, item.quality);
        System.out.println(")");

        System.out.printf("public void item_changes_for_%s(int days, int sellIn, int quality) {\n", item.name.replaceAll("[\\s,]", "_"));
        System.out.println(initialCreation);
        System.out.println("\tGildedRose gildedRose = new GildedRose(new Item[]{item});");
        System.out.println("\tupdate(gildedRose, days);");
        System.out.println();
        System.out.println("\tassertThat(gildedRose.items[0].sellIn, is(sellIn));");
        System.out.println("\tassertThat(gildedRose.items[0].quality, is(quality));");
        System.out.println("}");
    }
}
