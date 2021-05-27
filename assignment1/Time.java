package com.foxmula.assignment1;

public class Time {
	private int hrs, mns, sc; //private members of class TEMP
    Time(int h, int m, int s) // paramaterized constructor
    { 
        hrs=h; 
        mns=m; 
        sc=s; 
    }
    Time() //constructor for initialisation
    {            
        hrs=0; mns=0; sc=0;        
    } 
    public Time add(Time obj) // Time type function with class object passed as parameter
    {
        Time t=new Time(); // creating object of class TIME, t
        t.sc= this.sc + obj.sc; // this.sc represents the sc form the object that called the add function i.e "sc of t1", obj.sc contains the sconds of object passed
        if(t.sc>60) 
        {
            t.sc -=60; // converting sconds into mnsutes
            t.mns++; 
        }
                    
        t.mns+= this.mns + obj.mns; 

        if(t.mns>60) // converting minutes into hrss
            t.mns++; 
        {
            t.mns -=60; t.hrs++; 
        }

        t.hrs += this.hrs + obj.hrs; 

        if(t.hrs>24)
        {
            t.hrs -=24; 
                     
        }
        
        return t;
    }
            
    void display(String str) 
    {
        System.out.println(str +" " + hrs + "/"+mns+"/" + sc); 
    }

    public static void main(String []args) 
    {
        Time t5=new Time(5,23,12); //object 1
        Time t2=new Time(6,38,50); //object 2
        Time t3=t2.add(t5); //object 3 containg sum of previous 2 objects, calls add function (items indicated by this conatins values of t2 and items indicated by obj contains values of t5)
        t5.display("T1 -");
        t2.display("T2 -"); 
        t3.display("T3 (T1+T2) -" ); 
    }

}
