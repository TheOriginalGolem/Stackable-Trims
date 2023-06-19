package org.stackabletrims.forge;

import dev.architectury.platform.forge.EventBuses;
import org.stackabletrims.StackableTrims;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(StackableTrims.MOD_ID)
public class stackabletrims {
    public stackabletrims() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(StackableTrims.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        StackableTrims.init();
    }
}
