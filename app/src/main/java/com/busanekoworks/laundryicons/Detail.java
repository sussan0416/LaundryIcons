package com.busanekoworks.laundryicons;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Busaneko Works on 2017/01/09.
 */
public enum Detail {
    WASHING(Category.WASHING, new ArrayList<>(Arrays.asList(
            new Item(R.string.washing_title, R.drawable.wash, R.string.washing_description),
            new Item(R.string.washing_title_hand, R.drawable.wash_hand, 0),
            new Item(R.string.washing_title_disable, R.drawable.wash_disable, 0)
    ))),
    BLEACHING(Category.BLEACHING, new ArrayList<>(Arrays.asList(
            new Item(R.string.bleaching_title, R.drawable.bleach, 0),
            new Item(R.string.bleaching_title_oxygen, R.drawable.bleach_oxygen, R.string.bleaching_description_oxygen),
            new Item(R.string.bleaching_title_disable, R.drawable.bleach_disable, 0)
    ))),
    DRYING(Category.DRYING, new ArrayList<>(Arrays.asList(
            new Item(R.string.drying_title_line, R.drawable.dry_line, R.string.drying_description_line),
            new Item(R.string.drying_title_line_shade, R.drawable.dry_line_shade, R.string.drying_description_line_shade),
            new Item(R.string.drying_title_flat, R.drawable.dry_flat, R.string.drying_description_flat),
            new Item(R.string.drying_title_flat_shade, R.drawable.dry_flat_shade, R.string.drying_description_flat_shade),
            new Item(R.string.drying_title_tumbler, R.drawable.dry_tumbler, R.string.drying_description_tumbler),
            new Item(R.string.drying_title_tumbler_disable, R.drawable.dry_tumbler_disable, 0)
    ))),
    IRON(Category.IRON, new ArrayList<>(Arrays.asList(
            new Item(R.string.iron_title, R.drawable.ironing, R.string.iron_description),
            new Item(R.string.iron_title_disable, R.drawable.iron_disable, 0)
    ))),
    CLEANING(Category.CLEANING, new ArrayList<>(Arrays.asList(
            new Item(R.string.cleaning_title_tetra, R.drawable.clean_tetra, R.string.cleaning_description_tetra),
            new Item(R.string.cleaning_title_fuel, R.drawable.clean_fuel, R.string.cleaning_description_fuel),
            new Item(R.string.cleaning_title_disable, R.drawable.clean_disable, 0),
            new Item(R.string.cleaning_title_wet, R.drawable.clean_wet, R.string.cleaning_description_wet),
            new Item(R.string.cleaning_title_wet_disable, R.drawable.clean_wat_disable, 0)
    )));

    private final Category mCategory;

    private final ArrayList<Item> mItems;

    Detail(Category category, ArrayList<Item> items) {
        mCategory = category;
        mItems = items;
    }

    public static ArrayList<Item> getItemsForCategory(int categoryNumber) {
        for (Category category : Category.values()) {
            if (category.ordinal() == categoryNumber) {
                return getItemsForCategory(category);
            }
        }

        throw new IllegalArgumentException();
    }

    public static ArrayList<Item> getItemsForCategory(Category category) {
        for (Detail detail : values()) {
            if (detail.mCategory == category) {
                return detail.getItems();
            }
        }

        throw new IllegalArgumentException();
    }

    public ArrayList<Item> getItems() {
        return mItems;
    }
}
