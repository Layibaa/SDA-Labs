/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sda2.good;

/**
 *
 * @author dell
 */
public class SmartThermostat implements ThermostatControl {
    @Override
    public void setTemperature(int temperature) {
        System.out.println("Setting temperature to " + temperature + " degrees.");
    }
}