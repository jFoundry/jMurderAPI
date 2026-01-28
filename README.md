# ![JMurderAPI](https://img.shields.io/badge/JMurderAPI-Public%20API-blue)  

[![Java Version](https://img.shields.io/badge/Java-25-orange)](https://www.java.com/) 
[![License](https://img.shields.io/badge/License-MIT-green)](LICENSE) 
[![Plugin](https://img.shields.io/badge/jMurder-Required-red)](https://builtbybit.com/resources/jmurder-hytale-murder-mystery-plugin.90745/)  

# JMurderAPI

[JMurder Plugin](https://builtbybit.com/resources/jmurder-hytale-murder-mystery-plugin.90745/) Public API

JMurderAPI is a simple Java API for accessing player statistics from the **JMurder Hytale Murder Mystery plugin**.  
It allows other plugins or applications to retrieve game stats like wins, kills, deaths, and games played for individual players.

---

## Features

- ✅ Get **Murder Wins** for a player  
- ✅ Get **Innocent Wins** for a player  
- ✅ Get **Total Wins** for a player  
- ✅ Get **Kills** for a player  
- ✅ Get **Deaths** for a player  
- ✅ Get **Games Played** by a player  

---

## Requirements

- JMurder Plugin installed and loaded on your Hytale server  
- UUID of the player whose stats you want to retrieve  

> ⚠️ Attempting to access the API without the JMurder plugin loaded will throw an `IllegalPluginAccessException`.

---

## Usage
import me.sevend.api.JMurderAPI;
import java.util.UUID;

```java
public class MyPlugin {

    private JMurderAPI api;

    public void exampleUsage(UUID playerUUID) {
        try {
            int murderWins = api.getMurderWins(playerUUID);
            int innocentWins = api.getInnocentWins(playerUUID);
            int totalWins = api.getTotalWins(playerUUID);
            int kills = api.getKills(playerUUID);
            int deaths = api.getDeaths(playerUUID);
            int gamesPlayed = api.getGamesPlayed(playerUUID);

            System.out.println("Player stats:");
            System.out.println("Murder Wins: " + murderWins);
            System.out.println("Innocent Wins: " + innocentWins);
            System.out.println("Total Wins: " + totalWins);
            System.out.println("Kills: " + kills);
            System.out.println("Deaths: " + deaths);
            System.out.println("Games Played: " + gamesPlayed);

        } catch (IllegalPluginAccessException e) {
            System.err.println("JMurder plugin is not loaded. Cannot access stats.");
        }
    }
}
```
