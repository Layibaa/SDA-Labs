/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sda1.good;

/**
 *
 * @author dell
 */

public class StandardOrderService implements OrderProcessor, TrackableOrder {
    @Override
    public void processOrder() {
        System.out.println("Processing standard order.");
    }

    @Override
    public void cancelOrder() {
        System.out.println("Canceling standard order.");
    }

    @Override
    public void trackOrder() {
        System.out.println("Tracking standard order.");
    }
}
