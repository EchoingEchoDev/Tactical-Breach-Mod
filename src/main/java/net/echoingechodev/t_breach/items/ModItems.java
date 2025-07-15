package net.echoingechodev.t_breach.items;

import net.echoingechodev.t_breach.TacticalBreach;
import net.echoingechodev.t_breach.blocks.ModBlocks;
import net.echoingechodev.t_breach.items.custom.FuseBoxItem;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;

public class ModItems {
    // Create a Deferred Register to hold Items which will all be registered under the "examplemod" namespace
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TacticalBreach.MODID);

    // Creates a new BlockItem with the id "examplemod:example_block", combining the namespace and path
    public static final DeferredItem<BlockItem> EXAMPLE_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("example_block", ModBlocks.EXAMPLE_BLOCK);

    // Creates a new food item with the id "examplemod:example_id", nutrition 1 and saturation 2
    public static final DeferredItem<Item> EXAMPLE_ITEM = ITEMS.registerSimpleItem("example_item", new Item.Properties().food(new FoodProperties.Builder()
            .alwaysEdible().nutrition(1).saturationModifier(2f).build()));

    public static final DeferredItem<Item> FUSE_BOX = ITEMS.registerItem("fuse_box", (Function<Item.Properties, ? extends Item>) new FuseBoxItem(Blocks.REDSTONE_WIRE, new Item.Properties().stacksTo(1).durability(50)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
