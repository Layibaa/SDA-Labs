/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sda2.bad;

/**
 *
 * @author dell
 */
public class Sda2Bad {

    public static void main(String[] args) {
       SmartHomeDevice obj = new SmartLight();
       obj.playMusic(obj.track);
       obj.setTemperature(obj.temp);
       obj.turnOn();
       obj.turnOff();
       
    }
}
