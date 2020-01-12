package fr.volax.opalcraftlargage.utils;

import fr.volax.opalcraftlargage.OpalCraftLargagePlugin;
import fr.volax.opalcraftlargage.commands.CommandLargage;


public class Utils {
    public static OpalCraftLargagePlugin instance;
    public static OpalCraftLargagePlugin getInstance() { return instance; }

    public static void loadMain(OpalCraftLargagePlugin instance){
        Security Security = new Security();
        Utils.instance = instance;
        instance.saveDefaultConfig();
        Security.verif();

        instance.getCommand("largage").setExecutor(new CommandLargage());
    }
}
