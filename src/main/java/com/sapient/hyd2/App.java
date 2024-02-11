package com.sapient.hyd2;

import com.sapient.hyd2.shapes.Rectangle;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Rectangle r = new Rectangle(1.5,2.5);
        System.out.println(r.area());
    }
}
