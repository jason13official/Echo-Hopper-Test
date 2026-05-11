package io.github.jason13official.echo_hoppers;

import io.github.jason13official.echo_hoppers.impl.common.registry.ModBlocks;
import io.github.jason13official.echo_hoppers.impl.common.registry.ModItems;
import io.github.jason13official.echo_hoppers.impl.common.registry.ModTabs;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.RegisterEvent;

@Mod(Constants.MOD_ID)
public class EchoHoppersNeoForge {

  public static IEventBus EVENT_BUS;

  public EchoHoppersNeoForge(IEventBus modEventBus) {

    EVENT_BUS = modEventBus;

    EchoHoppers.init();

    bind(Registries.BLOCK, ModBlocks::register);
    bind(Registries.ITEM, ModItems::register);
    bind(Registries.CREATIVE_MODE_TAB, ModTabs::register);
  }

  public <T> void bind(ResourceKey<Registry<T>> registry, Consumer<BiConsumer<T, ResourceLocation>> source) {
//    source.accept((t, rl) -> Registry.register(registry, rl, t));

    EVENT_BUS.addListener((Consumer<RegisterEvent>) event -> {
      if (registry.equals(event.getRegistryKey())) {
        source.accept((t, rl) -> event.register(registry, rl, () -> t));
      }
    });
  }
}