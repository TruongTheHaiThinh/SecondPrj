package iuh.fit.se;


/**
 * @description: 
 * @author: Truong The Hai Thinh
 * @version 1.0
 * @created 1/9/2024
 */
public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1= new Rectangle(20.5,10);
        Rectangle r2= new Rectangle(2,3);
        System.out.println("Length: " +r1.getLength());
        System.out.println("Width: " + r1.getWidth());

        System.out.println("Area r1: " + r1.getArea());
        System.out.println("Perimeter r2: " + r2.getPerimeter());

        System.out.println(r1.toString());
    }
}
