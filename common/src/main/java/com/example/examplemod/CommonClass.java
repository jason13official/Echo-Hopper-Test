package com.example.examplemod;

import com.example.examplemod.platform.Services;
import net.minecraft.world.item.ItemStack;

public class CommonClass {

  public static void init() {
    Constants.LOG.info("Hello, World!");
    Constants.LOG.info(Services.registry().getItem(ItemStack.EMPTY).getDescriptionId());
  }
}