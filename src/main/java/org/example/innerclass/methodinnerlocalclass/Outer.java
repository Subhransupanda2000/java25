package org.example.innerclass.methodinnerlocalclass;

public class Outer {
    int x = 100;
    static int y = 1000;
    public void m1() {

        class inner {
            public void m2() {
                System.out.println("m2");
                System.out.println(x);
                System.out.println(y);
            }
        }
        inner i = new inner();
        i.m2();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.m1();
    }
}
