class Human
{
    private int age;
    private String name;
    
    // public int getAge(){
    //     return age;
    // }
    // public void setAge(int a){
    //     age=a;
    // }

    // public String getName(){
    //     return name;
    // }
    // public void setName(String n){
    //     name=n;
    // }

    public int getAge() {
        return age;
    }

    // public void setAge(int age, Human obj){
    //     Human obj1=obj; // here we are creating new object 
    //     obj1.age=age; // here we want to change the value of instance variable
    // }
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


public class ThisKeyword
{
    public static void main(String[] args) {
        
        Human obj=new Human();
        // obj.age=11;
        // obj.name="Reddy";
        // obj.setAge(30, obj);

        obj.setAge(33);
        obj.setName("Reddy");

        System.out.println(obj.getName()+" : "+obj.getAge());

    }
}