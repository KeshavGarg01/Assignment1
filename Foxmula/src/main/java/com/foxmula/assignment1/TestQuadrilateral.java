package com.foxmula.assignment1;

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
