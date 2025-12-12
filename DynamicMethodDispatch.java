class Computer
{

}

class Laptop extends Computer
{

}

class A
{
     public void show()
     {
        System.out.println("..in A Show");
     }
}

class B extends A
{
    public void show()
        {
            System.out.println("..in B Show");
        }
}

public class DynamicMethodDispatch
{

    public static void main(String a[])
    {
        A obj = new A(); // it is working
        obj.show();

        // Computer obj1=new Laptop();
        
        obj = new B();
        obj.show();
    }

}