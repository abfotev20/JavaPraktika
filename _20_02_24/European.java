package _28_11_23;

public class European implements Person{

    private String name;

    public European(String name)
    {
        this.name = name;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String sayHello() {
        return "Hello";
    }
}
