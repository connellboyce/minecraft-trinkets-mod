package com.connellboyce.trinketsmod.core.init;

import com.connellboyce.trinketsmod.TrinketsMod;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TrinketsMod.MOD_ID);

    //Regular Items
    public static final RegistryObject<Item> CAYENNE_PEPPER = ITEMS.register("cayenne_pepper", () -> new Item(new Item.Properties().group(ItemGroup.FOOD)));

    //Block Items
    public static final RegistryObject<BlockItem> BAMBOO_PLANKS = ITEMS.register("bamboo_planks", () -> new BlockItem(BlockInit.BAMBOO_PLANKS.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
}
