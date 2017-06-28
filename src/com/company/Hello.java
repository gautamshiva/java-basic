package com.company;

/**
 * Created by mohit on 19/6/17.
 */
public class Hello {
}
package com.company;

/**
 * Created by mohit on 19/6/17.
 */
public class Hello {
    int rollno;
    String name;
    void method(int a,String n){
        rollno=a;
        name=n;
    }
    void display(){
        System.out.println(rollno + name)
    }
    class Student4{
        public static void main(){
            Hello i1=new Hello();
            Hello i2=new Hello();
            i1.method(111,"Ram")
            i2.method(45,"Sham")
            i1.display();
            i2.display();


        }


    }



}
