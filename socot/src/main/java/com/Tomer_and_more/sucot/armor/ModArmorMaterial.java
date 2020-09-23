package com.Tomer_and_more.sucot.armor;

import com.Tomer_and_more.sucot.sucot;
import com.Tomer_and_more.sucot.util.RegistryHandler;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public enum ModArmorMaterial implements IArmorMaterial {

    HILOK(sucot.MOD_ID + ":hilok", 50, new int[] {100, 0, 0, 0}, 50,
            SoundEvents.AMBIENT_CAVE, 40.0f, () -> {return Ingredient.fromItems(RegistryHandler.SUCA_WALL_ITEM.get())});

    private static final int[] MAX_DAMAGE_ARRAY = new int[] {11, 16, 15, 13};
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageRedactionArray;
    private final int enchantAbility;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final Supplier<Ingredient> repairMaterial;

    ModArmor(String name, int maxDamageFactor, int[] damageRedactionArray,
             int enchantAbility, SoundEvent soundEvent, float toughness, Supplier<Ingredient> repairMaterial){
        this.name = name;
        this.maxDamageFactor = maxDamageFactor;
        this.damageRedactionArray = damageRedactionArray;
        this.enchantAbility = enchantAbility;
        this.soundEvent = soundEvent;
        this.toughness = toughness;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getDurability(EquipmentSlotType slotIn) {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return this.damageRedactionArray[slotIn.getIndex()] * 100;
    }

    @Override
    public int getEnchantability() {
        return enchantAbility;
    }

    @Override
    public SoundEvent getSoundEvent() {
        return this.soundEvent;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return this.repairMaterial.get();
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }
}
