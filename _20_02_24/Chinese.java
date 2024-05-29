package _20_02_24;

public class Chinese implements Person{
    private String name;

    public Chinese(String name)
    {
        this.name = name;
    }

    @Override
    public  String getName(){
        return this.name;
    }
    @Override
    public  String sayHello(){
        return "Hello";
    }

    public void setName(String name) {
        this.name = name;
    }
}
