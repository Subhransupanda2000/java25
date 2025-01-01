package org.example.innerclass.normalinnerclass;

public class Example2 {
    int x=10;
    static int y=5;
    class inner{
        public void m1()
        {
            System.out.println("inner class");
            System.out.println(x);
            System.out.println(y);
        }
    }
}
class Demo9{
    public static void main(String[] args) {
       new Example2(). new inner().m1();
    }
}
