package me.sevend.api;

import me.sevend.IllegalPluginAccessException;

import java.util.UUID;

public class JMurderAPI {

    public int getMurderWins(UUID uuid) {
        throw new IllegalPluginAccessException("API is not registered. JMurder plugin must be loaded.");
    }

    public int getInnocentWins(UUID uuid) {
        throw new IllegalPluginAccessException("API is not registered. JMurder plugin must be loaded.");
    }

    public int getTotalWins(UUID uuid) {
        throw new IllegalPluginAccessException("API is not registered. JMurder plugin must be loaded.");
    }

    public int getKills(UUID uuid) {
        throw new IllegalPluginAccessException("API is not registered. JMurder plugin must be loaded.");
    }

    public int getGamesPlayed(UUID uuid) {
        throw new IllegalPluginAccessException("API is not registered. JMurder plugin must be loaded.");
    }

    public int getDeaths(UUID uuid) {
        throw new IllegalPluginAccessException("API is not registered. JMurder plugin must be loaded.");
    }
}
