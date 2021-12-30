package com.github.bravelypeculiar.anisoc;

import com.github.bravelypeculiar.anisoc.content.Blocks;
import com.github.bravelypeculiar.anisoc.content.Items;
import net.fabricmc.api.ModInitializer;

public class AnisocMod implements ModInitializer {
    public static Blocks BLOCKS;
    public static Items ITEMS;

    @Override
    public void onInitialize() {
        Blocks blocks = new Blocks();
        Items items = new Items(blocks);

        BLOCKS = blocks;
        ITEMS = items;

        blocks.register();
        items.register();
    }
}
