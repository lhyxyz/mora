package com.mora.item;

import com.mora.Mora;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class items {
    public static final Item MORA = regItem("mora", new Item(new FabricItemSettings()));
    public static final Item intertwined_fate = regItem("intertwined_fate", new Item(new FabricItemSettings()));
    public static final Item credit = regItem("credit", new Item(new FabricItemSettings()));
    public static final Item pass = regItem("pass", new Item(new FabricItemSettings()));
    public static final Item denny = regItem("denny", new Item(new FabricItemSettings()));
    public static final Item tape = regItem("tape", new Item(new FabricItemSettings()));

    private static Item regItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Mora.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Mora.LOGGER.debug("Registering mod item :" + Mora.MOD_ID);
    }
}