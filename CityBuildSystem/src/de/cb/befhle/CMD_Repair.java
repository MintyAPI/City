//////////////////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
// Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
// Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
// Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
// Vestibulum commodo. Ut rhoncus gravida arcu.
//////////////////////////////////////////////////////////////////////////////////////////

package de.cb.befhle;

import de.cb.main.CityBuild;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class CMD_Repair implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player)sender;
        if (cmd.getName().equalsIgnoreCase("repair"))
            if (p.hasPermission("cbs.repair")) {
                if (args.length == 0) {
                    ItemStack itemStack = p.getItemInHand();
                    if (itemStack != null || itemStack.getType() != Material.AIR) {
                        itemStack.setDurability((short)0);
                        p.getInventory().setItemInHand(itemStack);
                        p.playSound(p.getLocation(), Sound.WOOD_CLICK, 3.0F, 3.0F);
                        p.sendMessage(CityBuild.Prefix + "Das Item wurde repariert");
                    } else {
                        p.sendMessage(CityBuild.Prefix + "Du musst ein Item in der Hand halten");
                    }
                } else {
                    p.sendMessage(CityBuild.use + "/repair");
                }
            } else {
                p.sendMessage(CityBuild.noPerm);
            }
        return false;
    }
}
