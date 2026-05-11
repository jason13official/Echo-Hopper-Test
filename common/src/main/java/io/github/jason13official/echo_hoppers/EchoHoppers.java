package io.github.jason13official.echo_hoppers;

import net.minecraft.resources.ResourceLocation;

public class EchoHoppers {

  public static void init() {
    Constants.LOG.info("Hello, World!");
  }

  public static ResourceLocation id(String path) {
    return ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, path);
  }
}