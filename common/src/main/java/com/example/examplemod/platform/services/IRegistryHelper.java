package com.example.examplemod.platform.services;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public interface IRegistryHelper {

  default Item getItem(ItemStack item) {
    return Items.DIAMOND;
  }

}
