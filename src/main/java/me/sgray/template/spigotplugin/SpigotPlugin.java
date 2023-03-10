package me.sgray.template.spigotplugin;

import me.sgray.template.spigotplugin.handlers.EntityDamageByEntityHandler;
import me.sgray.template.spigotplugin.handlers.ProjectileLaunchHandler;
import org.bukkit.plugin.java.JavaPlugin;

public class SpigotPlugin extends JavaPlugin {

    public static String armor;

    @Override
    public void onDisable() {
    }

    @Override
    public void onEnable() {
        armor = "\u26a1";
        new ProjectileLaunchHandler(this);
        new EntityDamageByEntityHandler(this);
    }
}
