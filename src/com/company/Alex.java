package com.company;

/**
 * Created by mohit on 19/6/17.
 */
public class Alex {
    void bark(){
        System.out.println("bark");
    }}
    class Buddy extends Alex{void eating(){System.out.println("eating");}
    }
    class Lobo extends Buddy{
        void sleeping(){
            System.out.println("sleeping");
        }
    }
    class All{
        public static void main(String[] args){
            Lobo l=new Lobo();
            l.bark();
            l.eating();
            l.sleeping();
        }
    }
