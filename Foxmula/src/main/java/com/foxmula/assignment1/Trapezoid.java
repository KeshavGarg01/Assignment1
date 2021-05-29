package com.foxmula.assignment1;

class Trapezoid extends Quad
{
	//private double ht;
	Trapezoid(double x1,double y1,double x2,double y2,double x3,double y3,double x4,double y4, double ht)
	{
		super.Quad(x1,y1,x2,y2,x3,y3,x4,y4,ht);
		//this.ht=ht;
	}
	double area()
	{
		double d1=(double)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		double d2=(double)Math.sqrt((x3-x4)*(x3-x4)+(y3-y4)*(y3-y4));
		return (double)((d1+d2)*ht)/2;
	}
}