package net.linkle.cavers.init;

import net.linkle.cavers.util.Reg;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;

public class ModItems {
    
    public static final Item CAVE_ROOT_SEEDS = Reg.register("cave_root_seeds", new AliasedBlockItem(ModBlocks.CAVE_ROOTS, itemSettings()));
    public static final Item CAVE_ROOT = Reg.register("cave_root", new Item(itemSettings()));

    public static void initialize() {
        
    }
    
    private static final Item.Settings itemSettings() {
        return new Item.Settings();
    }
}
