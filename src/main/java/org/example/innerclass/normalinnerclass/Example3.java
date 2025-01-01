package org.example.innerclass.normalinnerclass;


public class Example3 {
    int x=10;
    class inner{
        int x=11;
        public void m1()
        {
            int x=13;
            System.out.println("inner class");
            System.out.println(x);
            System.out.println(this.x);
            System.out.println(Example3.this.x);
        }
    }
}
class Demo8{
    public static void main(String[] args) {
        new Example3(). new inner().m1();
    }
}

