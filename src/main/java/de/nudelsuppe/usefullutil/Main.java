package de.nudelsuppe.usefullutil;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    public Main instance;

    @Override
    public void onEnable() {
        instance = this;
        System.out.println("[Builder] Plugin Started");

    }

    @Override
    public void onDisable() {
        System.out.println("[Builder] Plugin Started");

    }
}
