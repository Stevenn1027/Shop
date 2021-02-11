package me.steven1027.shop.ui.shops;

import me.steven1027.shop.utils.Common;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class MobDrops {

    public void openMobDrops(Player player) {
        final Inventory inv = Bukkit.createInventory(null, 27, Common.colorize("&a&lMob Drops"));
        player.openInventory(inv);

        Common.buildItem("Scute", 500, inv, 1);
        Common.buildItem("Prismarine Crystals", 150, inv, 2);
        Common.buildItem("Prismarine Shard", 150, inv, 3);
        Common.buildItem("Bone", 10, inv, 4);
        Common.buildItem("Nautilus Shell", 500, inv, 5);
        Common.buildItem("Ink Sac", 15, inv, 6);
        Common.buildItem("Sugar", 1, inv, 7);
        Common.buildItem("Ender Pearl", 50, inv, 11);
        Common.buildItem("Gunpowder", 2, inv, 12);
        Common.buildItem("Feather", 2, inv, 13);
        Common.buildItem("Blaze Rod", 10, inv, 14);
        Common.buildItem("String", 2, inv, 15);

        final ItemStack item = new ItemStack(Material.BARRIER);
        final ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Common.colorize("&c&lBack"));
        item.setItemMeta(meta);
        inv.setItem(22, item);
    }
}
