
class A
{
    public void show()
    {
        System.out.println("..in A ..show ");
    }
    public void config()
    {
        System.out.println("..in A Config ");
    }
}


class B extends A
{
    @Override
    public void show()
    {
        System.out.println(".. Show in B");
    }

    // 

}

public class MethodOverriding
{
    public static void main(String a[])
    {
        B obj = new B();
        obj.show();
        obj.config();
    }
}