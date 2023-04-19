package me.spin.immersivefantasy.block;

import me.spin.immersivefantasy.ImmersiveFantasy;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ImmersiveFantasy.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BlockInit {

    public static final Block fantasy_log = register("fantasy_log", new FantasyLog());
    public static final Block fantasy_leaves = register("fantasy_leaves", new FantasyLeaves());

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                fantasy_log,
                fantasy_leaves
        );
    }

    @SubscribeEvent
    public static void registerBlockItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                new BlockItem(fantasy_log, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(fantasy_log.getRegistryName().toString().replace("block", "item")),
                new BlockItem(fantasy_leaves, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(fantasy_leaves.getRegistryName().toString().replace("block", "item"))
        );
    }


    private static Block register(String name, Block block) {
        block.setRegistryName(new ResourceLocation(ImmersiveFantasy.MOD_ID, name));
        return block;
    }
}
