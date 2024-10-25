/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.overloading;

/**
 *
 * @author dell
 */

public class OverLoading {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Sum of two numbers: " + calculator.add(5, 10));      // Outputs: 15
        System.out.println("Sum of three numbers: " + calculator.add(5, 10, 15)); // Outputs: 30
    }
}