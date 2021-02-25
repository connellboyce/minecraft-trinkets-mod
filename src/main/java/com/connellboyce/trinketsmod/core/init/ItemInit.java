package com.connellboyce.trinketsmod.core.init;

import com.connellboyce.trinketsmod.TrinketsMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TrinketsMod.MOD_ID);

    public static final RegistryObject<Item> CAYENNE_PEPPER = ITEMS.register("cayenne_pepper", () -> new Item(new Item.Properties().group(ItemGroup.FOOD)));
}
