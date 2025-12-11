import tools.Calculator;
import tools.AdvCalc;

public class MyPackages
{
    public static void main(String a[])
    {
        Calculator cal = new Calculator();

        AdvCalc p=new AdvCalc();

        double r=p.power(4,3);
        int r1=cal.add(4, 5);

        System.out.println(r1+ " Power: "+ r);

    }
}