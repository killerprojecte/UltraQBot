package flyproject.ultraqbot

import org.bukkit.plugin.java.JavaPlugin

class UltraQBot : JavaPlugin() {

    lateinit var instance: UltraQBot
    override fun onEnable() {
        instance = this
        // Plugin startup logic
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}