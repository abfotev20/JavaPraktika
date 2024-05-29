package _20_02_24;

public class Bulgarian implements Person{
    private String name;

    public Bulgarian(String name)
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
