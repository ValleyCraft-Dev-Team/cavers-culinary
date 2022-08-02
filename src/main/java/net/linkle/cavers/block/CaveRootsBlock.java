package net.linkle.cavers.block;

import net.linkle.cavers.init.ModItems;
import net.minecraft.block.AbstractBlock.Settings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldView;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropBlock;

public class CaveRootsBlock extends CropBlock {

    public CaveRootsBlock() {
        super(Settings.copy(Blocks.WHEAT));
    }
    
    @Override
    public Item asItem() {
        return super.asItem();
    }
    
    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        return (world.getBaseLightLevel(pos, 0) <= 7 || world.isSkyVisible(pos)) && super.canPlaceAt(state, world, pos);
    }
    
    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        int age;
        if (world.getBaseLightLevel(pos, 0) <= 7 && (age = this.getAge(state)) < this.getMaxAge() && random.nextInt((int)(25.0f / CropBlock.getAvailableMoisture(this, world, pos)) + 1) == 0) {
            world.setBlockState(pos, this.withAge(age + 1), Block.NOTIFY_LISTENERS);
        }
    }

    @Override
    public ItemConvertible getSeedsItem() {
        return ModItems.CAVE_ROOT_SEEDS;
    }
}
