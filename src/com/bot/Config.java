package com.bot;

/**
 * Created by steve on 9/4/14.
 * Config class
 * @TODO Change this to legit config file!
 */
public class Config {
    private static String hostName = "irc.freenode.net";
    private static String nickName = "JPhoeBot";
    private static Boolean messageLog = true;
    private static String logFile = "log.txt";

    private static String[] channels = {
            "##JPhoenix"
    };

    public static String getHostName() {
        return hostName;
    }

    public static String getNickName() {
        return nickName;
    }

    public static String[] getChannels() {
        return channels;
    }

    public static Boolean getMessageLog() { return messageLog; }

    public static String getLogFile() { return logFile; }
}
