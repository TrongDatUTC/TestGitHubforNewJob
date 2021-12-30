public abstract class Person {
    String name;
    int age;
    float height;
    public Person(){
    }
    public Person(String name, int age, float height){
        this.name = name;
        this.age= age;
        this.height = height;
    }
    public testConflict(){
    }
    
    public abstract void speaking();
}
