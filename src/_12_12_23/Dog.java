package _12_12_23;

public class Dog extends Mammal {
    public void bark(){
        System.out.println("Dog is braking....");
    }

    @Override
    public void eat(String food){
        System.out.println("Eating " + food);
    }

    @Override
    public void walk(){
        System.out.println("walking....");
    }
}
