package io.github.jason13official.echo_hoppers.platform.services;

import com.google.common.cache.CacheBuilder;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTab.Builder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public interface IRegistryHelper {

  default Item getItem(ItemStack item) {
    return Items.DIAMOND;
  }

  Builder tabBuilder();
}
