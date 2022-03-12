package io.github.sweetenpotato.simpleessential.plugin

import org.bukkit.ChatColor
import java.util.logging.Logger

fun Logger.sendInfoMessage(message: String){
    this.info(
        "${ChatColor.WHITE}[${ChatColor.AQUA}Info${ChatColor.WHITE}] " + message
    )
}

fun Logger.sendErrorMessage(message: String) {
    this.info(
        "${ChatColor.WHITE}[${ChatColor.RED}Error${ChatColor.WHITE}] " + message
    )
}