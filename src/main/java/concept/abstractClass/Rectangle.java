/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concept.abstractClass;

/**
 *
 * @author USER
 */
 class Rectangle extends Shape{

    @Override
    void draw() {
        System.out.println("concept.abstractClass.Rectangle.draw()");
    
    }

    @Override
    void color() {
        System.out.println("concept.abstractClass.Rectangle.color()");
    }
    
}
