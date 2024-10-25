/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.encapsulation;

/**
 *
 * @author dell
 */

public class Encapsulation {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("John");
        student.setAge(20);

        System.out.println("Name: " + student.getName()); // Outputs: Name: John
        System.out.println("Age: " + student.getAge());   // Outputs: Age: 20
    }
}
