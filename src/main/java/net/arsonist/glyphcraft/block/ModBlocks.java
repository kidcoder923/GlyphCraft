package net.arsonist.glyphcraft.block;

import net.arsonist.glyphcraft.Glyph;
import net.arsonist.glyphcraft.block.custom.ScribingTableBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block SCRIBING_TABLE = registerBlock("scribing_table",
            new ScribingTableBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque()), ItemGroup.MISC);




    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(Glyph.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(Glyph.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        Glyph.LOGGER.info("Registering ModBlocks for " + Glyph.MOD_ID);
    }

}
