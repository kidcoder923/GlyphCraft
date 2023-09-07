package net.arsonist.glyphcraft.block.entity;

import net.arsonist.glyphcraft.Glyph;
import net.arsonist.glyphcraft.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlockEntities {
    public static BlockEntityType<ScribingTableBlockEntity> SCRIBING_TABLE;

    public static void registerAllBlockEntities() {
        SCRIBING_TABLE = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                new Identifier(Glyph.MOD_ID, "scribing_table"),
                FabricBlockEntityTypeBuilder.create(ScribingTableBlockEntity::new,
                        ModBlocks.SCRIBING_TABLE).build(null));
    }
}
