package fr.volax.opalcraftlargage;

import fr.volax.opalcraftlargage.utils.Utils;
import org.bukkit.plugin.java.JavaPlugin;

public class OpalCraftLargagePlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        Utils.loadMain(this);
    }
}
