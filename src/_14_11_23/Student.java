package _14_11_23;

public class Student  extends Human{
    public Student(String name, int age) {
        super(name, age);
    }

    public void Test(){
        super.name = "Yordan";
    }
}
