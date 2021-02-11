package me.steven1027.shop.ui.shops;

import me.steven1027.shop.utils.Common;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Ores {

    public void openOres(Player player) {
        Inventory inv = Bukkit.createInventory(null, 36, Common.colorize("&a&lOres"));
        player.openInventory(inv);

        Common.buildItem("Coal Ore", 2, inv, 0);
        Common.buildItem("Iron Ore", 3, inv, 1);
        Common.buildItem("Nether Quartz Ore", 4, inv, 2);
        Common.buildItem("Redstone Ore", 3, inv, 3);
        Common.buildItem("Lapis Ore", 3, inv, 4);
        Common.buildItem("Nether Gold Ore", 3, inv, 5);
        Common.buildItem("Gold Ore", 4, inv, 6);
        Common.buildItem("Diamond Ore", 150, inv, 7);
        Common.buildItem("Emerald Ore", 200, inv, 8);
        Common.buildItem("Coal", 1, inv, 10);
        Common.buildItem("Charcoal", 1.5, inv, 11);
        Common.buildItem("Brick", 1, inv, 12);
        Common.buildItem("Iron Ingot", 25, inv, 13);
        Common.buildItem("Netherite Scrap", 100, inv, 14);
        Common.buildItem("Nether Brick", 1, inv, 15);
        Common.buildItem("Netherite Ingot", 1000, inv, 16);
        Common.buildItem("Gold Ingot", 50, inv, 21);
        Common.buildItem("Diamond", 100, inv, 22);
        Common.buildItem("Emerald", 50, inv, 23);

        final ItemStack item = new ItemStack(Material.BARRIER);
        final ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Common.colorize("&c&lBack"));
        item.setItemMeta(meta);
        inv.setItem(31, item);
    }
}
