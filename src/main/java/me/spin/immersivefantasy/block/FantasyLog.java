package me.spin.immersivefantasy.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class FantasyLog extends Block {

    public FantasyLog() {
        super(Properties.create(Material.WOOD)
                .hardnessAndResistance(2.0f)
                .sound(SoundType.WOOD)
                .harvestTool(ToolType.AXE)
                .harvestLevel(0));
    }
}
