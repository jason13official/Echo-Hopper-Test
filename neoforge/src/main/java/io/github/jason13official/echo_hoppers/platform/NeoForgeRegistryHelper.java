package io.github.jason13official.echo_hoppers.platform;

import io.github.jason13official.echo_hoppers.platform.services.IRegistryHelper;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTab.Builder;

public class NeoForgeRegistryHelper implements IRegistryHelper {

  @Override
  public Builder tabBuilder() {
    return CreativeModeTab.builder();
  }
}
