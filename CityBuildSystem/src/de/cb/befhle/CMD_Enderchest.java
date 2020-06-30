//////////////////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
// Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
// Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
// Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
// Vestibulum commodo. Ut rhoncus gravida arcu.
//////////////////////////////////////////////////////////////////////////////////////////

package de.cb.befhle;

import de.cb.main.CityBuild;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class CMD_Enderchest implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player)sender;
        if (cmd.getName().equalsIgnoreCase("ec"))
            if (args.length == 0) {
                Inventory inventory = p.getEnderChest();
                p.openInventory(inventory);
                p.playSound(p.getLocation(), Sound.CHEST_OPEN, 2.0F, 2.0F);
            } else if (args.length == 1) {
                Player target = Bukkit.getPlayer(args[0]);
                if (target == null) {
                    p.sendMessage(CityBuild.Prefix + "Der Spieler" + args[0] + " ist §cnicht §7Online");
                    return true;
                }
                Inventory inventory = target.getEnderChest();
                p.openInventory(inventory);
            } else {
                p.sendMessage(CityBuild.use + "§c/ec <Spieler>");
            }
        return false;
    }
}
