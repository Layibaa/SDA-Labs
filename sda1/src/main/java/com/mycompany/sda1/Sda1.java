/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sda1;

public class Sda1 {

    public static void main(String[] args) {
        OrderService obj= new StandardOrderService();
        obj.processOrder();
        obj.cancelOrder();
        obj.refundOrder();
        obj.trackOrder();
    }
}
