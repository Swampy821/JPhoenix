package com.plugins;

import com.bot.Bot;
import com.bot.Config;
import org.jibble.pircbot.PircBot;

/**
 * Created by steve on 9/5/14.
 */
public class Admin {

    public void message(String channel, String sender, String message, PircBot bot) {
        if(message.equals(Config.getNickName() + ": die")) {
            die(channel, bot);
        }
    }

    private void die(String channel, PircBot bot) {
        bot.disconnect();
        System.exit(0);
    }




}
