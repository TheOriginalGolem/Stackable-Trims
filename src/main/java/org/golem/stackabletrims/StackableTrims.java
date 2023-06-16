package org.golem.stackabletrims;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;

public class StackableTrims implements ModInitializer {

    @Override
    public void onInitialize() {
        GameRules.setupGamerules();
        ServerTickEvents.END_SERVER_TICK.register(new ServerTickListener());
    }
}
