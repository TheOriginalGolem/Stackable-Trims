package org.stackabletrims;

import dev.architectury.event.events.common.TickEvent;
import dev.architectury.event.events.common.TickEvent.*;
import net.minecraft.server.MinecraftServer;



public class ServerTickListener implements TickEvent.Server {

    public static MinecraftServer currentServer;

    @Override
    public void tick(MinecraftServer server) {
        currentServer = server;
    }
}
