package org.example.innerclass.normalinnerclass;
class Outer
{
    class Inner
    {
        public void methodOne(){
            System.out.println("inner class method");
        }
    }
    public void methodtwo(){
        System.out.println("outer class method");
        Inner i=new Inner();
        i.methodOne();
    }
    public static void main(String[] args)
    {
        Outer o=new Outer();
        o.methodtwo();
    }
}