
public class InheritanceCalc {
    // we are trying to make the calculator which has basic an dadvance feature seperatly
    public static void main(String[] args) {
        
        // Calc c = new Calc();
        // AdvCalc ac = new AdvCalc(); // this show ths single inheritance

        // Multi level inheritance
        VeryAdvCalc ac=new VeryAdvCalc();


        int r1=ac.sum(5, 12);
        int r2=ac.sub(24, 13);
        int r3=ac.multi(4, 5);
        int r4=ac.div(40, 5);
        double r5=ac.power(4, 3);

        System.out.println("Sum: "+r1+" Sub: "+r2+" Multi: "+r3+" Div: "+r4+" power: "+r5);
        
    }
}
