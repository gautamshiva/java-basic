package com.company;

/**
 * Created by mohit on 3/6/17.
 */
public class Scalculator extends Calculator {
    public  int add(int arg1,int arg2) {
        return arg1+arg2;
    }
    public  int subtract( int arg1,int arg2) {
        return arg1-arg2 ;

    }

    public int multiple(int arg1,int arg2){
        return arg1 * arg2;
    }
    public int divide(int arg1,int arg2) {
        int res = 0;
        try {
            res= arg1 / arg2;
        } catch (ArithmeticException sh) {
            System.out.println("This is caught");
           // sh.printStackTrace();
            System.exit(0);
        }
    return res;

    }


}



