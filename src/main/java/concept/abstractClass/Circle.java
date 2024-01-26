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
 class Circle extends Shape{

    @Override
    void draw() {
        System.out.println("concept.abstractClass.Circle.draw()");
    }

    @Override
    void color() {
        System.out.println("concept.abstractClass.Circle.color()");
    }

    @Override
    void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
      
}
