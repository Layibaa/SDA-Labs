/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7;


public class DatabaseConnectionManager {
    private static DatabaseConnectionManager ConnectionInstance;
    
    private DatabaseConnectionManager(){
        
    }
    public static DatabaseConnectionManager getInstance(){
        if (ConnectionInstance== null){
            ConnectionInstance =new DatabaseConnectionManager ();
        }
    return ConnectionInstance;
}
        public void executeQuery(String query) {

        System.out.println("Executing query: " + query);
    }
}
