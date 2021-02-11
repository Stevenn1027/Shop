package me.steven1027.shop.ui.shops;

import me.steven1027.shop.utils.Common;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Blocks {

    public void openBlocks(Player player) {
        final Inventory inv = Bukkit.createInventory(null, 36, Common.colorize("&a&lBlocks"));
        player.openInventory(inv);

        Common.buildItem("Grass Block", 1, inv, 0);
        Common.buildItem("Dirt", 0.5, inv, 1);
        Common.buildItem("Podzol", 1, inv, 2);
        Common.buildItem("Mycelium", 1, inv, 3);
        Common.buildItem("Stone", 0.5, inv, 4);
        Common.buildItem("Cobblestone", 0.5, inv, 5);
        Common.buildItem("Stone Bricks", 1, inv, 6);
        Common.buildItem("Mossy Stone Bricks", 2, inv, 7);
        Common.buildItem("Cracked Stone Bricks", 2, inv, 8);
        Common.buildItem("Chiseled Stone Bricks", 2, inv, 9);
        Common.buildItem("Oak Log", 2, inv, 10);
        Common.buildItem("Spruce Log", 2, inv, 11);
        Common.buildItem("Jungle Log", 2, inv, 12);
        Common.buildItem("Birch Log", 2, inv, 13);
        Common.buildItem("Acacia Log", 2, inv, 14);
        Common.buildItem("Dark Oak Log", 2, inv, 15);
        Common.buildItem("Sandstone", 0.5, inv, 16);
        Common.buildItem("Cut Sandstone", 1, inv, 17);
        Common.buildItem("Chiseled Sandstone", 1, inv, 18);
        Common.buildItem("Quartz Block", 1.5, inv, 19);
        Common.buildItem("Smooth Quartz", 2, inv, 20);
        Common.buildItem("Sand", 0.5, inv, 21);
        Common.buildItem("Netherrack", 0.5, inv, 22);
        Common.buildItem("Nether Bricks", 1, inv, 23);
        Common.buildItem("Glowstone", 1, inv, 24);
        Common.buildItem("Soul Sand", 1, inv, 25);
        Common.buildItem("End Stone", 1, inv, 26);

        final ItemStack item = new ItemStack(Material.BARRIER);
        final ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Common.colorize("&c&lBack"));
        item.setItemMeta(meta);
        inv.setItem(31, item);
    }
}
