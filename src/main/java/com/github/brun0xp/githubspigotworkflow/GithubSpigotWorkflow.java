package com.github.brun0xp.githubspigotworkflow;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public final class GithubSpigotWorkflow extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getLogger().log(Level.INFO, "Plugin started! say /hi");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.sendMessage("Hello");
        return true;
    }
}
