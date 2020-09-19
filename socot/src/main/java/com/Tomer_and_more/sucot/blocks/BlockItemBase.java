package com.Tomer_and_more.sucot.blocks;

import com.Tomer_and_more.sucot.sucot;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class BlockItemBase extends BlockItem {
    public BlockItemBase(Block block) {
        super(block, new Item.Properties().group(sucot.TAB));
    }
}
