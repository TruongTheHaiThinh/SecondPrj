package iuh.fit.se;


/**
 * @description: 
 * @author: Truong The Hai Thinh
 * @version 1.0
 * @created 1/9/2024
 */
public class Rectangle {
    private double length;
    private double width;
    /**
     * Default constructor
     */
    public Rectangle() {
        this(0.0, 0.0);
    }
    public Rectangle(double length, double width) {
        this.length= length;
        this.width= width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        if (length<0.0)
            throw new IllegalArgumentException("Length must be greater than 0");
        this.length = length;
    }

    /**
     * Description: Set the width of the rectangle
     * @param width The width of the Rectangle
     * @throws IllegalArgumentException if width is less than 0.0
     */
    public void setWidth(double width) {
        if (width <0.0)
            throw new IllegalArgumentException("Width must be greater than 0");
        this.width = width;
    }
    public void setRectangle(double length, double width){
        if (this.length<0.0 || this.width<0.0)
            throw new IllegalArgumentException("Length and width must be greater than 0");
        this.length = length;
        this.width = width;
    }
    public double getArea(){
        return this.length*this.width;
    }
    public double getPerimeter(){
        return (this.length+this.width)*2;
    }
    public String toString() {
        return "Rectangle [length=" + length + ", width=" + width + "]";
    }
}
