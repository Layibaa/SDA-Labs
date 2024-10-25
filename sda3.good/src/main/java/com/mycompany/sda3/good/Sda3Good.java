/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sda3.good;

/**
 *
 * @author dell
 */
public class Sda3Good {
 
    public static void main(String[] args) {
        // Create objects for each type of player
        AudioPlayer audioPlayer = new SimpleAudioPlayer();
        VideoPlayer videoPlayer = new SimpleVideoPlayer();

        // Using AudioPlayer
        audioPlayer.playAudio("Beethoven Symphony No.9");
        audioPlayer.pause();
        audioPlayer.stop();

        // Using VideoPlayer
        videoPlayer.playVideo("Inception");
        videoPlayer.pause();
        videoPlayer.stop();
    }
}


