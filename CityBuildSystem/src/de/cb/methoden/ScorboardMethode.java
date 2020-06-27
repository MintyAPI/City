//////////////////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
// Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
// Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
// Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
// Vestibulum commodo. Ut rhoncus gravida arcu.
//////////////////////////////////////////////////////////////////////////////////////////

package de.cb.methoden;

import net.nifheim.beelzebu.coins.CoinsAPI;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;


public class ScorboardMethode {

    public static void setScoreboard(Player p) {
        final Scoreboard sb = Bukkit.getScoreboardManager().getNewScoreboard();
        final Objective obj = sb.registerNewObjective("111", "222");

        obj.setDisplaySlot(DisplaySlot.SIDEBAR);
        obj.setDisplayName("§f§l•● §b§lCityBuild §f§l●•");

        obj.getScore("§1 ").setScore(15);
        obj.getScore("§8•● §6Profil").setScore(14);
        obj.getScore("§8➥ §a§ " + p.getName()).setScore(13);
        obj.getScore("§2 ").setScore(12);
        obj.getScore("§8•● §6Rang").setScore(11);
        if(p.hasPermission("sc.Admin"))
            obj.getScore("§8➥ §4Admin").setScore(10);
        else if(p.hasPermission("sc.Leitung"))
            obj.getScore("§8➥ §cLeitung").setScore(10);
        else if(p.hasPermission("sc.SrDev"))
            obj.getScore("§8➥ §bSrDeveloper").setScore(10);
        else if(p.hasPermission("sc.Developer"))
            obj.getScore("§8➥ §bDeveloper").setScore(10);
        else if(p.hasPermission("sc.SrModerator"))
            obj.getScore("§8➥ §9SrModerator").setScore(10);
        else if(p.hasPermission("sc.Moderator"))
            obj.getScore("§8➥ §9Moderator").setScore(10);
        else if(p.hasPermission("sc.Supporter"))
            obj.getScore("§8➥ §2Supporter").setScore(10);
        else if(p.hasPermission("sc.T-Supporter"))
            obj.getScore("§8➥ §2Test§7-§2Supporter").setScore(10);
        else if(p.hasPermission("sc.SrBuilder"))
            obj.getScore("§8➥ §6SrBuilder").setScore(10);
        else if(p.hasPermission("sc.Builder"))
            obj.getScore("§8➥ §6Builder").setScore(10);
        else if (p.hasPermission("sc.Spieler"))
            obj.getScore("§8➥ §7Spieler").setScore(10);
        obj.getScore("§4 ").setScore(9);
        obj.getScore("§8•● §7Money").setScore(8);
        obj.getScore("§8➥ §b§l" + CoinsAPI.getCoins(p.getUniqueId().toString())).setScore(7);
        obj.getScore("§8•● §6TeamSpeak").setScore(6);
        obj.getScore("§8➥ §b§lSuchtingCloud.net").setScore(5);
        obj.getScore("§6 ").setScore(4);
        p.setScoreboard(sb);
    }
}
