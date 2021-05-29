package com.foxmula.assignment1;

class Sq extends Quad
{
	Sq(double x1,double y1,double x2,double y2,double x3,double y3,double x4,double y4)
	{
		super.Quad(x1,y1,x2,y2,x3,y3,x4,y4);
	}
	double area()
	{
		double d=(double)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		return d*d;
	}
}