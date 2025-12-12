class A
{
    public void show1()
    {
        System.out.println("in A show");
    }
}

class B extends A
{
    public void show2()
    {
        System.out.println("in B show");
    }
}

public class TypeCasting
{
    public static void main(String a[])
    {
        A obj = new B(); // UpCasting 
        obj.show1();
        // with obj we cannot call show2(), bcz it has no idea of that method

        B obj1 = (B) obj; // DownCasting
        obj1.show2();
    }
}