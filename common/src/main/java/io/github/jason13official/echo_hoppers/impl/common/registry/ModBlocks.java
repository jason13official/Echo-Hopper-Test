package io.github.jason13official.echo_hoppers.impl.common.registry;

import io.github.jason13official.echo_hoppers.Constants;
import io.github.jason13official.echo_hoppers.EchoHoppers;
import io.github.jason13official.echo_hoppers.impl.common.block.EchoHopperBlock;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class ModBlocks {

  public static Block ECHO_HOPPER;

  public static void register(BiConsumer<Block, ResourceLocation> consumer) {

    ECHO_HOPPER = new EchoHopperBlock(BlockBehaviour.Properties.of());

    consumer.accept(ECHO_HOPPER, EchoHoppers.id("echo_hopper"));
  }

//  // in common code
//  public static void acceptValues(BiConsumer<Integer, String> consumer) {
//    System.out.println("acceptValues");
//    consumer.accept(2, "Blue");
//    consumer.accept(3, "Green");
//  }
//
//  // do something with those values as a method
//  static void operateOnValues(Consumer<BiConsumer<Integer, String>> source) {
//    System.out.println("operateOnValues");
//    source.accept((i, s) -> System.out.println(s + " " + i));
//  }
//
//  // in mod loader entrypoint
//  public static void main(String[] args) {
//    System.out.println("main");
//    operateOnValues(ModBlocks::acceptValues);
//  }
}
