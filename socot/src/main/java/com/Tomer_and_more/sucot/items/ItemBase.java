package com.Tomer_and_more.sucot.items;

import net.minecraft.item.Item;
import com.Tomer_and_more.sucot.sucot;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {
    public ItemBase() {
        super(new Item.Properties().group(sucot.TAB));
    }
}
