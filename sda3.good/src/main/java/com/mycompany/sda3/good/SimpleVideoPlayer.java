/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sda3.good;

/**
 *
 * @author dell
 */
// Implementation of VideoPlayer interface for video playback
public class SimpleVideoPlayer implements VideoPlayer {
    @Override
    public void playVideo(String video) {
        System.out.println("Playing video: " + video);
    }

    @Override
    public void pause() {
        System.out.println("Pausing video.");
    }

    @Override
    public void stop() {
        System.out.println("Stopping video.");
    }
}