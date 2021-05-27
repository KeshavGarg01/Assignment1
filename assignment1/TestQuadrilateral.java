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

class Rec extends Quad
{
	Rec(double x1,double y1,double x2,double y2,double x3,double y3,double x4,double y4)
	{
		super.Quad(x1,y1,x2,y2,x3,y3,x4,y4);
	}
	double area()
	{
		double d1=(double)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		double d2=(double)Math.sqrt((x1-x4)*(x1-x4)+(y1-y4)*(y1-y4));
		return d1*d2;
	}
}
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

class Parallelogram extends Quad
{
	//private double ht;
	Parallelogram(double x1,double y1,double x2,double y2,double x3,double y3,double x4,double y4,double ht)
	{
		super.Quad(x1,y1,x2,y2,x3,y3,x4,y4,ht);
		//this.ht=ht;
	}
	double area()
	{
		double d1=(double)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		return d1*ht;
	}
}
public class TestQuadrilateral {
	public static void main(String []args)
	{
		Sq s=new Sq(10,10,20,10,20,20,10,20);
		Rec r=new Rec(10,10,30,10,30,20,10,20);
		Parallelogram para=new Parallelogram(10,10,30,10,20,20,0,20,8);
		Trapezoid trap=new Trapezoid(10,10,30,10,40,20,0,20,8);


		System.out.println("Area Of The Sq is " + s.area());	
		System.out.println("Area Of The Rec is " + r.area());
		System.out.println("Area Of The Parallelogram is " + para.area());
		System.out.println("Area Of The Trapezoid is " + trap.area());
	}

}
