class Human
{
    private int age;
    private String name;

    // constructor: dont specify the return Type & Name as Class name
    // everytime we make new object it calls constuctor by default
    // while writing the database connection code we can write it in constructor
    public Human(){
        age=25;
        name="AbhiY";
    }

    // parameterized construcor
    public Human(int a, String n){
        age=a;
        name=n;
    }

    // Getter and Setter
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Constructor {
    public static void main(String[] args) {
        System.out.println("Constructor...");

        // it creates object in heap memory with defalt values: 0 & null
        Human obj=new Human();
        Human obj1=new Human(55,"Jhon");
        System.out.println(obj.getName()+" : "+ obj.getAge());
        System.out.println(obj1.getName()+" : "+ obj1.getAge());

        // here we get the deafult value , can we set the default value?
        // Yes, Using constructor we can set the default value to the instance varialbe

        //---------------------
        // What constructor Over Loading
        //---------------------------



    }
}
