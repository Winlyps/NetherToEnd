package winlyps.netherToEnd
import org.bukkit.World
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerPortalEvent
import org.bukkit.plugin.java.JavaPlugin

class NetherToEndEventListener(private val plugin: JavaPlugin) : Listener {

    @EventHandler
    fun onPlayerPortal(event: PlayerPortalEvent) {
        val player = event.player
        val world = player.world
        if (world.environment == World.Environment.NORMAL) {
            val endWorld = plugin.server.getWorld("world_the_end") ?: return
            val endSpawn = endWorld.spawnLocation
            event.setTo(endSpawn)
        }
    }
}