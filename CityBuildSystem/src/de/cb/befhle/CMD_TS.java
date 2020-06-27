//////////////////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
// Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
// Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
// Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
// Vestibulum commodo. Ut rhoncus gravida arcu.
//////////////////////////////////////////////////////////////////////////////////////////

package de.cb.befhle;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CMD_TS implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command CMD, String label, String[] args) {
        Player p = (Player) sender;
        p.sendMessage("§f§l=========================================");
        p.sendMessage(" ");
        p.sendMessage("§7Schau doch mal auf unserem Teamspeak Server vorbei");
        p.sendMessage("§bTeamspeak§7:§9 SuchtingCloud.net");
        p.sendMessage(" ");
        p.sendMessage("§f§l=========================================");
        return false;
    }
}
