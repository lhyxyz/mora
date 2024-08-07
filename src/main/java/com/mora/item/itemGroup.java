package com.mora.item;

import com.mora.Mora;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class itemGroup {
    public static final ItemGroup SILVER_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Mora.MOD_ID, "mora"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.mora"))
                    .icon(() -> new ItemStack(items.mora)).entries((displayContext, entries) -> {
                        entries.add(items.mora);
                        entries.add(items.primogem);
                        entries.add(items.intertwined_fate);
                        entries.add(items.credit);
                        entries.add(items.stellar);
                        entries.add(items.pass);
                        entries.add(items.denny);
                        entries.add(items.polychrome);
                        entries.add(items.tape);
                    }).build());

    public static void registerModItemGroup(){
        Mora.LOGGER.debug("Registering mod item group for"+ Mora.MOD_ID);
    }
}
