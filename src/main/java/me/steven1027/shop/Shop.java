package me.steven1027.shop;

import me.steven1027.shop.commands.ShopCommand;
import me.steven1027.shop.listeners.ClickListener;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.Bukkit;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

public class Shop extends JavaPlugin {

    private static Shop instance = null;
    private static Economy economy = null;

    @Override
    public void onEnable() {
        super.getConfig().options().copyDefaults(true);
        super.saveDefaultConfig();
        super.getCommand("shop").setExecutor(new ShopCommand());

        Bukkit.getPluginManager().registerEvents(new ClickListener(), this);
        instance = this;
    }

    @Override
    public void onDisable() {

    }

    private boolean setupEconomy() {
        if (getServer().getPluginManager().getPlugin("Vault") == null)
            return false;

        final RegisteredServiceProvider<Economy> rsp = getServer().getServicesManager().getRegistration(Economy.class);
        if (rsp == null)
            return false;

        economy = rsp.getProvider();
        return economy != null;
    }

    public static Economy getEconomy() {
        return economy;
    }

    public static Shop getInstance() {
        return instance;
    }
}
