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

    public void testConflict() {
        System.out.println("ai biet gi dau");
    }

    
    public abstract void speaking();
}
