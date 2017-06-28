package com.company;

/**
 * Created by mohit on 9/6/17.
 */
public class Ifelseif {
    public static void main(String args[]) {
        int marks = 100;
        if (marks < 50) {
            System.out.println("fail");
        }
        else if(marks >50)
        {
            System.out.println("pass");

        }
        else if(marks >70) {
            System.out.println("B grade");

        }
        else if(marks > 90) {
            System.out.println("A grade");
        }


    }

}