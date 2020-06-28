package de.cb.main;

import de.cb.Listeners.JoinListener;
import de.cb.Listeners.QuitListener;
import de.cb.befhle.*;
import org.bukkit.plugin.java.JavaPlugin;

public class CityBuild extends JavaPlugin {

    public static String Prefix = "§7[§9CityBuild§7] ";
    public static String noPerm = "§7Dazu hast du keine §cRechte§7!";
    public static String notfound = "§7Der §cSpieler §7wurde nicht gefunden.";
    //Hallo

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new JoinListener(), this);
        getServer().getPluginManager().registerEvents(new QuitListener(), this);

        getCommand("Invsee").setExecutor(new CMD_Invsee());
        getCommand("Partner").setExecutor(new CMD_Partner());
        getCommand("Website").setExecutor(new CMD_Website());
        getCommand("Ts").setExecutor(new CMD_TS());
        getCommand("Tp").setExecutor(new CMD_TP());
        getCommand("Tpa").setExecutor(new CMD_TPA());
        getCommand("Tpo").setExecutor(new CMD_TPO());
        getCommand("Tpaccept").setExecutor(new CMD_TPAceept());
    }
}
