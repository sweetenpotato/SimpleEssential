package io.github.sweetenpotato.simpleessential.plugin

import io.github.sweetenpotato.simpleessential.listener.CommandListener
import org.bukkit.Location
import org.bukkit.entity.Player
import org.bukkit.plugin.java.JavaPlugin
import kotlin.math.log

class SimpleEssential : JavaPlugin() {

    val backLocation = mutableMapOf<Player, Location>()

    private val commandListener = CommandListener(this)
    override fun onEnable() {
        logger
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}