package com.plugins;

import com.bot.Config;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

/**
 * Created by steve on 9/5/14.
 */
public class MessageLog {
    Writer output;
    public void message(String channel, String sender, String message) {
        if(Config.getMessageLog()) {
            System.out.println(channel + " - " + sender + ": " + message);
            logToFile(channel, sender, message);
        }
    }

    private String getTimestamp() {
        java.util.Date date = new java.util.Date();
        return date.toString();
    }

    private void logToFile(String channel, String sender, String message) {
        try{
            output = new BufferedWriter(new FileWriter(Config.getLogFile(), true));
            output.append(getTimestamp() + " - " + channel + " - " + sender + ": " + message + "\n");
            output.close();
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
