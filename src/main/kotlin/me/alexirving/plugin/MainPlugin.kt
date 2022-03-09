package me.alexirving.plugin

import org.bukkit.plugin.java.JavaPlugin

class MainPlugin : JavaPlugin() {
    override fun onEnable() {
        logger.info("Started Example Plugin!")
    }
}

/**
 * Template made by Alex Irving https://github.com/shmezi
 */