/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sda2.good;

/**
 *
 * @author dell
 */
public class SmartSpeaker implements MusicPlayer {
    @Override
    public void playMusic(String track) {
        System.out.println("Playing music: " + track);
    }
}