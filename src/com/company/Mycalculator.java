package com.company;

/**
 * Created by mohit on 2/6/17.
 */
public class Mycalculator extends Calculator {
    public  int add(int arg1,int arg2) {
        return arg1+arg2;
    }
    public  int subtract( int arg1,int arg2) {
        return arg1-arg2;
    }

public int multiple(int arg1,int arg2)
{
    return arg1 * arg2;
}
public int divide(int arg1,int arg2)
{
    if(arg2==0)
    {
    System.out.println("arguement isnot proper exit it");
    System.exit(-1);
}

         return arg1/arg2;

}

}

