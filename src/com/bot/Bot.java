package com.bot;
import org.jibble.pircbot.PircBot;
import com.bot.Config;
/**
 * Created by steve on 9/4/14.
 */
public class Bot {
    String hostName = Config.getHostName();
    PircBot bot;
    BotController BC;
    public Bot() {
        BC = new BotController();
        bot = new PircBot() {
            @Override
            protected void onConnect() {
                System.out.println("Bot successfully connected to " + hostName + "!");
                super.onConnect();
            }

            @Override
            protected void onMessage(String channel, String sender, String login, String hostname, String message) {
                super.onMessage(channel, sender, login, hostname, message);
                BC.processMessage(channel,sender,login,hostname,message, bot);
                //printMessage(channel, sender, message);
            }
        };
    }
    private void printMessage(String channel, String sender, String message) {
        System.out.println(channel + " " + sender + " " + message);
    }
    private void setNickName() {
        bot.changeNick(Config.getNickName());
    }
    public void joinChannels() {
        String[] channels = Config.getChannels();
        for(int i=0; i < channels.length ; i++) {
            bot.joinChannel(channels[i]);
        }
    }
    public void connect() {
        try{
            bot.setAutoNickChange(true);
            bot.connect(hostName);
            setNickName();
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void sendMessage(String channel, String message) {
        bot.sendMessage(channel, message);
    }

}

