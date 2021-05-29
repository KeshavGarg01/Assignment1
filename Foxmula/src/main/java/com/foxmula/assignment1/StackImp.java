package com.foxmula.assignment1;
import java.util.*;
public class StackImp {
	public void display(Stack st1,Stack st2)
	{
		if(st1.count()==st2.count())
		{
			System.out.println("Total Numbers of Elements in both stack is : " + st2.count());
		}
	}
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		Stack s1=new Stack(20);
		Stack s2=new Stack(20);
		int ch,data;
		StackImp si=new StackImp();
		while(true)
		{
			System.out.println("\n1. Push in Stack 1");
			System.out.println("2. Push in Stack 2");
			System.out.println("3. Pop in Stack 1");
			System.out.println("4. Pop in Stack 1");
			System.out.println("Enter Your Choice : ");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					System.out.println("Enter The Data");
					data=sc.nextInt();
					s1.push(data);
					si.display(s1,s2);
				break;
				case 2:
					System.out.println("Enter The Data");
					data=sc.nextInt();
					s2.push(data);
					si.display(s1,s2);
				break;
				case 3:
					System.out.println(s1.pop());
					si.display(s1,s2);
				break;
				case 4:
					System.out.println(s2.pop());
					si.display(s1,s2);
				break;
				default:
			}
		}
	}

}
