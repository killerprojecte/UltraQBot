package flyproject.ultraqbot

import flyproject.ultraqbot.hook.MiraiHttp
import org.bukkit.plugin.java.JavaPlugin

class UltraQBot : JavaPlugin() {
    override fun onEnable() {
        instance = this
        saveDefaultConfig()
        MiraiHttp.run()
        // Plugin startup logic
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }

    companion object {
        lateinit var instance: UltraQBot
    }
}