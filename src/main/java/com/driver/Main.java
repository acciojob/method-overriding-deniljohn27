package com.driver;

public class Main {

        B b = new B();
        //System.out.println(b.meth());
}

class A{
    String meth(){
        return "Invoking method from class A";

    }
}
class B extends A{
    String meth(){
        return "Method is overridden in Extendend class B";

    }

}