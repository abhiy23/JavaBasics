public class Wrapper {
    public static void main(String[] args) {
        // Autoboxing: primitive to object
        int num = 10;
        Integer obj = num; // Automatically converts int to Integer

        // Unboxing: object to primitive
        int value = obj; // Automatically converts Integer to int

        // Using wrapper class methods
        String strNum = "25";
        int parsed = Integer.parseInt(strNum); // String to int
        double dbl = obj.doubleValue(); // Integer to double

        // Display results
        System.out.println("Autoboxed Integer: " + obj);
        System.out.println("Unboxed int: " + value);
        System.out.println("Parsed int from String: " + parsed);
        System.out.println("Integer as double: " + dbl);
    }
}
