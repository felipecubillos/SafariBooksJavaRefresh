package com.cubillosa.interfaces;

public class MyCircle implements IShape {

    public static final double S_PI=3.1416;
    private double m_radius;

    public MyCircle(double radius){
        this.m_radius=radius;

    }

    public double getArea(){
        return S_PI*m_radius;
    }

    public double getPerimeter(){
        return S_PI*2*m_radius;
    }
}
