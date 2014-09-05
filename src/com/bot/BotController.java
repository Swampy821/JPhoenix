package com.bot;

import org.jibble.pircbot.PircBot;

/**
 * Created by steve on 9/5/14.
 */
public class BotController {
    PluginController pC;
    public BotController() {
        pC = new PluginController();
    }
    public void processMessage(String channel, String sender, String login, String hostname, String message, PircBot bot) {
         pC.message(channel,sender,login,hostname,message, bot);
    }
}
