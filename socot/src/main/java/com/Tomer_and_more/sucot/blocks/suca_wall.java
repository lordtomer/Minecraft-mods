package com.Tomer_and_more.sucot.blocks;


import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class suca_wall extends Block {
    public suca_wall() {
        super(Block.Properties.create(Material.ROCK)
                .hardnessAndResistance(1.5f, 30.0f)
                .sound(SoundType.CLOTH)
                .harvestLevel(3)
                .harvestTool(ToolType.AXE));
    }
}
