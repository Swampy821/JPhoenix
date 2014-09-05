package com.phoenix;
import org.jibble.pircbot.*;
public class Main {

    public static void main(String[] args) {
        PircBot b = new PircBot() {
            @Override
            protected void onConnect() {
                super.onConnect();
                System.out.println("Connected successfully!");
            }
        };



	// write your code here
    }
}
