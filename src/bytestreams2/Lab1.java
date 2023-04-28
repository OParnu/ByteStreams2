/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bytestreams2;

/**
 *
 * @author Student
 */
public class Lab1 {
        public static void main(String[] args) {
        Circle circle = new Circle();
        //Shape
        RedShapeDecorator circleDecorator = new RedShapeDecorator(circle);
        //Border
        circleDecorator.draw();
        
        System.out.println("");
        
        Rectangle rectangle = new Rectangle();
        RedShapeDecorator RecDecorator = new RedShapeDecorator(rectangle);
        RecDecorator.draw();
    }
}
