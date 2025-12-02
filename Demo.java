class Calculator
{
    // variables
    int num=5;

    // methods
    public int add(int num1, int num2){
        int r = num1+num2;
        return r;
    }

    public int add(int n1, int n2, int n3){
        int r = n1+n2+n3;
        return r;
    }

    public double add(double n1, double n2){
        return n1+n2;
    }
    
}


public class Demo {
    public static void main(String[] args) {
        int num1=4;
        int num2=5;
        
        // craeting object
        // Calculator calc= new Calculator();
        // int result = calc.add(num1,num2);
        // int result=num1+num2;

        // method Overloading
        // we can define methods with same name but, pass the diff parameters or datatype.

        // var r=calc.add(3,4.5);

        Calculator obj = new Calculator();
        Calculator obj1 = new Calculator();

        obj.num=8; // it will change the value of num from 5 to 8
        // Everytime when we make object it takes new memory space in Heap memory

        System.out.println(obj.num);
        System.out.println(obj1.num);

    }    
}
