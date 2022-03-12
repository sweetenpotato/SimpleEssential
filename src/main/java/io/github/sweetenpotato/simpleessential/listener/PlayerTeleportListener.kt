package io.github.sweetenpotato.simpleessential.listener

import io.github.sweetenpotato.simpleessential.plugin.SimpleEssential
import io.github.sweetenpotato.simpleessential.plugin.saveBackLocation
import org.bukkit.event.EventHandler
import org.bukkit.event.player.PlayerTeleportEvent

class PlayerTeleportListener(private val plugin: SimpleEssential) {
    @EventHandler
    fun playerTeleportEvent(event:PlayerTeleportEvent) {
        event.player.saveBackLocation(event.from, plugin)
    }
}