package net.arsonist.glyphcraft.block.entity;

import net.arsonist.glyphcraft.item.inventory.ImplementedInventory;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;

public class ScribingTableBlockEntity extends BlockEntity implements NamedScreenHandlerFactory, ImplementedInventory {
    public ScribingTableBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.SCRIBING_TABLE, pos, state);
    }

    @Override
    public Text getDisplayName() {
        return null;
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
        return null;
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return null;
    }
}
