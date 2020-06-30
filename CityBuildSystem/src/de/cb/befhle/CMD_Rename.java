//////////////////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
// Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
// Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
// Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
// Vestibulum commodo. Ut rhoncus gravida arcu.
//////////////////////////////////////////////////////////////////////////////////////////

package de.cb.befhle;

import de.cb.main.CityBuild;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CMD_Rename implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player)sender;
        if (cmd.getName().equalsIgnoreCase("rename") &&
                p.hasPermission("cbs.rename")) {
            if (args.length == 0) {
                p.sendMessage(CityBuild.use + "§c/rename <Name>");
                return true;
            }
            if (p.getItemInHand().getType().equals(Material.AIR)) {
                p.sendMessage(CityBuild.Prefix + "Du musst ein Item in der Hand halten");
                return true;
            }
            ItemStack item = p.getItemInHand();
            String name = "";
            for (int i = 0; i < args.length; i++)
                name = name + " " + args[i].replaceAll("&", "§");
                        ItemMeta itemStackMeta = item.getItemMeta();
            itemStackMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', name));
            item.setItemMeta(itemStackMeta);
            p.sendMessage(CityBuild.Prefix + "Du hast das Item §aerfolgreich §7umbenannt");
            p.playSound(p.getLocation(), Sound.NOTE_PLING, 2.0F, 2.0F);
        }
        return false;
    }
}
