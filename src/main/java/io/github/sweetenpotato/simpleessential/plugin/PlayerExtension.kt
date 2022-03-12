package io.github.sweetenpotato.simpleessential.plugin

import org.bukkit.ChatColor
import org.bukkit.Location
import org.bukkit.entity.Player

fun Player.sendInfoMessage(message: String) {
    this.sendMessage(
        "${ChatColor.WHITE}[${ChatColor.AQUA}Info${ChatColor.WHITE}] " + message
    )
}

fun Player.sendErrorMessage(message: String) {
    this.sendMessage(
        "${ChatColor.WHITE}[${ChatColor.RED}Error${ChatColor.WHITE}] " + message
    )
}

fun Player.teleportBackLocation(plugin: SimpleEssential) {
    if (plugin.backLocation.containsKey(this)) {
        this.sendInfoMessage(
            plugin.backLocation[this]!!.world.name + "의 (" + plugin.backLocation[this]!!.x.toString() + ", "
                    + plugin.backLocation[this]!!.y.toString() + ", "
                    + plugin.backLocation[this]!!.z.toString() + ")로 이동합니다."
        )
        this.teleport(plugin.backLocation[this]!!)
    }
    else {
        this.sendErrorMessage("이전으로 돌아갈 위치가 존재하지 않습니다!")
    }
}

fun Player.saveBackLocation(location: Location, plugin: SimpleEssential) {
    plugin.backLocation[this] = this.location.clone()
}