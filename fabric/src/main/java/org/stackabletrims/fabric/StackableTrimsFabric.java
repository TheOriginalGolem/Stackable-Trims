package org.stackabletrims.fabric;

import org.stackabletrims.StackableTrims;
import net.fabricmc.api.ModInitializer;

public class StackableTrimsFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        StackableTrims.init();
    }
}
