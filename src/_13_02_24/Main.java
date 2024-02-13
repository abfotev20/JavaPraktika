package _13_02_24;

public class Main {
    public static void main(String[] args) {
        shout("Ivan", 10);
        shout(10, true);
        shout(10.10, false);


    }

    public static <T, V> void shout(T thingToShout, V secondThingToShout){
        System.out.println(thingToShout + "!!!!" + secondThingToShout + "!!!!");
    }


}
