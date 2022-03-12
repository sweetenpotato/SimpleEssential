package io.github.sweetenpotato.simpleessential.listener

import io.github.sweetenpotato.simpleessential.plugin.SimpleEssential
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class CommandListener(val plugin: SimpleEssential) : CommandExecutor {

    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        val commandName = command.name
        if (sender !is Player) {
            if (commandName.equals("back", true)){
                if (args.isEmpty()) {

                }
            }
        }
        else {
            return true
        }
        return true
    }
}