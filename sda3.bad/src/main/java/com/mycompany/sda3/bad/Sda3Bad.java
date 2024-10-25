/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sda3.bad;

/**
 *
 * @author dell
 */
public class Sda3Bad {

    public static void main(String[] args) {
        MediaPlayer obj= new AudioPlayer();
        obj.playAudio("song 3");
        obj.pause();
        obj.playVideo("video 01");
        obj.stop();
    }
}


