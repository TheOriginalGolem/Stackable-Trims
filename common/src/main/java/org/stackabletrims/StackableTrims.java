package org.stackabletrims;

import dev.architectury.event.events.common.TickEvent;
import org.stackabletrims.ServerTickListener.*;

public class StackableTrims {
    public static final String MOD_ID = "examplemod";

    public static void init() {

        TrimGameRule.setupGamerules();
        TickEvent.SERVER_POST.register(new ServerTickListener());
        
        System.out.println(ExampleExpectPlatform.getConfigDirectory().toAbsolutePath().normalize().toString());

    }
}
