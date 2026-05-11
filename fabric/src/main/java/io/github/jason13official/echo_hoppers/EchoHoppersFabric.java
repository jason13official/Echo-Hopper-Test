package io.github.jason13official.echo_hoppers;

import net.fabricmc.api.ModInitializer;

public class EchoHoppersFabric implements ModInitializer {

  @Override
  public void onInitialize() {
    EchoHoppers.init();
  }
}
