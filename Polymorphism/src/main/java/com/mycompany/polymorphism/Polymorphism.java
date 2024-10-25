/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polymorphism;

/**
 *
 * @author dell
 */
public class Polymorphism{
    public static void main(String[] args) {
        Animal myAnimal; // Reference of type Animal

        myAnimal = new Cat();
        myAnimal.makeSound(); // Outputs: Meow

        myAnimal = new Cow();
        myAnimal.makeSound(); // Outputs: Moo
    }
}
