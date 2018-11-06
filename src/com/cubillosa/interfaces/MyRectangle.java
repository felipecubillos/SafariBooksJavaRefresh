package com.cubillosa.interfaces;

public class MyRectangle implements IShape{

    private double m_lenght;
    private double m_breadth;

    public MyRectangle(double lenght, double breadth){
        this.m_lenght = lenght;
        this.m_breadth = breadth;
    }


    public double getArea() {
        return m_breadth*m_lenght;
    }

    public double getPerimeter() {
        return 2*(m_lenght+m_breadth);
    }
}
