package com.Tomer_and_more.sucot.util;

import com.Tomer_and_more.sucot.armor.ModArmorMaterial;
import com.Tomer_and_more.sucot.blocks.BlockItemBase;
import com.Tomer_and_more.sucot.blocks.suca_wall;
import com.Tomer_and_more.sucot.items.ItemBase;
import com.Tomer_and_more.sucot.sucot;
import net.minecraft.block.Block;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.rmi.registry.Registry;

public class RegistryHandler {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, sucot.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, sucot.MOD_ID);

    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
//ITEMS
    public static final RegistryObject<Item> LULAV = ITEMS.register("lulav", ItemBase::new);
    public static final RegistryObject<Item> ATROG = ITEMS.register("atrog", ItemBase::new);

//BLOCKS
    public static final RegistryObject<Block> SUCA_WALL = BLOCKS.register("suca_wall", suca_wall::new);

//BLOCK ITEMS
    public static final RegistryObject<Item> SUCA_WALL_ITEM = ITEMS.register("suca_wall", () -> new BlockItemBase(SUCA_WALL.get()));
//KIPA
    RegistryObject<ArmorItem> HILOK = ITEMS.register("hilok", () -> new ArmorItem(ModArmorMaterial.HILOK,
        EquipmentSlotType.HEAD, new Item.Properties().group(sucot.TAB)));
}
