package com.foxmula.assignment1;

class Quad //parent class
{
	protected double x1,x2,x3,x4,y1,y2,y3,y4,ht;
	protected void Quad(double x1,double y1,double x2,double y2,double x3,double y3,double x4,double y4)
	{
		this.x1=x1;
		this.x2=x2;
		this.x3=x3;
		this.x4=x4;

		this.y1=y1;
		this.y2=y2;
		this.y3=y3;
		this.y4=y4;
	}

	protected void Quad(double x1,double y1,double x2,double y2,double x3,double y3,double x4,double y4, double ht)
	{
		this.x1=x1;
		this.x2=x2;
		this.x3=x3;
		this.x4=x4;

		this.y1=y1;
		this.y2=y2;
		this.y3=y3;
		this.y4=y4;

		this.ht=ht;
	}
}