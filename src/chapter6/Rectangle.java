package chapter6;

/*
 * This BLUEPRINT represents a generalised Rectangle object that
 * can be made more specific in other classes.
 */

// Create some fields and methods inside of Class Rectangle
public class Rectangle {
    // FIELDS or global variables
    private double length;
    private double width;

    // Using Constructors
    // 1. People who don't have a specific length and width of the Rectangle
    public Rectangle(){
        length = 0;
        width = 0;
    }

    // 2. People who have a specific length and width of the Rectangle
    // using Getter and Setter Methods to enable users of the class to set the length and width
    // Getter and Setter Methods for the length

    public Rectangle(double length, double width){
        // Pass it the setter method to set the width-defined below
        // this.length = length (Alternative)
         setLength(length);
         // Pass it the setter method to set the width - defined below
        // this.width = width (Alternative)
         setWidth(width);
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }
    // Getter and Setter Methods for the width
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }

    // METHODS within the object to perform an action
    public double calculatePerimeter(){
        return (2 * length) + (2 * width);
    }
    public double calculateArea(){
        return length * width;
    }
}
