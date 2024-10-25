/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.sda2.bad;

/**
 *
 * @author dell
 */
public interface SmartHomeDevice {
    String temp="24C", track="music";
    void turnOn();
    void turnOff();
    void setTemperature(String temp);
    void playMusic(String track);
            }
