/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sda2.good;

/**
 *
 * @author dell
 */

public class SmartLight implements LightControl {
    @Override
    public void turnOn() {
        System.out.println("Turning on the light.");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off the light.");
    }
}