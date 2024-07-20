package com.mora.item;

import com.mora.Mora;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class items {
    public static final Item MORA = regItem("mora",
            new Item(new FabricItemSettings()));
    private static Item regItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Mora.MOD_ID, name), item);
    }
    public static void registerModItems() {
        Mora.LOGGER.debug("Mora正在注册Items，MOD_ID:" + Mora.MOD_ID);
    }
}