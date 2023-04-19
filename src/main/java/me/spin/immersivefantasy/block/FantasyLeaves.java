package me.spin.immersivefantasy.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class FantasyLeaves extends Block {

    public FantasyLeaves() {
        super(Properties.create(Material.LEAVES)
                .hardnessAndResistance(0.2f)
                .tickRandomly()
                .sound(SoundType.PLANT)
                .notSolid());
    }
}
