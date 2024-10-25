 
package com.mycompany.sda1.good;
 
public class Sda1Good {

    public static void main(String[] args) {
        // Create objects using interfaces
        OrderProcessor obj1 = new StandardOrderService();
        TrackableOrder obj2 = new StandardOrderService();
        RefundableOrder obj3= new RefundableOrderService();
        // Using OrderProcessor methods
        obj1.processOrder();
        obj1.cancelOrder();

        // Using TrackableOrder method
        obj2.trackOrder();
        
        obj3.refundOrder();
    }
}
