package io.github.jason13official.echo_hoppers.impl.common.registry;

import io.github.jason13official.echo_hoppers.EchoHoppers;
import java.util.function.BiConsumer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;

public class ModItems {

  public static void register(BiConsumer<Item, ResourceLocation> consumer) {

    consumer.accept(new BlockItem(ModBlocks.ECHO_HOPPER, new Properties()), EchoHoppers.id("echo_hopper"));
  }
}
