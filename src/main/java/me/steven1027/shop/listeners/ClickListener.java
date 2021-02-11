package me.steven1027.shop.listeners;

import me.steven1027.shop.ui.Main;
import me.steven1027.shop.ui.QuantitySelector;
import me.steven1027.shop.ui.shops.*;
import me.steven1027.shop.utils.Common;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class ClickListener implements Listener {

    private String price, material;
    private int amount;
    private Inventory inv;
    private Player player;

    @EventHandler
    public void onClick(InventoryClickEvent event) {
        player = (Player) event.getWhoClicked();

        if (event.getView().getTitle().equalsIgnoreCase(Common.colorize("&a&lShop"))) {
            event.setResult(Event.Result.DENY);

            if (event.getSlot() == 11)
                new MobDrops().openMobDrops(player);

            if (event.getSlot() == 12)
                new Food().openFood(player);

            if (event.getSlot() == 13)
                new Blocks().openBlocks(player);

            if (event.getSlot() == 14)
                new Ores().openOres(player);

            if (event.getSlot() == 15)
                new Valuables().openValuables(player);
        }

        if (event.getView().getTitle().equalsIgnoreCase(Common.colorize("&a&lMob Drops"))
                || event.getView().getTitle().equalsIgnoreCase(Common.colorize("&a&lFood"))
                || event.getView().getTitle().equalsIgnoreCase(Common.colorize("&a&lBlocks"))
                || event.getView().getTitle().equalsIgnoreCase(Common.colorize("&a&lOres"))
                || event.getView().getTitle().equalsIgnoreCase(Common.colorize("&a&lValubles"))) {

            event.setResult(Event.Result.DENY);

            if (event.getCurrentItem() == null) {
                return;
            }

            if (event.getCurrentItem().getType() == Material.BARRIER) {
                new Main().openMain(player);
                return;
            }

            price = "";
            for (String lore : event.getCurrentItem().getItemMeta().getLore()) {
                lore = ChatColor.stripColor(lore);
                String[] priceParts = lore.split("\\$");
                price = priceParts[1];
            }
            material = ChatColor.stripColor(event.getCurrentItem().getItemMeta().getDisplayName());
            inv = event.getClickedInventory();
            new QuantitySelector().openQuantitySelector(player);
        }

        if (event.getView().getTitle().equalsIgnoreCase(Common.colorize("&a&lSelect Quantity"))) {
            event.setResult(Event.Result.DENY);

            if (event.getCurrentItem() == null) {
                return;
            }

            if (event.getCurrentItem().getType() == Material.BARRIER) {
                player.openInventory(inv);
                return;
            }

            if (event.getCurrentItem().getType() == Material.YELLOW_STAINED_GLASS_PANE) {
                amount = 1;
                Common.sellItem(amount, material, Double.parseDouble(price), player);
            }

            if (event.getCurrentItem().getType() == Material.ORANGE_STAINED_GLASS_PANE) {
                amount = 16;
                Common.sellItem(amount, material, Double.parseDouble(price), player);
            }

            if (event.getCurrentItem().getType() == Material.RED_STAINED_GLASS_PANE) {
                amount = getAmount(player, new ItemStack(Material.matchMaterial(material)));
                Common.sellItem(amount, material, Double.parseDouble(price), player);
            }
        }
    }

    private int getAmount(Player player, ItemStack item) {
        if (item == null)
            return 0;
        int amount = 0;
        for (int i = 0; i < 36; i++) {
            ItemStack slot = player.getInventory().getItem(i);
            if (slot == null || !slot.isSimilar(item))
                continue;
            amount += slot.getAmount();
        }
        return amount;
    }
}
