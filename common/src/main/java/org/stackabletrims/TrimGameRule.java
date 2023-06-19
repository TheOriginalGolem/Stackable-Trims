package org.stackabletrims;

import net.minecraft.world.GameRules;

public class TrimGameRule {
    public static GameRules.Key<GameRules.IntRule> MAX_TRIM_STACK;

    public static void setupGamerules() {
        MAX_TRIM_STACK = GameRules.register("maxTrimStack", GameRules.Category.MISC, GameRules.IntRule.create(100));
    }

}
