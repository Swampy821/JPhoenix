package com.bot;
import com.plugins.*;
import org.jibble.pircbot.PircBot;
/**
 * Created by steve on 9/5/14.
 */
public class PluginController {
    MessageLog MessageLog;
    Admin Admin;
    public PluginController() {
        MessageLog = new MessageLog();
        Admin = new Admin();
    }
    public void message(String channel, String sender, String login, String hostname, String message, PircBot bot) {
        MessageLog.message(channel, sender, message);
        Admin.message(channel, sender, message, bot);
    }
}
