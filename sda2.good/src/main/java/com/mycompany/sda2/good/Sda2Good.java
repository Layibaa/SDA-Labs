/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sda2.good;

/**
 *
 * @author dell
 */
public class Sda2Good {
 
    public static void main(String[] args) {
        // Create objects for each smart home device
        LightControl light = new SmartLight();
        ThermostatControl thermostat = new SmartThermostat();
        MusicPlayer speaker = new SmartSpeaker();

        // Using SmartLight
        light.turnOn();
        light.turnOff();

        // Using SmartThermostat
        thermostat.setTemperature(22);

        // Using SmartSpeaker
        speaker.playMusic("song 01");
    }
}
