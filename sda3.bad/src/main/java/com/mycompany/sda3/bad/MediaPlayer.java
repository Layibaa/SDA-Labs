/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.sda3.bad;

/**
 *
 * @author dell
 */
// A single interface for all media player functionalities
public interface MediaPlayer {
    void playAudio(String track);
    void playVideo(String video);
    void pause();
    void stop();
}