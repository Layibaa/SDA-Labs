/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab7; 
public class Lab7 { 
    
    public static void main(String[] args) {
        // TODO code application logic here
        DatabaseConnectionManager dbManager1 = DatabaseConnectionManager.getInstance();
        dbManager1.executeQuery("SELECT * FROM users");

       DatabaseConnectionManager dbManager2 = DatabaseConnectionManager.getInstance();
        dbManager2.executeQuery("SELECT * FROM products");

        if (dbManager1 == dbManager2) {
            System.out.println("dbManager1 and dbManager2 refer to the same instance.");
        } else {
            System.out.println("Different instances.");

    }
    }
}