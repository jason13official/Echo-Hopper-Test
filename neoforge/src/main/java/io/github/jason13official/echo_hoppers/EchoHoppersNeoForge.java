package io.github.jason13official.echo_hoppers;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class EchoHoppersNeoForge {

  public EchoHoppersNeoForge(IEventBus modEventBus) {
    EchoHoppers.init();
  }
}