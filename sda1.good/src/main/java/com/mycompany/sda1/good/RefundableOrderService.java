/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sda1.good;

/**
 *
 * @author dell
 */
public class RefundableOrderService implements RefundableOrder {
    @Override
    public void refundOrder() {
        System.out.println("Refunding order.");
    }
}