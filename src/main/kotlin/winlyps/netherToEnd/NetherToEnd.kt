package winlyps.netherToEnd

import org.bukkit.plugin.java.JavaPlugin

class NetherToEnd : JavaPlugin() {

    override fun onEnable() {
        server.pluginManager.registerEvents(NetherToEndEventListener(this), this)
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}