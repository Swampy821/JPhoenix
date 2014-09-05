package com.bot;
import org.jibble.pircbot.PircBot;
/**
 * Created by steve on 9/4/14.
 */
public class Bot {
    PircBot bot = new PircBot() {
        @Override
        protected void onConnect() {
            System.out.println("Bot connected successfully!")
            super.onConnect();
        }
    };

    public void connect() {

    }

}
