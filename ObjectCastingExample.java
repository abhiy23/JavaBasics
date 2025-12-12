class Animal {
    void sound() { System.out.println("Animal sound"); }
}

class Dog extends Animal {
    void sound() { System.out.println("Bark"); }
    void fetch() { System.out.println("Fetching..."); }
}

public class ObjectCastingExample {
    public static void main(String[] args) {
        Animal a = new Dog(); // Upcasting
        a.sound();

        // Downcasting
        if (a instanceof Dog) {
            Dog d = (Dog) a;
            d.fetch();
            // d.sound();
        }
    }
}
