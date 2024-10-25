/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sda2.bad;

/**
 *
 * @author dell
 */
public class SmartLight implements SmartHomeDevice {
   
           
    @Override
    public void turnOn() {
        System.out.println("Turning on the light.");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off the light.");
    }

    @Override
    public void setTemperature(String temp) { 
       System.out.println("Setting temperature to"+temp);
    }

    @Override
    public void playMusic(String track) {
         System.out.println("Setting track to"+track);
    }
}

