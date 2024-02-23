package course.intermediate.topic.thread.inmutable;

import java.awt.*;

public class Circle {
    private double radius;
    private Color color;

    /*
    1. Be sure to delete methods that modify object:
        -seRadius
        -setColor
        -scale (modified)

     2. Vars should be final

     3. Class Color is immutable. But we did a copy for avoid
     the access from outside to our referenced vars.

     Examp:
     getColor() is returning the reference to Object color.
     Resulting a complete access to it.

    Copy: return new Color(color.getRGB());

    Is only for "read only" to get the information but not for
    modified it.

    The same will happen with the Color in constructor.

    4. Avoid extend the class with identifier final  or do each
    constructor "private and factory static methods"

     */

    private Circle(double radius, Color color) {
        this.radius = radius;
        //this.color = color;
        this.color = new Color(color.getRGB());
    }

    /*Private constructor factory*/
    private static Circle create(double radius, Color color){
        return new Circle(radius,color);
    }

    /*public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(Color color) {
        this.color = color;
    }*/

    public double getRadius() {
        return radius;
    }

    public Color getColor() {
        //return color;

        return new Color(color.getRGB());
    }

    public double getDiameter(){
        return this.radius*2;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius,2);
    }
    /*public void scale(double factor){
        radius *=factor;
    }*/

    public Circle scale(double factor){
        return new Circle(radius*factor,color);
    }
}
