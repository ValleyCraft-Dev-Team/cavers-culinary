package net.linkle.cavers.init;

import net.linkle.cavers.block.CaveRootsBlock;
import net.linkle.cavers.util.Reg;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.LanternBlock;
import net.minecraft.item.Item;

public class ModBlocks {
    
    public static final Block CAVE_ROOTS = new CaveRootsBlock();
    public static final Block GLOWSQUID_LANTERN = new LanternBlock(Block.Settings.copy(Blocks.LANTERN).luminance(s->12));
    
    public static void initialize() {
        Reg.register("cave_roots", CAVE_ROOTS);
        Reg.registerWithItem("glowsquid_lantern", GLOWSQUID_LANTERN, itemSettings());
    }
    
    private static final Item.Settings itemSettings() {
        return new Item.Settings();
    }
}
