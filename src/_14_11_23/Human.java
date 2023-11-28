package _14_11_23;

import java.util.Collections;
import java.util.List;

public class Human {
    protected String name;
    private int age;

    public List<String> getCars() {
        return Collections.unmodifiableList(cars);
    }

    private List<String> cars;
    public Human(String name, int age){
        this.name = name;
        this.age = age;

    }

    public List<String> addCar(String car){
        return Collections.unmodifiableList(cars);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getAge(String name) {
        return age;
    }


    private void SetAge(int age) throws IllegalAccessException {
        if(age < 0){
            throw new IllegalAccessException();
        }
        this.age = age;
    }
}