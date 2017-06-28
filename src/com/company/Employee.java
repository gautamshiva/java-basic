package com.company;

public class Employee {
    float salary;
}
class Programmer extends Employee{
       int bonus;
        public static void main(String[] args){
        Programmer p=new Programmer();
        System.out.println(p.salary);
        System.out.println(p.bonus);
        }
        }