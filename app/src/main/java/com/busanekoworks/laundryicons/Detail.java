package com.busanekoworks.laundryicons;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Busaneko Works on 2017/01/09.
 */
public enum Detail {
    WASHING(Category.WASHING, new ArrayList<>(Arrays.asList(
            new Item(0, 0, 0)
    ))),
    BLEACHING(Category.BLEACHING, new ArrayList<>(Arrays.asList(
            new Item(0, 0, 0)
    ))),
    DRYING(Category.DRYING, new ArrayList<>(Arrays.asList(
            new Item(0, 0, 0)
    ))),
    IRON(Category.IRON, new ArrayList<>(Arrays.asList(
            new Item(0, 0, 0)
    ))),
    CLEANING(Category.CLEANING, new ArrayList<>(Arrays.asList(
            new Item(0, 0, 0)
    )));

    private final Category mCategory;

    private final ArrayList<Item> mItems;

    Detail(Category category, ArrayList<Item> items) {
        mCategory = category;
        mItems = items;
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
