/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sda3.good;

/**
 *
 * @author dell
 */
// Implementation of AudioPlayer interface for audio playback
public class SimpleAudioPlayer implements AudioPlayer {
    @Override
    public void playAudio(String track) {
        System.out.println("Playing audio track: " + track);
    }

    @Override
    public void pause() {
        System.out.println("Pausing audio.");
    }

    @Override
    public void stop() {
        System.out.println("Stopping audio.");
    }
}