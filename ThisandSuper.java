
// every class in java extends Object Class
class A extends Object
{
    public A()
    {
        super(); // each constructor has this method by default
        // super method do: Call the constructor of super class
        System.out.println("..in A");
    }
    public A(int n)
    {
        super();
        System.out.println("..in A int");
    }
}

class B extends A{

    public B()
    {
        super();
        System.out.println("..in B");
    }
    public B(int n)
    {
        this();
        System.out.println("..in B int");
    }
}




public class ThisandSuper{
    public static void main(String a[]){
        B obj=new B(5);
    }
}
