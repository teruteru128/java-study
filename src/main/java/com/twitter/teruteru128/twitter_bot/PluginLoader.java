package com.twitter.teruteru128.twitter_bot;

import java.util.ArrayList;

import com.twitter.teruteru128.twitter_bot.plugin.TwitterPlugin;

/**
 * @author 
 *
 */
public class PluginLoader {
    private static PluginLoader loader = new PluginLoader();

    private PluginLoader() {
    }

    public static PluginLoader getInstance() {
        return loader;
    }
    public ArrayList<? extends TwitterPlugin> getPlugins(){
        ArrayList<? extends TwitterPlugin> re =new ArrayList<>();
        return re;
    }
}
