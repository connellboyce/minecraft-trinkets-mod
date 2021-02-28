package com.connellboyce.trinketsmod.core.init;

import com.connellboyce.trinketsmod.TrinketsMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TrinketsMod.MOD_ID);
    public static final RegistryObject<Block> BAMBOO_PLANKS = BLOCKS.register("bamboo_planks", () -> new Block(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.EMERALD).hardnessAndResistance(2f, 3f).harvestTool(ToolType.AXE).harvestLevel(-1).sound(SoundType.BAMBOO)));
}
