package io.github.jason13official.echo_hoppers.impl.common.registry;

import io.github.jason13official.echo_hoppers.Constants;
import io.github.jason13official.echo_hoppers.EchoHoppers;
import io.github.jason13official.echo_hoppers.platform.Services;
import java.util.function.BiConsumer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModTabs {

  public static CreativeModeTab ECHO_HOPPERS;

  public static void register(BiConsumer<CreativeModeTab, ResourceLocation> consumer) {

    ECHO_HOPPERS = Services.registry().tabBuilder()
        .icon(() -> new ItemStack(ModBlocks.ECHO_HOPPER))
        .title(Component.translatable("itemGroup.echoHoppers"))
        .displayItems((itemDisplayParameters, output) -> {
          output.accept(ModBlocks.ECHO_HOPPER);
        }).build();

    consumer.accept(ECHO_HOPPERS, EchoHoppers.id(Constants.MOD_ID));
  }
}
