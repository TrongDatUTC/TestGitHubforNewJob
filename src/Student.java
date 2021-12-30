public class Student extends Person implements IPerson{
    @Override
    public void speaking() {
        System.out.println("Im students");
    }
    String university;
    public Student(){

    }
    public Student(String name, int age, float height, String university){
        super( name, age, height);
        this.university = university;
    }
    public void getInfor(){
        System.out.println("Name is: " + this.name);
        System.out.println("age is: " + this.age);
        System.out.println("height is: " + this.height);
        System.out.println("University is: " + this.university);
    }
    @Override
    public void eat(){
        System.out.println("My food is rice");
    }

    public static void main(String[] args) {
        Student a  = new Student("Dat", 18, 1.7f, "Transport and comunication");
        a.getInfor();
        a.eat();
        a.speaking();
    }
}
